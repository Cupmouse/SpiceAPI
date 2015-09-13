package net.spicesoftware.api.registry;

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
import net.spicesoftware.api.resource.builder.ResourceImageBuilder;
import net.spicesoftware.api.resource.builder.ResourceShapeBuilder;
import net.spicesoftware.api.resource.builder.ResourceSoundBuilder;
import net.spicesoftware.api.resource.builder.ResourceVideoBuilder;
import net.spicesoftware.api.util.AlreadyRegisteredInRegistryException;
import net.spicesoftware.api.util.NotRegisteredInRegistryException;
import net.spicesoftware.api.util.decoration.fill.color.GrayScale8Color;
import net.spicesoftware.api.util.decoration.fill.color.RGB24Color;
import net.spicesoftware.api.util.decoration.fill.color.RGBA32Color;
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
     * 幅と高さとグレースケール画像情報を含む{@code byte[]}から新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param width  新しいイメージの幅
     * @param height 新しいイメージの高さ
     * @param image  新しいイメージの画像情報を含むbyte[]
     * @return 新しい不変グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedGrayScale8Image createCachedGrayScaleImage(int width, int height, byte[] image) throws IllegalArgumentException;

    /**
     * 幅と高さとグレースケール画像情報を含む{@code byte[]}から新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param width  新しいイメージの幅
     * @param height 新しいイメージの高さ
     * @param image  新しいイメージの画像情報を含むbyte[]
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createNewGrayScaleImage(int width, int height, byte[] image) throws IllegalArgumentException;

    /**
     * 指定された高さと幅から背景色が黒色のまっさらな新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createNewGrayScaleImage(int width, int height) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から背景色が黒色のまっさらな新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link Vector2i}
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScale8Image createNewGrayScaleImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createNewGrayScaleImage(int width, int height, byte backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScale8Image createNewGrayScaleImage(Vector2i size, byte backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createNewGrayScaleImage(int width, int height, int backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScale8Image createNewGrayScaleImage(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createNewGrayScaleImage(int width, int height, GrayScale8Color backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScale8Image createNewGrayScaleImage(Vector2i size, GrayScale8Color backgroundColor);

    /**
     * 幅と高さとRGB24形式の画像情報を含む{@code int[]}から新しい{@link CachedRGB24Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @param image  画像情報を含むint[]
     * @return 新しい不変RGBケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedRGB24Image createCachedRGBImage(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 幅と高さとRGB24形式の画像情報を含む{@code int[]}から新しい{@link EditableRGB24Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @param image  画像情報を含むint[]
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGB24Image createNewRGBImage(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 指定された高さと幅から背景色が黒色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGB24Image createNewRGBImage(int width, int height) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から背景色が黒色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link Vector2i}
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGB24Image createNewRGBImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGB24Image createNewRGBImage(int width, int height, int backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGB24Image createNewRGBImage(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGB24Image createNewRGBImage(int width, int height, RGB24Color backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGB24Image createNewRGBImage(Vector2i size, RGB24Color backgroundColor);

    /**
     * 幅と高さと3つのチャンネルごとの{@link CachedGrayScale8Image}から新しい{@link EditableRGB24Image}を作成します。
     *
     * @param height   新しい画像の高さ
     * @param width    新しい画像の幅
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScale8Image}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScale8Image}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScale8Image}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGB24Image createNewCSRGBImage(int width, int height, EditableGrayScale8Image channelR, EditableGrayScale8Image channelG, EditableGrayScale8Image channelB) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}と3つのチャンネルごとの{@link CachedGrayScale8Image}から新しい{@link EditableRGB24Image}を作成します。
     *
     * @param size     新しい画像の高さと幅の{@link Vector2i}
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScale8Image}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScale8Image}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScale8Image}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBイメージ
     */
    EditableRGB24Image createNewCSRGBImage(Vector2i size, EditableGrayScale8Image channelR, EditableGrayScale8Image channelG, EditableGrayScale8Image channelB);

    /**
     * 幅と高さとRGBA32形式の画像情報を含む{@code int[]}から新しい{@link CachedRGBA32Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @param image  画像情報を含むint[]
     * @return 新しい不変RGBAケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedRGBA32Image createCachedRGBAImage(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 幅と高さとRGB3A2形式の画像情報を含む{@code int[]}から新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @param image  画像情報を含むint[]
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createNewRGBAImage(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 指定された高さと幅から背景色が透明(r, g, b, a)=(0, 0, 0, 0)のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createNewRGBAImage(int width, int height) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から背景色が透明(r, g, b, a)=(0, 0, 0, 0)のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link Vector2i}
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBA32Image createNewRGBAImage(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createNewRGBAImage(int width, int height, int backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBA32Image createNewRGBAImage(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createNewRGBAImage(int width, int height, long backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBA32Image createNewRGBAImage(Vector2i size, long backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createNewRGBAImage(int width, int height, RGBA32Color backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBA32Image createNewRGBAImage(Vector2i size, RGBA32Color backgroundColor);

    /**
     * 幅と高さと3つのチャンネルごとの{@link CachedGrayScale8Image}から新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height   新しい画像の高さ
     * @param width    新しい画像の幅
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScale8Image}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScale8Image}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScale8Image}
     * @param channelA 新しい画像のAチャンネルの{@link CachedGrayScale8Image}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createNewCSRGBAImage(int width, int height, EditableGrayScale8Image channelR, EditableGrayScale8Image channelG, EditableGrayScale8Image channelB, EditableGrayScale8Image channelA) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}と4つのチャンネルごとの{@link CachedGrayScale8Image}から新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param size     新しい画像の高さと幅の{@link Vector2i}
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScale8Image}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScale8Image}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScale8Image}
     * @param channelA 新しい画像のAチャンネルの{@link CachedGrayScale8Image}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBAイメージ
     */
    EditableRGBA32Image createNewCSRGBAImage(Vector2i size, EditableGrayScale8Image channelR, EditableGrayScale8Image channelG, EditableGrayScale8Image channelB, EditableGrayScale8Image channelA);


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
     * @param id    取得したい{@link ImageBlender}のId
     * @param <I>   取得したい{@link ImageBlender}が合成する{@link CachedImage}の型
     * @param <B>          取得したい{@link ImageBlender}が合成する時の{@link ImageBlenderProperty}の型
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
     * @param <I>   Idを取得する{@link ImageBlender}が合成する{@link CachedImage}の型
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
     * @param <I>   登録されているかを確認する{@link ImageBlender}が合成する{@link CachedImage}の型
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
