package net.spicesoftware.api.image.gs;

import net.spicesoftware.api.image.ImageEditable;
import net.spicesoftware.api.util.decoration.fill.color.GrayScale8Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 内容の編集可能なグレースケールのイメージです。
 *
 * @since 2015/01/17
 */
public interface EditableGrayScale8Image extends GrayScale8Image, ImageEditable {

    /**
     * この{@code EditableGrayScale8Image}の指定されたx, yの位置に0～0xFFの値の{@code int}を指定して色を設定します。
     *
     * @param x     色を設定するx位置
     * @param y     色を設定するy位置
     * @param color 設定する白さ
     *              0～0xFF
     */
    void setColor(@Min(0) int x, @Min(0) int y, @Min(0) @Max(0xFF) int color);

    /**
     * この{@code EditableGrayScale8Image}の指定された{@link Vector2i}の位置に0～0xFFの値の{@code int}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color    設定する白さ
     *                 0～0xFF
     */
    void setColor(Vector2i position, @Min(0) @Max(0xFF) int color);

    /**
     * この{@code EditableGrayScale8Image}の指定されたx, yの位置に符号なし整数（-128～127）の{@code int}を指定して色を設定します。
     *
     * @param x     色を設定するx位置
     * @param y     色を設定するy位置
     * @param color 設定する白さ
     *              -128～127
     */
    void setColor(@Min(0) int x, @Min(0) int y, @Min(-128) @Max(127) byte color);

    /**
     * この{@code EditableGrayScale8Image}の指定された{@link Vector2i}の位置に符号なし整数（-128～127）の{@code int}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color    設定する白さ
     *                 -128～127
     */
    void setColor(Vector2i position, @Min(-128) @Max(127) byte color);

    /**
     * この{@code EditableGrayScale8Image}の指定されたx, yの位置に{@link GrayScale8Color}を指定して色を設定します。
     *
     * @param x     色を設定するx位置
     * @param y     色を設定するy位置
     * @param color 設定する白さ
     */
    void setColor(@Min(0) int x, @Min(0) int y, GrayScale8Color color);

    /**
     * この{@code EditableGrayScale8Image}の指定された{@link Vector2i}の位置に{@link GrayScale8Color}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color    設定する白さ
     */
    void setColor(Vector2i position, GrayScale8Color color);

    @Override
    CachedGrayScale8Image makeImage();

    @Override
    EditableGrayScale8Image copyDeeply();
}
