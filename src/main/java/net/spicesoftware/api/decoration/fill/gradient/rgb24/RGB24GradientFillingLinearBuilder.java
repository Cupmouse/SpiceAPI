package net.spicesoftware.api.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.decoration.fill.gradient.ColorStopGradientFillingBuilder;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/11/15
 */
public interface RGB24GradientFillingLinearBuilder extends ColorStopGradientFillingBuilder<RGB24Color, RGB24GradientFillingLinear> {

    @Override
    RGB24GradientFillingLinearBuilder colorStopAt(@Min(0) @Max(999) int i, RGB24Color color);

    @Override
    RGB24GradientFillingLinearBuilder repeating(boolean repeating);

    @Override
    RGB24GradientFillingLinearBuilder repeat();
}
