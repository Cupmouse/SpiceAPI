package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.RGBA32Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 内容の編集可能なRGBAのイメージです。
 *
 * @since 2015/01/17
 */
public interface RGBAImageEditable extends RGBAImage {

    /**
     * この{@code RGBAImageEditable}の指定されたx, yの位置にRGB24の{@code int}と透明度を指定して色を設定します。
     *
     * @param x 色を設定するx位置
     * @param y 色を設定するy位置
     * @param color 設定するRGB24形式の色
     * @param transparent 設定する色の0～0xFFの透明度
     */
    void setColor(@Min(0) int x, @Min(0) int y, @Min(0) @Max(0xFFFFFF) int color, @Min(0) @Max(0xFF) int transparent);

    /**
     * この{@code RGBAImageEditable}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にRGB24の{@code int}と透明度を指定して色を設定します。
     *
     * @param vector2i 色を設定する位置
     * @param color 設定するRGB24形式の色
     * @param transparent 設定する色の0～0xFFの透明度
     */
    void setColor(Vector2i vector2i, @Min(0) @Max(0xFFFFFF) int color, @Min(0) @Max(0xFF) int transparent);

    /**
     * この{@code RGBAImageEditable}の指定されたx, yの位置にRGBA32の{@code long}を指定して色を設定します。
     *
     * @param x 色を設定するx位置
     * @param y 色を設定するy位置
     * @param color 設定するRGBA32形式の色
     */
    void setColor(@Min(0) int x, @Min(0) int y, @Min(0) @Max(0xFFFFFFFF) long color);

    /**
     * この{@code RGBAImageEditable}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にRGBA32の{@code long}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color 設定するRGBA32形式の色
     */
    void setColor(Vector2i position, @Min(0) @Max(0xFFFFFFFF) long color);

    /**
     * この{@code RGBAImageEditable}の指定されたx, yの位置に{@link net.spicesoftware.api.util.color.RGBA32Color}を指定して色を設定します。
     *
     * @param x 色を設定するx位置
     * @param y 色を設定するy位置
     * @param color 設定する色
     */
    void setColor(@Min(0) int x, @Min(0) int y, RGBA32Color color);

    /**
     * この{@code RGBAImageEditable}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置に{@link net.spicesoftware.api.util.color.RGBA32Color}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color 設定する色
     */
    void setColor(Vector2i position, RGBA32Color color);

    /**
     * 現在のこの{@code RGBAImageEditable}の内容をコピーした{@link net.spicesoftware.api.image.CachedRGBAImage}を返します。
     * この関数を実行した後でも編集は継続できますが、以降の変更は{@code CachedRGBAImage}には反映されません。
     *
     * @return この内容をコピーしたCachedRGBAImage
     */
    CachedRGBAImage makeImage();

    @Override
    RGBAImageEditable copyDeeply();
}
