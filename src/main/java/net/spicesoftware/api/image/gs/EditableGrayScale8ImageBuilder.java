package net.spicesoftware.api.image.gs;

import net.spicesoftware.api.image.ImageBuilder;
import net.spicesoftware.api.util.decoration.fill.color.GrayScale8Color;

/**
 * @since 2015/11/14
 */
public interface EditableGrayScale8ImageBuilder extends ImageBuilder<EditableGrayScale8Image> {

    /**
     * 作成する{@link EditableGrayScale8Image}の背景色を{@link GrayScale8Color}で設定します。
     *
     * @param grayScale8Color 作成する{@link EditableGrayScale8Image}の背景色
     */
    void background(GrayScale8Color grayScale8Color);

    /**
     * 作成する{@link EditableGrayScale8Image}の背景色を{@link net.spicesoftware.api.util.decoration.fill.color.ColorType#GRAYSCALE8}の{@code byte}で設定します。
     *
     * @param background 作成する{@link EditableGrayScale8Image}の背景色
     */
    void background(byte background);
}
