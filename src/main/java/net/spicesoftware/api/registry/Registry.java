package net.spicesoftware.api.registry;

import net.spicesoftware.api.image.CachedImage;
import net.spicesoftware.api.image.Image;
import net.spicesoftware.api.image.ImageConverter;
import net.spicesoftware.api.image.blender.ImageBlender;
import net.spicesoftware.api.image.gs.CachedGrayScaleImage;
import net.spicesoftware.api.image.gs.EditableGrayScaleImage;
import net.spicesoftware.api.image.rgb.CachedRGBImage;
import net.spicesoftware.api.image.rgb.EditableRGBImage;
import net.spicesoftware.api.image.rgba.CachedRGBAImage;
import net.spicesoftware.api.image.rgba.EditableRGBAImage;
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

    <T extends Image> void addImage(Class<T> image);

    /**
     * 幅と高さとグレースケール画像情報を含む{@code byte[]}から新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param width  新しいイメージの幅
     * @param height 新しいイメージの高さ
     * @param image  新しいイメージの画像情報を含むbyte[]
     * @return 新しい不変グレースケールイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedGrayScaleImage createCachedGrayScaleImage(int width, int height, byte[] image) throws IllegalArgumentException;

    /**
     * 幅と高さとグレースケール画像情報を含む{@code byte[]}から新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param width  新しいイメージの幅
     * @param height 新しいイメージの高さ
     * @param image  新しいイメージの画像情報を含むbyte[]
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height, byte[] image) throws IllegalArgumentException;

    /**
     * 指定された高さと幅から背景色が黒色のまっさらな新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から背景色が黒色のまっさらな新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link Vector2i}
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height, byte backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(Vector2i size, byte backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height, int backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height, GrayScaleColor backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link CachedGrayScaleImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(Vector2i size, GrayScaleColor backgroundColor);

    /**
     * 幅と高さとRGB24形式の画像情報を含む{@code int[]}から新しい{@link CachedRGBImage}を作成します。
     *
     * @param image 画像情報を含むint[]
     * @return 新しい不変RGBケールイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedRGBImage createCachedRGBImage(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 幅と高さとRGB24形式の画像情報を含む{@code int[]}から新しい{@link EditableRGBImage}を作成します。
     *
     * @param image 画像情報を含むint[]
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBImage createNewRGBImage(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 指定された高さと幅から背景色が黒色のまっさらな新しい{@link EditableRGBImage}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBImage createNewRGBImage(int width, int height) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から背景色が黒色のまっさらな新しい{@link EditableRGBImage}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link Vector2i}
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGBImage createNewRGBImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBImage createNewRGBImage(int width, int height, int backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGBImage createNewRGBImage(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBImage createNewRGBImage(int width, int height, RGB24Color backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGBImage createNewRGBImage(Vector2i size, RGB24Color backgroundColor);

    /**
     * 幅と高さと3つのチャンネルごとの{@link CachedGrayScaleImage}から新しい{@link EditableRGBImage}を作成します。
     *
     * @param height   新しい画像の高さ
     * @param width    新しい画像の幅
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScaleImage}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScaleImage}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScaleImage}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBImage createNewCSRGBImage(int width, int height, EditableGrayScaleImage channelR, EditableGrayScaleImage channelG, EditableGrayScaleImage channelB) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}と3つのチャンネルごとの{@link CachedGrayScaleImage}から新しい{@link EditableRGBImage}を作成します。
     *
     * @param size     新しい画像の高さと幅の{@link Vector2i}
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScaleImage}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScaleImage}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScaleImage}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBイメージ
     */
    EditableRGBImage createNewCSRGBImage(Vector2i size, EditableGrayScaleImage channelR, EditableGrayScaleImage channelG, EditableGrayScaleImage channelB);

    /**
     * 幅と高さとRGBA32形式の画像情報を含む{@code int[]}から新しい{@link CachedRGBAImage}を作成します。
     *
     * @param image 画像情報を含むint[]
     * @return 新しい不変RGBAケールイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedRGBAImage createCachedRGBAImage(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 幅と高さとRGB3A2形式の画像情報を含む{@code int[]}から新しい{@link EditableRGBAImage}を作成します。
     *
     * @param image 画像情報を含むint[]
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBAImage createNewRGBAImage(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 指定された高さと幅から背景色が透明(r, g, b, a)=(0, 0, 0, 0)のまっさらな新しい{@link EditableRGBAImage}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBAImage createNewRGBAImage(int width, int height) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から背景色が透明(r, g, b, a)=(0, 0, 0, 0)のまっさらな新しい{@link EditableRGBAImage}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link Vector2i}
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBAImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBAImage createNewRGBAImage(int width, int height, int backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBAImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBAImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBAImage createNewRGBAImage(int width, int height, long backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBAImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(Vector2i size, long backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBAImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBAImage createNewRGBAImage(int width, int height, RGBA32Color backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBAImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(Vector2i size, RGBA32Color backgroundColor);

    /**
     * 幅と高さと3つのチャンネルごとの{@link CachedGrayScaleImage}から新しい{@link EditableRGBAImage}を作成します。
     *
     * @param height   新しい画像の高さ
     * @param width    新しい画像の幅
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScaleImage}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScaleImage}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScaleImage}
     * @param channelA 新しい画像のAチャンネルの{@link CachedGrayScaleImage}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBAイメージ
     * @throws IllegalArgumentException width > 0 && height > 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBAImage createNewCSRGBAImage(int width, int height, EditableGrayScaleImage channelR, EditableGrayScaleImage channelG, EditableGrayScaleImage channelB, EditableGrayScaleImage channelA) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}と4つのチャンネルごとの{@link CachedGrayScaleImage}から新しい{@link EditableRGBAImage}を作成します。
     *
     * @param size     新しい画像の高さと幅の{@link Vector2i}
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScaleImage}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScaleImage}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScaleImage}
     * @param channelA 新しい画像のAチャンネルの{@link CachedGrayScaleImage}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBAイメージ
     */
    EditableRGBAImage createNewCSRGBAImage(Vector2i size, EditableGrayScaleImage channelR, EditableGrayScaleImage channelG, EditableGrayScaleImage channelB, EditableGrayScaleImage channelA);


    ResourceImageBuilder getResourceImageBuilder();

    ResourceShapeBuilder getResourceShapeBuilder();

    ResourceSoundBuilder getResourceSoundBuilder();

    ResourceVideoBuilder getResourceVideoBuilder();


    /**
     * {@link Interpolator}をIdと関連付けて登録します。
     *
     * @param clazz        登録する{@link Interpolator}の補完する型の{@link Class}
     * @param id           登録する{@link Interpolator}に関連付けるId
     * @param interpolator 登録する{@link Interpolator}
     * @throws AlreadyRegisteredException 同じIdですでに登録されている場合
     */
    <T> void registerInterpolator(Class<T> clazz, @Size(min = 1) String id, Interpolator<T> interpolator) throws AlreadyRegisteredException;

    /**
     * 指定された{@link java.lang.Class}とIdから{@link Interpolator}を返します。
     *
     * @param clazz 取得したい{@link Interpolator}のクラスの{@link java.lang.Class}
     * @param id    取得したい{@link Interpolator}のId
     * @param <T>   {@link Interpolator}を取得したいクラスの型
     * @return 指定されたIdと型のためのInterpolator
     */
    <T> Optional<Interpolator<T>> getInterpolatorOf(Class<T> clazz, @Size(min = 1) String id);

    /**
     * 指定された登録されている{@link Interpolator}のIdを返します。
     *
     * @param clazz        登録されているかを確認する{@link Interpolator}の補完する型の{@link Class}
     * @param interpolator Idを取得する{@link Interpolator}
     * @return 指定したInterpolatorのId
     * @throws NotRegisteredInterpolatorException {@link Interpolator}がレジストリに登録されていない場合
     */
    @Size(min = 1)
    <T> Optional<String> getInterpolatorsId(Class<T> clazz, Interpolator<T> interpolator) throws NotRegisteredInterpolatorException;

    /**
     * 指定された{@link Interpolator}が登録されているかを真偽値で返します。
     *
     * @param clazz        登録されているかを確認する{@link Interpolator}の補完する型の{@link Class}
     * @param interpolator 登録されているかを確認する{@link Interpolator}
     * @return 指定されたInterpolatorが登録されているか
     */
    <T> boolean isRegisteredInterpolator(Class<T> clazz, Interpolator<T> interpolator);


    /**
     * {@link ImageBlender}をIdと関連付けて登録します。
     *
     * @param clazz        登録する{@link ImageBlender}の合成する画像の型の{@link Class}
     * @param id           登録する{@link ImageBlender}に関連付けるId
     * @param imageBlender 登録する{@link ImageBlender}
     * @throws AlreadyRegisteredException 同じIdですでに登録されている場合
     */
    <I extends CachedImage> void registerImageBlender(Class<I> clazz, @Size(min = 1) String id, ImageBlender<?, I> imageBlender) throws AlreadyRegisteredException;

    /**
     * イメージの{@link java.lang.Class}とIdから{@link ImageBlender}を返します。
     *
     * @param clazz {@link ImageBlender}を取得したいイメージの{@link Class}
     * @param id         取得したい{@link ImageBlender}のId
     * @param <I>        {@link ImageBlender}を取得したいイメージの型
     * @return 指定されたIdと型のためのImageBlender
     */
    <I extends CachedImage> Optional<ImageBlender<?, I>> getImageBlender(Class<I> clazz, @Size(min = 1) String id);

    /**
     * 指定された登録されている{@link ImageBlender}のIdを返します。
     *
     * @param clazz        Idを取得する{@link ImageBlender}の合成する画像の型の{@link Class}
     * @param imageBlender Idを取得する{@link ImageBlender}
     * @return 指定したImageBlenderのId
     * @throws NotRegisteredImageBlenderException {@link ImageBlender}がレジストリに登録されていない場合
     */
    @Size(min = 1)
    <I extends CachedImage> Optional<String> getImageBlendersId(Class<I> clazz, ImageBlender<?, I> imageBlender) throws NotRegisteredImageBlenderException;

    /**
     * 指定された{@link ImageBlender}が登録されているかを真偽値で返します。
     *
     * @param clazz        登録されているかを確認する{@link ImageBlender}の合成する画像の型の{@link Class}
     * @param imageBlender 登録されているかを確認する{@link ImageBlender}
     * @return 指定されたImageBlenderが登録されているか
     */
    <I extends CachedImage> boolean isRegisteredImageBlender(Class<I> clazz, ImageBlender<?, I> imageBlender);


    /**
     * {@link ImageConverter}をIdと関連付けて登録します。
     *
     * @param inputImageClass  登録する{@link ImageConverter}の変換前の画像の型の{@link Class}
     * @param outputImageClass 登録する{@link ImageConverter}の変換後の画像の型の{@link Class}
     * @param id               登録する{@link ImageConverter}に関連付けるId
     * @param imageConverter   登録する{@link ImageConverter}
     * @throws AlreadyRegisteredException 同じIdですでに登録されている場合
     */
    <I extends Image, O extends CachedImage> void registerImageConverter(Class<I> inputImageClass, Class<O> outputImageClass, @Size(min = 1) String id, ImageConverter<I, O> imageConverter) throws AlreadyRegisteredException;

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
     * 指定された登録されている{@link ImageConverter}のIdを返します。
     *
     * @param inputImageClass  Idを取得する{@link ImageConverter}の変換前の画像の型の{@link Class}
     * @param outputImageClass Idを取得する{@link ImageConverter}の変換後の画像の型の{@link Class}
     * @param imageConverter   Idを取得する{@link ImageConverter}
     * @return 指定したImageConverterのId
     * @throws NotRegisteredImageConverterException {@link ImageConverter}がレジストリに登録されていない場合
     */
    @Size(min = 1)
    <I extends Image, O extends CachedImage> Optional<String> getImageConvertersId(Class<I> inputImageClass, Class<O> outputImageClass, ImageConverter<I, O> imageConverter) throws NotRegisteredImageConverterException;

    /**
     * 指定された{@link ImageConverter}が登録されているかを真偽値で返します。
     *
     * @param inputImageClass  登録されているかを確認する{@link ImageConverter}の変換前の画像の型の{@link Class}
     * @param outputImageClass 登録されているかを確認する{@link ImageConverter}の変換後の画像の型の{@link Class}
     * @param imageConverter   登録されているかを確認する{@link ImageConverter}
     * @return 指定されたImageConverterが登録されているか
     */
    <I extends Image, O extends CachedImage> boolean isRegisteredImageConverter(Class<I> inputImageClass, Class<O> outputImageClass, ImageConverter<I, O> imageConverter);


    <T extends Renderable, I extends Image> Optional<Renderer<T, I>> getRendererOf(Class<T> renderableClass, Class<I> imageClass);

    void setRenderer(Renderer renderer);
}
