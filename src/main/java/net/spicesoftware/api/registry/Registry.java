package net.spicesoftware.api.registry;

import net.spicesoftware.api.Builder;
import net.spicesoftware.api.image.CachedImage;
import net.spicesoftware.api.image.Image;
import net.spicesoftware.api.image.ImageConverter;
import net.spicesoftware.api.image.blender.ImageBlender;
import net.spicesoftware.api.image.blender.property.ImageBlenderProperty;
import net.spicesoftware.api.image.gs.CachedGrayScale8Image;
import net.spicesoftware.api.image.gs.EditableGrayScale8Image;
import net.spicesoftware.api.image.rgb.CachedRGB24Image;
import net.spicesoftware.api.image.rgb.EditableRGB24Image;
import net.spicesoftware.api.image.rgba.CachedRGBA32Image;
import net.spicesoftware.api.image.rgba.EditableRGBA32Image;
import net.spicesoftware.api.render.Renderable;
import net.spicesoftware.api.render.Renderer;
import net.spicesoftware.api.util.AlreadyRegisteredInRegistryException;
import net.spicesoftware.api.util.decoration.fill.color.GrayScale8Color;
import net.spicesoftware.api.util.decoration.fill.color.RGB24Color;
import net.spicesoftware.api.util.decoration.fill.color.RGBA32Color;
import net.spicesoftware.api.util.vector.Vector2i;
import net.spicesoftware.api.value.Interpolator;

import javax.validation.constraints.Size;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * レジストリは、実装とAPIを結ぶクラスです。
 * 主に画像の作成、ビルダーの取得等ができます。
 *
 * @since 2014/10/06
 */
public interface Registry {

    /**
     * 指定された{@link Class}の{@link Builder}のインスタンスを返します。
     *
     * @param clazz 取得する{@link Builder}の{@link Class}
     * @param <T> 取得する{@link Builder}の型
     * @return 指定された{@link Class}の{@link Builder}のインスタンス
     * @throws IllegalStateException {@link Builder}が{@code Registry}に登録されていない場合
     */
    // TODO IllegalState or IllegalArgument
    <T extends Builder> T createBuilder(Class<T> clazz) throws IllegalStateException;

    /**
     * 呼ばれるたびに指定された{@link Class}の{@link Builder}の新しいインスタンスを返す{@link Supplier}を登録します。
     *
     * @param clazz 登録する{@link Supplier}が返す{@link Builder}の{@link Class}
     * @param builderSupplier 呼ばれるたびに指定された{@link Class}の{@link Builder}の新しいインスタンスを返す{@link Supplier}
     * @param <T> 登録する{@link Builder}の型
     * @throws AlreadyRegisteredInRegistryException 指定された{@link Supplier}がすでに{@code Registry}に登録されている場合
     */
    <T extends Builder> void registerBuilder(Class<T> clazz, Supplier<T> builderSupplier) throws AlreadyRegisteredInRegistryException;

    /**
     * 指定された{@link Class}の{@link Builder}の{@link Supplier}の登録を解除します。
     *
     * @param clazz 登録を解除する{@link Supplier}が返す{@link Builder}の{@link Class}
     * @param <T> 登録を解除する{@link Builder}の型
     * @return 登録を解除された{@link Supplier}
     * @throws IllegalArgumentException 指定された{@link Supplier}が登録されていない場合
     */
    <T extends Builder> Supplier<T> unregisterBuilder(Class<T> clazz) throws IllegalArgumentException;

    /**
     * 指定された{@link Class}の{@link Builder}の{@link Supplier}が登録されているか{@code boolean}で返します。
     *
     * @param clazz 登録されているか確認する{@link Supplier}が返す{@link Builder}の{@link Class}
     * @return {@link Supplier}が登録されているなら{@code true}、登録されていないなら{@code false}
     */
    boolean isRegisteredBuilder(Class<? extends Builder> clazz);

    /**
     * {@link ImageBlenderPropertyCreator}を返します。
     *
     * @return {@link ImageBlenderPropertyCreator}
     */
    ImageBlenderPropertyCreator getImageBlenderPropertyCreator();

    /**
     * {@link ImageCreator}を返します。
     *
     * @return {@link ImageCreator}
     */
    ImageCreator getImageCreator();

    /**
     * {@link Interpolator}をIdと関連付けて登録します。
     *
     * @param clazz        登録する{@link Interpolator}の補完する型の{@link Class}
     * @param id           登録する{@link Interpolator}に関連付けるId
     * @param interpolator 登録する{@link Interpolator}
     * @param <T>          登録する{@link Interpolator}が補完する型
     * @throws AlreadyRegisteredInRegistryException 同じIdですでに登録されている場合
     */
    <T> void registerInterpolator(Class<T> clazz, @Size(min = 1) String id, Interpolator<T> interpolator) throws AlreadyRegisteredInRegistryException;

    /**
     * 指定された{@link java.lang.Class}とIdから{@link Interpolator}を返します。
     *
     * @param clazz 取得したい{@link Interpolator}のクラスの{@link java.lang.Class}
     * @param id    取得したい{@link Interpolator}のId
     * @param <T>   取得したい{@link Interpolator}が補完する型
     * @return 指定されたIdと型のためのInterpolator
     */
    <T> Optional<Interpolator<T>> getInterpolatorOf(Class<T> clazz, @Size(min = 1) String id);

    /**
     * 指定された{@link Interpolator}のIdを返します。<br>
     * 登録されている場合、Idを含む{@link Optional}が、されていない場合、空の{@link Optional}が返ります。
     *
     * @param clazz        Idを取得する{@link Interpolator}が補完する型の{@link Class}
     * @param interpolator Idを取得する{@link Interpolator}
     * @param <T>          Idを取得する{@link Interpolator}が補完する型
     * @return 指定したInterpolatorのId
     */
    @Size(min = 1)
    <T> Optional<String> getInterpolatorsId(Class<T> clazz, Interpolator<T> interpolator);

    /**
     * 指定された{@link Interpolator}が登録されているかを真偽値で返します。
     *
     * @param clazz        登録されているかを確認する{@link Interpolator}が補完する型の{@link Class}
     * @param interpolator 登録されているかを確認する{@link Interpolator}
     * @param <T>          登録されているかを確認する{@link Interpolator}が補完する型
     * @return 指定されたInterpolatorが登録されているか
     */
    <T> boolean isRegisteredInterpolator(Class<T> clazz, Interpolator<T> interpolator);


    /**
     * {@link ImageBlender}をIdと関連付けて登録します。
     *
     * @param clazzI       登録する{@link ImageBlender}の合成する{@link CachedImage}の型の{@link Class}
     * @param clazzB       登録する{@link ImageBlender}が合成する時の{@link ImageBlenderProperty}の型の{@link Class}
     * @param id           登録する{@link ImageBlender}に関連付けるId
     * @param imageBlender 登録する{@link ImageBlender}
     * @param <I>          登録する{@link ImageBlender}が合成する{@link CachedImage}の型
     * @param <B>          登録する{@link ImageBlender}が合成する時の{@link ImageBlenderProperty}の型
     * @throws AlreadyRegisteredInRegistryException 同じIdですでに登録されている場合
     */
    <I extends CachedImage, B extends ImageBlenderProperty> void registerImageBlender(Class<I> clazzI, Class<B> clazzB, @Size(min = 1) String id, ImageBlender<I, B> imageBlender) throws AlreadyRegisteredInRegistryException;

    /**
     * イメージの{@link java.lang.Class}とIdから{@link ImageBlender}を返します。
     *
     * @param clazzI 取得したい{@link ImageBlender}が合成する{@link CachedImage}の{@link Class}
     * @param clazzB 取得したい{@link ImageBlender}が合成する時のプロパティの{@link Class}
     * @param id     取得したい{@link ImageBlender}のId
     * @param <I>    取得したい{@link ImageBlender}が合成する{@link CachedImage}の型
     * @param <B>    取得したい{@link ImageBlender}が合成する時の{@link ImageBlenderProperty}の型
     * @return 指定されたIdと型のためのImageBlender
     */
    <I extends CachedImage, B extends ImageBlenderProperty> Optional<ImageBlender<I, B>> getImageBlender(Class<I> clazzI, Class<B> clazzB, @Size(min = 1) String id);

    /**
     * 指定された{@link ImageBlender}のIdを返します。<br>
     * 登録されている場合、Idを含む{@link Optional}が、されていない場合、空の{@link Optional}が返ります。
     *
     * @param clazzI       Idを取得する{@link ImageBlender}の合成する画像の型の{@link Class}
     * @param clazzB       Idを取得する{@link ImageBlender}が合成する時のプロパティの{@link Class}
     * @param imageBlender Idを取得する{@link ImageBlender}
     * @param <I>          Idを取得する{@link ImageBlender}が合成する{@link CachedImage}の型
     * @param <B>          Idを取得する{@link ImageBlender}が合成する時の{@link ImageBlenderProperty}の型
     * @return 指定したImageBlenderのId
     */
    @Size(min = 1)
    <I extends CachedImage, B extends ImageBlenderProperty> Optional<String> getImageBlendersId(Class<I> clazzI, Class<B> clazzB, ImageBlender<I, B> imageBlender);

    /**
     * 指定された{@link ImageBlender}が登録されているかを真偽値で返します。
     *
     * @param clazzI       登録されているかを確認する{@link ImageBlender}の合成する画像の型の{@link Class}
     * @param clazzB       登録されているかを確認する{@link ImageBlender}が合成する時のプロパティの{@link Class}
     * @param imageBlender 登録されているかを確認する{@link ImageBlender}
     * @param <I>          登録されているかを確認する{@link ImageBlender}が合成する{@link CachedImage}の型
     * @param <B>          登録されているかを確認する{@link ImageBlender}が合成する時の{@link ImageBlenderProperty}の型
     * @return 指定されたImageBlenderが登録されているか
     */
    <I extends CachedImage, B extends ImageBlenderProperty> boolean isRegisteredImageBlender(Class<I> clazzI, Class<B> clazzB, ImageBlender<I, B> imageBlender);


    /**
     * {@link ImageConverter}をIdと関連付けて登録します。
     *
     * @param inputImageClass  登録する{@link ImageConverter}の入力{@link Image}の型の{@link Class}
     * @param outputImageClass 登録する{@link ImageConverter}の出力{@link CachedImage}の型の{@link Class}
     * @param id               登録する{@link ImageConverter}に関連付けるId
     * @param imageConverter   登録する{@link ImageConverter}
     * @param <I>              登録する{@link ImageConverter}の入力{@link Image}の型
     * @param <O>              登録する{@link ImageConverter}の出力{@link CachedImage}の型
     * @throws AlreadyRegisteredInRegistryException 同じIdですでに登録されている場合
     */
    <I extends Image, O extends CachedImage> void registerImageConverter(Class<I> inputImageClass, Class<O> outputImageClass, @Size(min = 1) String id, ImageConverter<I, O> imageConverter) throws AlreadyRegisteredInRegistryException;

    /**
     * 入力{@link Image}の{@link java.lang.Class}と出力{@link CachedImage}の{@link java.lang.Class}とIdから{@link ImageBlender}を返します。
     *
     * @param inputImageClass  {@link ImageConverter}を取得したい入力{@link Image}の{@link java.lang.Class}
     * @param outputImageClass {@link ImageConverter}を取得したい取得{@link CachedImage}の{@link java.lang.Class}
     * @param id               取得したい{@link ImageConverter}のId
     * @param <I>              {@link ImageConverter}を取得したい入力{@link Image}の型
     * @param <O>              {@link ImageConverter}を取得したい入力{@link CachedImage}の型
     * @return 指定されたIdと入力/出力イメージ型のためのImageConverter
     */
    <I extends Image, O extends CachedImage> Optional<ImageConverter<I, O>> getImageConverter(Class<I> inputImageClass, Class<O> outputImageClass, @Size(min = 1) String id);

    /**
     * 指定された{@link ImageConverter}のIdを返します。<br>
     * 登録されている場合、Idを含む{@link Optional}が、されていない場合、空の{@link Optional}が返ります。
     *
     * @param inputImageClass  Idを取得する{@link ImageConverter}の入力{@link Image}の型の{@link Class}
     * @param outputImageClass Idを取得する{@link ImageConverter}の出力{@link CachedImage}の型の{@link Class}
     * @param imageConverter   Idを取得する{@link ImageConverter}
     * @param <I>              Idを取得する{@link ImageConverter}の入力{@link Image}の型
     * @param <O>              Idを取得する{@link ImageConverter}の出力{@link CachedImage}の型
     * @return 指定したImageConverterのId
     */
    @Size(min = 1)
    <I extends Image, O extends CachedImage> Optional<String> getImageConvertersId(Class<I> inputImageClass, Class<O> outputImageClass, ImageConverter<I, O> imageConverter);

    /**
     * 指定された{@link ImageConverter}が登録されているかを真偽値で返します。
     *
     * @param inputImageClass  登録されているかを確認する{@link ImageConverter}の入力{@link Image}の型の{@link Class}
     * @param outputImageClass 登録されているかを確認する{@link ImageConverter}の出力{@link CachedImage}の型の{@link Class}
     * @param imageConverter   登録されているかを確認する{@link ImageConverter}
     * @param <I>              登録されているかを確認する{@link ImageConverter}の入力{@link Image}の型
     * @param <O>              登録されているかを確認する{@link ImageConverter}の出力{@link CachedImage}の型
     * @return 指定されたImageConverterが登録されているか
     */
    <I extends Image, O extends CachedImage> boolean isRegisteredImageConverter(Class<I> inputImageClass, Class<O> outputImageClass, ImageConverter<I, O> imageConverter);


    <T extends Renderable, I extends Image> Optional<Renderer<T, I>> getRendererOf(Class<T> renderableClass, Class<I> imageClass);

    void setRenderer(Renderer renderer);
}
