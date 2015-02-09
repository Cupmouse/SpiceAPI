package net.spicesoftware.api.registry;

import net.spicesoftware.api.image.*;
import net.spicesoftware.api.image.blender.ImageBlender;
import net.spicesoftware.api.render.Renderable;
import net.spicesoftware.api.render.Renderer;
import net.spicesoftware.api.resource.builder.ResourceImageBuilder;
import net.spicesoftware.api.resource.builder.ResourceShapeBuilder;
import net.spicesoftware.api.resource.builder.ResourceSoundBuilder;
import net.spicesoftware.api.resource.builder.ResourceVideoBuilder;
import net.spicesoftware.api.util.AlreadyRegisteredException;
import net.spicesoftware.api.util.NotRegisteredImageBlenderException;
import net.spicesoftware.api.util.NotRegisteredImageConverterException;
import net.spicesoftware.api.util.NotRegisteredInterpolatorException;
import net.spicesoftware.api.util.color.GrayScaleColor;
import net.spicesoftware.api.util.color.RGB24Color;
import net.spicesoftware.api.util.color.RGBA32Color;
import net.spicesoftware.api.util.vector.Vector2i;
import net.spicesoftware.api.value.Interpolator;

import javax.validation.constraints.Size;
import java.util.Optional;

/**
 * レジストリです。
 * 画像の作成、ビルダーの取得等ができます。
 *
 * @since 2014/10/06
 */
public interface Registry {

    /**
     * グレースケール画像情報を含む{@code byte[][]}から新しい{@link net.spicesoftware.api.image.CachedGrayScaleImage}を作成します。
     *
     * @param image 画像情報を含むbyte[][]
     * @return 新しい不変グレースケールイメージ
     */
    CachedGrayScaleImage createCachedGrayScaleImage(byte[][] image);

    /**
     * グレースケール画像情報を含む{@code byte[][]}から新しい{@link net.spicesoftware.api.image.GrayScaleImageEditable}を作成します。
     *
     * @param image 画像情報を含むbyte[][]
     * @return 新しい編集可能グレースケールイメージ
     */
    CachedGrayScaleImage createNewGrayScaleImage(byte[][] image);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.GrayScaleImageEditable}を作成します。
     *
     * @param x               新しい画像の高さ
     * @param y               新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    GrayScaleImageEditable createNewGrayScaleImage(int x, int y, GrayScaleColor backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.GrayScaleImageEditable}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    GrayScaleImageEditable createNewGrayScaleImage(Vector2i size, GrayScaleColor backgroundColor);

    /**
     * RGB24形式の画像情報を含む{@code int[][]}から新しい{@link net.spicesoftware.api.image.CachedRGBImage}を作成します。
     *
     * @param image 画像情報を含むint[][]
     * @return 新しい不変RGBケールイメージ
     */
    CachedRGBImage createCachedRGBImage(int[][] image);

    /**
     * RGB24形式の画像情報を含む{@code int[][]}から新しい{@link net.spicesoftware.api.image.RGBImageEditable}を作成します。
     *
     * @param image 画像情報を含むint[][]
     * @return 新しい編集可能RGBイメージ
     */
    RGBImageEditable createNewRGBImage(int[][] image);

    /**
     * 指定された高さと幅から背景色が黒色のまっさらな新しい{@link net.spicesoftware.api.image.RGBImageEditable}を作成します。
     *
     * @param x 新しい画像の高さ
     * @param y 新しい画像の幅
     * @return 新しい編集可能RGBイメージ
     */
    RGBImageEditable createNewRGBImage(int x, int y);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から背景色が黒色のまっさらな新しい{@link net.spicesoftware.api.image.RGBImageEditable}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @return 新しい編集可能RGBイメージ
     */
    RGBImageEditable createNewRGBImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.RGBImageEditable}を作成します。
     *
     * @param x               新しい画像の高さ
     * @param y               新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    RGBImageEditable createNewRGBImage(int x, int y, RGB24Color backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.RGBImageEditable}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    RGBImageEditable createNewRGBImage(Vector2i size, RGB24Color backgroundColor);

    /**
     * RGB24形式の画像情報を含む{@code long[][]}から新しい{@link net.spicesoftware.api.image.CachedRGBAImage}を作成します。
     *
     * @param image 画像情報を含むlong[][]
     * @return 新しい不変RGBAケールイメージ
     */
    CachedRGBAImage createCachedRGBAImage(long[][] image);

    /**
     * RGB24形式の画像情報を含む{@code long[][]}から新しい{@link net.spicesoftware.api.image.RGBAImageEditable}を作成します。
     *
     * @param image 画像情報を含むlong[][]
     * @return 新しい編集可能RGBAイメージ
     */
    RGBAImageEditable createNewRGBAImage(long[][] image);

    /**
     * 指定された高さと幅から背景色が透明(r, g, b, a)=(0, 0, 0, 255)のまっさらな新しい{@link net.spicesoftware.api.image.RGBAImageEditable}を作成します。
     *
     * @param x 新しい画像の高さ
     * @param y 新しい画像の幅
     * @return 新しい編集可能RGBAイメージ
     */
    RGBAImageEditable createNewRGBAImage(int x, int y);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から背景色が透明(r, g, b, a)=(0, 0, 0, 255)のまっさらな新しい{@link net.spicesoftware.api.image.RGBAImageEditable}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @return 新しい編集可能RGBAイメージ
     */
    RGBAImageEditable createNewRGBAImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.RGBAImageEditable}を作成します。
     *
     * @param x               新しい画像の高さ
     * @param y               新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    RGBAImageEditable createNewRGBAImage(int x, int y, RGBA32Color backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.RGBAImageEditable}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    RGBAImageEditable createNewRGBAImage(Vector2i size, RGBA32Color backgroundColor);


    ResourceImageBuilder getResourceImageBuilder();

    ResourceShapeBuilder getResourceShapeBuilder();

    ResourceSoundBuilder getResourceSoundBuilder();

    ResourceVideoBuilder getResourceVideoBuilder();


    /**
     * {@link net.spicesoftware.api.value.Interpolator}をIdと関連付けて登録します。
     *
     * @param id           登録する{@link net.spicesoftware.api.value.Interpolator}に関連付けるId
     * @param interpolator 登録する{@link net.spicesoftware.api.value.Interpolator}
     * @throws net.spicesoftware.api.util.AlreadyRegisteredException 同じIdですでに登録されている場合
     */
    void addIntepolator(@Size(min = 1) String id, Interpolator interpolator) throws AlreadyRegisteredException;

    /**
     * 指定された{@link java.lang.Class}とIdから{@link net.spicesoftware.api.value.Interpolator}を返します。
     *
     * @param clazz {@link net.spicesoftware.api.value.Interpolator}を取得したいクラスの{@link java.lang.Class}
     * @param id    取得したい{@link net.spicesoftware.api.value.Interpolator}のId
     * @param <T>   {@link net.spicesoftware.api.value.Interpolator}を取得したいクラスの型
     * @return 指定されたIdと型のためのInterpolator
     */
    <T> Optional<Interpolator<T>> getInterpolatorOf(Class<T> clazz, @Size(min = 1) String id);

    /**
     * 指定された登録されている{@link net.spicesoftware.api.value.Interpolator}のIdを返します。
     *
     * @param interpolator Idを取得する{@link net.spicesoftware.api.value.Interpolator}
     * @return 指定したInterpolatorのId
     * @throws net.spicesoftware.api.util.NotRegisteredInterpolatorException {@link net.spicesoftware.api.value.Interpolator}がレジストリに登録されていない場合
     */
    @Size(min = 1)
    String getInterpolatorsId(Interpolator interpolator) throws NotRegisteredInterpolatorException;

    /**
     * 指定された{@link net.spicesoftware.api.value.Interpolator}が登録されているかを真偽値で返します。
     *
     * @param interpolator 登録されているかを確認する{@link net.spicesoftware.api.value.Interpolator}
     * @return 指定されたInterpolatorが登録されているか
     */
    boolean isRegisteredIntepolator(Interpolator interpolator);


    /**
     * {@link net.spicesoftware.api.image.blender.ImageBlender}をIdと関連付けて登録します。
     *
     * @param id           登録する{@link net.spicesoftware.api.image.blender.ImageBlender}に関連付けるId
     * @param imageBlender 登録する{@link net.spicesoftware.api.image.blender.ImageBlender}
     * @throws net.spicesoftware.api.util.AlreadyRegisteredException 同じIdですでに登録されている場合
     */
    void addImageBlender(@Size(min = 1) String id, ImageBlender imageBlender) throws AlreadyRegisteredException;

    /**
     * イメージの{@link java.lang.Class}とIdから{@link net.spicesoftware.api.image.blender.ImageBlender}を返します。
     *
     * @param imageClass {@link net.spicesoftware.api.image.blender.ImageBlender}を取得したいイメージの{@link java.lang.Class}
     * @param id         取得したい{@link net.spicesoftware.api.image.blender.ImageBlender}のId
     * @param <T>        {@link net.spicesoftware.api.image.blender.ImageBlender}を取得したいイメージの型
     * @return 指定されたIdと型のためのImageBlender
     */
    <T extends Image> ImageBlender<T> getImageBlender(Class<T> imageClass, @Size(min = 1) String id);

    /**
     * 指定された登録されている{@net.spicesoftware.api.image.blender.ImageBlender}のIdを返します。
     *
     * @param imageBlender Idを取得する{@link net.spicesoftware.api.image.blender.ImageBlender}
     * @return 指定したImageBlenderのId
     * @throws net.spicesoftware.api.util.NotRegisteredImageBlenderException {@link net.spicesoftware.api.image.blender.ImageBlender}がレジストリに登録されていない場合
     */
    @Size(min = 1)
    String getImageBlendersId(ImageBlender imageBlender) throws NotRegisteredImageBlenderException;

    /**
     * 指定された{@link net.spicesoftware.api.image.blender.ImageBlender}が登録されているかを真偽値で返します。
     *
     * @param imageBlender 登録されているかを確認する{@link net.spicesoftware.api.image.blender.ImageBlender}
     * @return 指定されたImageBlenderが登録されているか
     */
    boolean isRegisteredImageBlender(ImageBlender imageBlender);


    /**
     * {@link net.spicesoftware.api.image.ImageConverter}をIdと関連付けて登録します。
     *
     * @param id             登録する{@link net.spicesoftware.api.image.ImageConverter}に関連付けるId
     * @param imageConverter 登録する{@link net.spicesoftware.api.image.ImageConverter}
     * @throws net.spicesoftware.api.util.AlreadyRegisteredException 同じIdですでに登録されている場合
     */
    void addImageConverter(@Size(min = 1) String id, ImageConverter imageConverter) throws AlreadyRegisteredException;

    /**
     * 入力{@link net.spicesoftware.api.image.Image}の{@link java.lang.Class}と出力{@link net.spicesoftware.api.image.CachedImage}の{@link java.lang.Class}とIdから{@link net.spicesoftware.api.image.blender.ImageBlender}を返します。
     *
     * @param inputImageClass  {@link net.spicesoftware.api.image.ImageConverter}を取得したい入力{@link net.spicesoftware.api.image.Image}の{@link java.lang.Class}
     * @param outputImageClass {@link net.spicesoftware.api.image.ImageConverter}を取得したい取得{@link net.spicesoftware.api.image.CachedImage}の{@link java.lang.Class}
     * @param id               取得したい{@link net.spicesoftware.api.image.ImageConverter}のId
     * @param <I>              {@link net.spicesoftware.api.image.ImageConverter}を取得したい入力{@link net.spicesoftware.api.image.Image}の型
     * @param <O>              {@link net.spicesoftware.api.image.ImageConverter}を取得したい入力{@link net.spicesoftware.api.image.CachedImage}の型
     * @return 指定されたIdと入力/出力イメージ型のためのImageConverter
     */
    <I extends Image, O extends CachedImage> Optional<ImageConverter<I, O>> getImageConverter(Class<I> inputImageClass, Class<O> outputImageClass, @Size(min = 1) String id);

    /**
     * 指定された登録されている{@net.spicesoftware.api.image.ImageConverter}のIdを返します。
     *
     * @param imageConverter Idを取得する{@link net.spicesoftware.api.image.ImageConverter}
     * @return 指定したImageConverterのId
     * @throws net.spicesoftware.api.util.NotRegisteredImageConverterException {@link net.spicesoftware.api.image.ImageConverter}がレジストリに登録されていない場合
     */
    @Size(min = 1)
    String getImageConvertersId(ImageConverter imageConverter) throws NotRegisteredImageConverterException;

    /**
     * 指定された{@link net.spicesoftware.api.image.ImageConverter}が登録されているかを真偽値で返します。
     *
     * @param imageConverter 登録されているかを確認する{@link net.spicesoftware.api.image.ImageConverter}
     * @return 指定されたImageConverterが登録されているか
     */
    boolean isRegisteredImageConverter(ImageConverter imageConverter);


    <T extends Renderable, I extends Image> Renderer<T, I> getRendererOf(Class<T> renderableClass, Class<I> imageClass);

    void setRenderer(Renderer renderer);
}
