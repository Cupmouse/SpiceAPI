package net.spicesoftware.api.image.gs;

import net.spicesoftware.api.decoration.fill.ColorType;
import net.spicesoftware.api.decoration.fill.GrayScale8Color;
import net.spicesoftware.api.image.ImageBuilder;

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
     * 作成する{@link EditableGrayScale8Image}の背景色を{@link ColorType#GRAYSCALE8}の{@code byte}で設定します。
     *
     * @param background 作成する{@link EditableGrayScale8Image}の背景色
     */
    void background(byte background);
}
