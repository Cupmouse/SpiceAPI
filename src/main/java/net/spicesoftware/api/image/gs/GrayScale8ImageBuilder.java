package net.spicesoftware.api.image.gs;

import net.spicesoftware.api.decoration.fill.GrayScale8Color;
import net.spicesoftware.api.image.ImageBuilder;

/**
 * @since 2015/11/14
 */
public interface GrayScale8ImageBuilder<T extends GrayScale8Image> extends ImageBuilder<T> {

    /**
     * 作成する{@link EditableGrayScale8Image}の背景色を{@link GrayScale8Color}で設定します。
     *
     * @param backgroundColor 作成する{@link EditableGrayScale8Image}の背景色
     */
    GrayScale8ImageBuilder<T> background(GrayScale8Color backgroundColor);

    /**
     * 作成する{@link EditableGrayScale8Image}の背景色を{@link net.spicesoftware.api.decoration.fill.ColorType#GRAYSCALE8}の{@code byte}で設定します。
     *
     * @param backgroundColor 作成する{@link EditableGrayScale8Image}の背景色
     */
    GrayScale8ImageBuilder<T> background(byte backgroundColor);
}