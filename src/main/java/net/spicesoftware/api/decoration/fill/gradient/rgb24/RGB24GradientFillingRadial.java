package net.spicesoftware.api.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.decoration.fill.gradient.GradientFillingRadial;
import net.spicesoftware.api.util.color.RGB24Color;

/**
 * @since 2015/07/08
 */
public interface RGB24GradientFillingRadial extends RGB24GradientFilling, GradientFillingRadial<RGB24Color> {

    @Override
    RGB24GradientFillingRadial copyDeeply();
}
