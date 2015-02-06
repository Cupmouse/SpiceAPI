package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.GrayScaleColor;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 内容の編集可能なグレースケールのイメージです。
 *
 * @since 2015/01/17
 */
public interface GrayScaleImageEditable extends GrayScaleImage, ImageEditable {

    /**
     * この{@code GrayScaleImageEditable}の指定されたx, yの位置に0～0xFFの値の{@code int}を指定して色を設定します。
     *
     * @param x     色を設定するx位置
     * @param y     色を設定するy位置
     * @param color 設定する色
     *              0～0xFF
     */
    void setColor(@Min(0) int x, @Min(0) int y, @Min(0) @Max(0xFF) int color);

    /**
     * この{@code GrayScaleImageEditable}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置に0～0xFFの値の{@code int}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color    設定する白さ
     *                 0～0xFF
     */
    void setColor(Vector2i position, @Min(0) @Max(0xFF) int color);

    /**
     * この{@code GrayScaleImageEditable}の指定されたx, yの位置に{@link net.spicesoftware.api.util.color.GrayScaleColor}を指定して色を設定します。
     *
     * @param x     色を設定するx位置
     * @param y     色を設定するy位置
     * @param color 設定する色
     */
    void setColor(@Min(0) int x, @Min(0) int y, GrayScaleColor color);

    /**
     * この{@code GrayScaleImageEditable}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置に{@link net.spicesoftware.api.util.color.GrayScaleColor}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color    設定する色
     */
    void setColor(Vector2i position, GrayScaleColor color);

    @Override
    CachedGrayScaleImage makeImage();

    @Override
    GrayScaleImageEditable copyDeeply();
}
