package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.RGB24Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 内容の編集可能なRGBのイメージです。
 *
 * @since 2015/01/17
 */
public interface RGBImageEditable extends RGBImage {

    /**
     * この{@code RGBImageEditable}の指定されたx, yの位置にRGB24の{@code int}を指定して色を設定します。
     *
     * @param x 色を設定するx位置
     * @param y 色を設定するy位置
     * @param color 設定するRGB24形式の色
     */
    void setColor(@Min(0) int x, @Min(0) int y, @Min(0) @Max(0xFFFFFF) int color);

    /**
     * この{@code RGBImageEditable}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にRGB24の{@code int}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color 設定するRGB24形式の色
     */
    void setColor(Vector2i position, @Min(0) @Max(0xFFFFFF) int color);

    /**
     * この{@code RGBImageEditable}の指定されたx, yの位置に{@link net.spicesoftware.api.util.color.RGB24Color}を指定して色を設定します。
     *
     * @param x 色を設定するx位置
     * @param y 色を設定するy位置
     * @param color 設定する色
     */
    void setColor(@Min(0) int x, @Min(0) int y, RGB24Color color);

    /**
     * この{@code RGBImageEditable}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置に{@link net.spicesoftware.api.util.color.RGB24Color}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color 設定する色
     */
    void setColor(Vector2i position, RGB24Color color);

    /**
     * 現在のこの{@code RGBImageEditable}の内容をコピーした{@link net.spicesoftware.api.image.CachedRGBImage}を返します。
     * この関数を実行した後でも編集は継続できますが、以降の変更は{@code CachedRGBImage}には反映されません。
     *
     * @return この内容をコピーしたCachedRGBImage
     */
    CachedRGBImage makeImage();

    @Override
    RGBImageEditable copyDeeply();
}
