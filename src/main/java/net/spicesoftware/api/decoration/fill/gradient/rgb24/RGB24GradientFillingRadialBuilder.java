package net.spicesoftware.api.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.decoration.fill.gradient.GradientFillingRadialBuilder;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/11/15
 */
public interface RGB24GradientFillingRadialBuilder extends GradientFillingRadialBuilder<RGB24Color, RGB24GradientFillingRadial> {

    @Override
    RGB24GradientFillingRadialBuilder radialCenter(int centerXPos, int centerYPos);

    @Override
    RGB24GradientFillingRadialBuilder radialCenter(Vector2i centerPos);

    @Override
    RGB24GradientFillingRadialBuilder colorStopAt(@Min(0) @Max(999) int i, RGB24Color color);

    @Override
    RGB24GradientFillingRadialBuilder repeating(boolean repeating);

    @Override
    RGB24GradientFillingRadialBuilder repeat();
}
