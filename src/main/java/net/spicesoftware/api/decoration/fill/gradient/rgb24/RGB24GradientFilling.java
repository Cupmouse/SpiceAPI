package net.spicesoftware.api.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.decoration.fill.gradient.GradientFilling;
import net.spicesoftware.api.util.color.RGB24Color;

/**
 * @since 2015/07/08
 */
public interface RGB24GradientFilling extends GradientFilling<RGB24Color> {

    @Override
    RGB24GradientFilling copyDeeply();
}
