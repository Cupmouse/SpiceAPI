package net.spicesoftware.api.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.decoration.fill.gradient.GradientFillingLinear;
import net.spicesoftware.api.util.color.RGB24Color;

/**
 * @since 2015/07/08
 */
public interface RGB24GradientFillingLinear extends RGB24GradientFilling, GradientFillingLinear<RGB24Color> {

    @Override
    RGB24GradientFillingLinear copyDeeply();
}
