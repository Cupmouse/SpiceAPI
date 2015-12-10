package net.spicesoftware.api.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.decoration.fill.gradient.GradientFillingRadial;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/07/08
 */
public interface RGB24GradientFillingRadial extends GradientFillingRadial<RGB24Color> {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    @Override
    RGB24GradientFillingRadial copyDeeply();

    /**
     * @since 2015/11/15
     */
    interface Builder extends IBuilder<RGB24Color, RGB24GradientFillingRadial> {

        @Override
        Builder radialCenter(int centerXPos, int centerYPos);

        @Override
        Builder radialCenter(Vector2i centerPos);

        @Override
        Builder colorStopAt(@Min(0) @Max(999) int i, RGB24Color color);

        @Override
        Builder repeating(boolean repeating);

        @Override
        Builder repeat();
    }
}
