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
     * 幅と高さとグレースケール画像情報を含む{@code byte[]}から新しい{@link net.spicesoftware.api.image.gs.CachedGrayScaleImage}を作成します。
     *
     * @param width  新しいイメージの幅
     * @param height 新しいイメージの高さ
     * @param image  新しいイメージの画像情報を含むbyte[]
     * @return 新しい不変グレースケールイメージ
     * @throws net.spicesoftware.api.util.InvalidImageSizeException width * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedGrayScaleImage createCachedGrayScaleImage(int width, int height, byte[] image);

    /**
     * 幅と高さとグレースケール画像情報を含む{@code byte[]}から新しい{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を作成します。
     *
     * @param width  新しいイメージの幅
     * @param height 新しいイメージの高さ
     * @param image  新しいイメージの画像情報を含むbyte[]
     * @return 新しい編集可能グレースケールイメージ
     * @throws net.spicesoftware.api.util.InvalidImageSizeException width * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height, byte[] image);

    /**
     * 指定された高さと幅から背景色が黒色のまっさらな新しい{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から背景色が黒色のまっさらな新しい{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height, byte backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(Vector2i size, byte backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height, int backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(int width, int height, GrayScaleColor backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScaleImage createNewGrayScaleImage(Vector2i size, GrayScaleColor backgroundColor);

    /**
     * 幅と高さとRGB24形式の画像情報を含む{@code int[]}から新しい{@link net.spicesoftware.api.image.rgb.CachedRGBImage}を作成します。
     *
     * @param image 画像情報を含むint[]
     * @return 新しい不変RGBケールイメージ
     * @throws net.spicesoftware.api.util.InvalidImageSizeException width * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedRGBImage createCachedRGBImage(int width, int height, int[] image);

    /**
     * 幅と高さとRGB24形式の画像情報を含む{@code int[]}から新しい{@link net.spicesoftware.api.image.rgb.EditableRGBImage}を作成します。
     *
     * @param image 画像情報を含むint[]
     * @return 新しい編集可能RGBイメージ
     * @throws net.spicesoftware.api.util.InvalidImageSizeException width * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBImage createNewRGBImage(int width, int height, int[] image);

    /**
     * 指定された高さと幅から背景色が黒色のまっさらな新しい{@link net.spicesoftware.api.image.rgb.EditableRGBImage}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGBImage createNewRGBImage(int width, int height);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から背景色が黒色のまっさらな新しい{@link net.spicesoftware.api.image.rgb.EditableRGBImage}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGBImage createNewRGBImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgb.EditableRGBImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGBImage createNewRGBImage(int width, int height, int backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgb.EditableRGBImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGBImage createNewRGBImage(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgb.EditableRGBImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGBImage createNewRGBImage(int width, int height, RGB24Color backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgb.EditableRGBImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGBImage createNewRGBImage(Vector2i size, RGB24Color backgroundColor);

    /**
     * 幅と高さと3つのチャンネルごとの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}から新しい{@link net.spicesoftware.api.image.rgb.EditableRGBImage}を作成します。
     *
     * @param height   新しい画像の高さ
     * @param width    新しい画像の幅
     * @param channelR 新しい画像のRチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelG 新しい画像のGチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelB 新しい画像のBチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBイメージ
     */
    EditableRGBImage createNewCSRGBImage(int width, int height, EditableGrayScaleImage channelR, EditableGrayScaleImage channelG, EditableGrayScaleImage channelB);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}と3つのチャンネルごとの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}から新しい{@link net.spicesoftware.api.image.rgb.EditableRGBImage}を作成します。
     *
     * @param size     新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param channelR 新しい画像のRチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelG 新しい画像のGチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelB 新しい画像のBチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBイメージ
     */
    EditableRGBImage createNewCSRGBImage(Vector2i size, EditableGrayScaleImage channelR, EditableGrayScaleImage channelG, EditableGrayScaleImage channelB);

    /**
     * 幅と高さとRGBA32形式の画像情報を含む{@code int[]}から新しい{@link net.spicesoftware.api.image.rgba.CachedRGBAImage}を作成します。
     *
     * @param image 画像情報を含むint[]
     * @return 新しい不変RGBAケールイメージ
     * @throws net.spicesoftware.api.util.InvalidImageSizeException width * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedRGBAImage createCachedRGBAImage(int width, int height, int[] image);

    /**
     * 幅と高さとRGB3A2形式の画像情報を含む{@code int[]}から新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param image 画像情報を含むint[]
     * @return 新しい編集可能RGBAイメージ
     * @throws net.spicesoftware.api.util.InvalidImageSizeException width * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBAImage createNewRGBAImage(int width, int height, int[] image);

    /**
     * 指定された高さと幅から背景色が透明(r, g, b, a)=(0, 0, 0, 0)のまっさらな新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(int width, int height);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から背景色が透明(r, g, b, a)=(0, 0, 0, 0)のまっさらな新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(int width, int height, int backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(int width, int height, long backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(Vector2i size, long backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(int width, int height, RGBA32Color backgroundColor);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}から特定の背景色のまっさらな新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBAImage createNewRGBAImage(Vector2i size, RGBA32Color backgroundColor);

    /**
     * 幅と高さと3つのチャンネルごとの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}から新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param height   新しい画像の高さ
     * @param width    新しい画像の幅
     * @param channelR 新しい画像のRチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelG 新しい画像のGチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelB 新しい画像のBチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelA 新しい画像のAチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBAイメージ
     */
    EditableRGBAImage createNewCSRGBAImage(int width, int height, EditableGrayScaleImage channelR, EditableGrayScaleImage channelG, EditableGrayScaleImage channelB, EditableGrayScaleImage channelA);

    /**
     * 指定された高さと幅を含む{@link net.spicesoftware.api.util.vector.Vector2i}と4つのチャンネルごとの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}から新しい{@link net.spicesoftware.api.image.rgba.EditableRGBAImage}を作成します。
     *
     * @param size     新しい画像の高さと幅の{@link net.spicesoftware.api.util.vector.Vector2i}
     * @param channelR 新しい画像のRチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelG 新しい画像のGチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelB 新しい画像のBチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @param channelA 新しい画像のAチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBAイメージ
     */
    EditableRGBAImage createNewCSRGBAImage(Vector2i size, EditableGrayScaleImage channelR, EditableGrayScaleImage channelG, EditableGrayScaleImage channelB, EditableGrayScaleImage channelA);


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
    void registerIntepolator(@Size(min = 1) String id, Interpolator interpolator) throws AlreadyRegisteredException;

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
    void registerImageBlender(@Size(min = 1) String id, ImageBlender imageBlender) throws AlreadyRegisteredException;

//    /**
//     * イメージの{@link java.lang.Class}とIdから{@link net.spicesoftware.api.image.blender.ImageBlender}を返します。
//     *
//     * @param imageClass {@link net.spicesoftware.api.image.blender.ImageBlender}を取得したいイメージの{@link java.lang.Class}
//     * @param id         取得したい{@link net.spicesoftware.api.image.blender.ImageBlender}のId
//     * @param <T>        {@link net.spicesoftware.api.image.blender.ImageBlender}を取得したいイメージの型
//     * @return 指定されたIdと型のためのImageBlender
//     */
//    <T extends Image> Optional<ImageBlender<T, D>> getImageBlender(Class<T> imageClass, @Size(min = 1) String id);

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
    void registerImageConverter(@Size(min = 1) String id, ImageConverter imageConverter) throws AlreadyRegisteredException;

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
     * 指定された登録されている{@link net.spicesoftware.api.image.ImageConverter}のIdを返します。
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


    <T extends Renderable, I extends Image> Optional<Renderer<T, I>> getRendererOf(Class<T> renderableClass, Class<I> imageClass);

    void setRenderer(Renderer renderer);
}
