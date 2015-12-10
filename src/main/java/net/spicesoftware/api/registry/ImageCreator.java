package net.spicesoftware.api.registry;

import net.spicesoftware.api.decoration.fill.GrayScale8Color;
import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.decoration.fill.RGBA32Color;
import net.spicesoftware.api.image.gs.CachedGrayScale8Image;
import net.spicesoftware.api.image.gs.EditableGrayScale8Image;
import net.spicesoftware.api.image.rgb.CachedRGB24Image;
import net.spicesoftware.api.image.rgb.EditableCSRGB24Image;
import net.spicesoftware.api.image.rgb.EditableRGB24Image;
import net.spicesoftware.api.image.rgba.CachedRGBA32Image;
import net.spicesoftware.api.image.rgba.EditableCSRGBA32Image;
import net.spicesoftware.api.image.rgba.EditableRGBA32Image;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/11/14
 */
public interface ImageCreator {

    /**
     * 幅と高さとグレースケール画像情報を含む{@code byte[]}から新しい{@link CachedGrayScale8Image}を作成します。
     *
     * @param width  新しいイメージの幅
     * @param height 新しいイメージの高さ
     * @param image  新しいイメージの画像情報を含むbyte[]
     * @return 新しい不変グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedGrayScale8Image createCachedGrayScale8Image(int width, int height, byte[] image) throws IllegalArgumentException;

    /**
     * 幅と高さとグレースケール画像情報を含む{@code byte[]}から新しい{@link EditableGrayScale8Image}を作成します。
     *
     * @param width  新しいイメージの幅
     * @param height 新しいイメージの高さ
     * @param image  新しいイメージの画像情報を含むbyte[]
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createEditableGrayScale8Image(int width, int height, byte[] image) throws IllegalArgumentException;

    /**
     * 指定された高さと幅から背景色が黒色のまっさらな新しい{@link EditableGrayScale8Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createEditableGrayScale8Image(int width, int height) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から背景色が黒色のまっさらな新しい{@link EditableGrayScale8Image}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link Vector2i}
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScale8Image createEditableGrayScale8Image(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableGrayScale8Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createEditableGrayScale8Image(int width, int height, byte backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableGrayScale8Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScale8Image createEditableGrayScale8Image(Vector2i size, byte backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableGrayScale8Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createEditableGrayScale8Image(int width, int height, int backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableGrayScale8Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScale8Image createEditableGrayScale8Image(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableGrayScale8Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableGrayScale8Image createEditableGrayScale8Image(int width, int height, GrayScale8Color backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableGrayScale8Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能グレースケールイメージ
     */
    EditableGrayScale8Image createEditableGrayScale8Image(Vector2i size, GrayScale8Color backgroundColor);

    /**
     * 幅と高さとRGB24形式の画像情報を含む{@code int[]}から新しい{@link CachedRGB24Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @param image  画像情報を含むint[]
     * @return 新しい不変RGBケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedRGB24Image createCachedRGB24Image(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 幅と高さとRGB24形式の画像情報を含む{@code int[]}から新しい{@link EditableRGB24Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @param image  画像情報を含むint[]
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGB24Image createEditableRGB24Image(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 指定された高さと幅から背景色が黒色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGB24Image createEditableRGB24Image(int width, int height) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から背景色が黒色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link Vector2i}
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGB24Image createEditableRGB24Image(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGB24Image createEditableRGB24Image(int width, int height, int backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGB24Image createEditableRGB24Image(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGB24Image createEditableRGB24Image(int width, int height, RGB24Color backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGB24Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBイメージ
     */
    EditableRGB24Image createEditableRGB24Image(Vector2i size, RGB24Color backgroundColor);

    /**
     * 幅と高さと3つのチャンネルごとの{@link CachedGrayScale8Image}から新しい{@link EditableCSRGB24Image}を作成します。
     *
     * @param height   新しい画像の高さ
     * @param width    新しい画像の幅
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScale8Image}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScale8Image}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScale8Image}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableCSRGB24Image createEditableCSRGB24Image(int width, int height, EditableGrayScale8Image channelR, EditableGrayScale8Image channelG, EditableGrayScale8Image channelB) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}と3つのチャンネルごとの{@link CachedGrayScale8Image}から新しい{@link EditableRGB24Image}を作成します。
     *
     * @param size     新しい画像の高さと幅の{@link Vector2i}
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScale8Image}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScale8Image}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScale8Image}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBイメージ
     */
    EditableCSRGB24Image createEditableCSRGB24Image(Vector2i size, EditableGrayScale8Image channelR, EditableGrayScale8Image channelG, EditableGrayScale8Image channelB);

    /**
     * 幅と高さとRGBA32形式の画像情報を含む{@code int[]}から新しい{@link CachedRGBA32Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @param image  画像情報を含むint[]
     * @return 新しい不変RGBAケールイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    CachedRGBA32Image createCachedRGBA32Image(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 幅と高さとRGB3A2形式の画像情報を含む{@code int[]}から新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @param image  画像情報を含むint[]
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createEditableRGBA32Image(int width, int height, int[] image) throws IllegalArgumentException;

    /**
     * 指定された高さと幅から背景色が透明(r, g, b, a)=(0, 0, 0, 0)のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height 新しい画像の高さ
     * @param width  新しい画像の幅
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createEditableRGBA32Image(int width, int height) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から背景色が透明(r, g, b, a)=(0, 0, 0, 0)のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param size 新しい画像の高さと幅の{@link Vector2i}
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBA32Image createEditableRGBA32Image(Vector2i size);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createEditableRGBA32Image(int width, int height, int backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBA32Image createEditableRGBA32Image(Vector2i size, int backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createEditableRGBA32Image(int width, int height, long backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBA32Image createEditableRGBA32Image(Vector2i size, long backgroundColor);

    /**
     * 指定された高さと幅から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param height          新しい画像の高さ
     * @param width           新しい画像の幅
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     * @throws IllegalArgumentException width &gt; 0 &amp;&amp; height &gt; 0でない、もしくはwidth * heightがimage.lengthと等しくない場合（指定されたサイズと画像のデータ量が不一致の場合）
     */
    EditableRGBA32Image createEditableRGBA32Image(int width, int height, RGBA32Color backgroundColor) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}から特定の背景色のまっさらな新しい{@link EditableRGBA32Image}を作成します。
     *
     * @param size            新しい画像の高さと幅の{@link Vector2i}
     * @param backgroundColor この画像いっぱいに埋める背景色
     * @return 新しい編集可能RGBAイメージ
     */
    EditableRGBA32Image createEditableRGBA32Image(Vector2i size, RGBA32Color backgroundColor);

    /**
     * 幅と高さと3つのチャンネルごとの{@link CachedGrayScale8Image}から新しい{@link EditableCSRGBA32Image}を作成します。
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
    EditableCSRGBA32Image createEditableCSRGBA32Image(int width, int height, EditableGrayScale8Image channelR, EditableGrayScale8Image channelG, EditableGrayScale8Image channelB, EditableGrayScale8Image channelA) throws IllegalArgumentException;

    /**
     * 指定された高さと幅を含む{@link Vector2i}と4つのチャンネルごとの{@link CachedGrayScale8Image}から新しい{@link EditableCSRGBA32Image}を作成します。
     *
     * @param size     新しい画像の高さと幅の{@link Vector2i}
     * @param channelR 新しい画像のRチャンネルの{@link CachedGrayScale8Image}
     * @param channelG 新しい画像のGチャンネルの{@link CachedGrayScale8Image}
     * @param channelB 新しい画像のBチャンネルの{@link CachedGrayScale8Image}
     * @param channelA 新しい画像のAチャンネルの{@link CachedGrayScale8Image}
     * @return チャンネルごとの編集可能なグレースケールイメージを持つRGBAイメージ
     */
    EditableCSRGBA32Image createEditableCSRGBA32Image(Vector2i size, EditableGrayScale8Image channelR, EditableGrayScale8Image channelG, EditableGrayScale8Image channelB, EditableGrayScale8Image channelA);

}
