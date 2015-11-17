package net.spicesoftware.api.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.decoration.fill.gradient.GradientFillingLinear;

/**
 * @since 2015/07/08
 */
public interface RGB24GradientFillingLinear extends GradientFillingLinear<RGB24Color> {

    @Override
    RGB24GradientFillingLinear copyDeeply();
}
