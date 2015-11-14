package net.spicesoftware.api.image.rgba;

import net.spicesoftware.api.image.ImageBuilder;
import net.spicesoftware.api.util.decoration.fill.color.RGBA32Color;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/11/14
 */
public interface RGBA32ImageBuilder<T extends RGBA32Image> extends ImageBuilder<T> {

    /**
     * 作成する{@link RGBA32Image}の背景色を{@link RGBA32Color}で設定します。
     *
     * @param rgba32Color 作成する{@link RGBA32Image}の背景色
     */
    void background(RGBA32Color rgba32Color);

    /**
     * 作成する{@link RGBA32Image}の背景色を{@link net.spicesoftware.api.util.decoration.fill.color.ColorType#RGBA32}の{@code int}で設定します。
     *
     * @param rgba32 作成する{@link RGBA32Image}の背景色
     */
    void background(int rgba32);

    /**
     * 作成する{@link RGBA32Image}の背景色を{@link net.spicesoftware.api.util.decoration.fill.color.ColorType#RGBA32}の{@code long}で設定します。
     *
     * @param rgba32 作成する{@link RGBA32Image}の背景色
     * @throws IllegalArgumentException 指定された背景色が範囲外の場合
     */
    void background(@Min(0) @Max(0xFFFFFFFF) long rgba32) throws IllegalArgumentException;
}
