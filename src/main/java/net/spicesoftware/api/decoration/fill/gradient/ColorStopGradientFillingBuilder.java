package net.spicesoftware.api.decoration.fill.gradient;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.decoration.fill.Color;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/11/15
 */
public interface ColorStopGradientFillingBuilder<C extends Color, T extends ColorStopGradientFilling<C>> extends ParameterEssentialBuilder<T> {

    /**
     * この{@code GradientFilling}の指定された位置の中間色を設定します。
     *
     * @param i     中間色を設定する位置
     * @param color 中間色にとして設定する色
     */
    ColorStopGradientFillingBuilder<C, T> colorStopAt(@Min(0) @Max(999) int i, C color);

    /**
     * この{@code GradientFilling}がリピートするかどうかを設定します。
     *
     * @param repeating このグラデーションがリピートするかどうか
     */
    ColorStopGradientFillingBuilder<C, T> repeating(boolean repeating);

    /**
     * この{@code GradientFilling}がリピートするように設定します。
     */
    ColorStopGradientFillingBuilder<C, T> repeat();
}
