package net.spicesoftware.api.image.rgb;

import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.image.ImageBuilder;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/11/14
 */
public interface RGB24ImageBuilder<T extends RGB24Image> extends ImageBuilder<T> {

    /**
     * 作成する{@link RGB24Image}の背景色を{@link RGB24Color}で設定します。
     *
     * @param rgb24Color 作成する{@link RGB24Image}の背景色
     */
    RGB24ImageBuilder<T> background(RGB24Color rgb24Color);

    /**
     * 作成する{@link RGB24Image}の背景色を{@link net.spicesoftware.api.decoration.fill.ColorType#RGB24}の{@code int}で設定します。
     *
     * @param background 作成する{@link RGB24Image}の背景色
     * @throws IllegalArgumentException 指定された背景色が範囲外の場合
     */
    RGB24ImageBuilder<T> background(@Min(0) @Max(0xFFFFFF) int background) throws IllegalArgumentException;
}