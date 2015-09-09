package net.spicesoftware.api.util.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.util.decoration.fill.color.RGB24Color;
import net.spicesoftware.api.util.decoration.fill.gradient.GradientFillingLinear;

import java.util.Map;

/**
 * @since 2015/07/08
 */
public final class RGB24GradientFillingLinear extends GradientFillingLinear<RGB24Color> {

    public RGB24GradientFillingLinear(Map<Integer, RGB24Color> colorStopMap, boolean repeating) {
        super(colorStopMap, repeating);
    }

    public RGB24GradientFillingLinear(GradientFillingLinear<RGB24Color> copyFrom) {
        super(copyFrom);
    }

    @Override
    public RGB24GradientFillingLinear copyDeeply() {
        return new RGB24GradientFillingLinear(this);
    }

    public static final class RGB24GradientFillingLinearBuilder extends ColorStopGradientFillingBasicBuilder {

        @Override
        public RGB24GradientFillingLinear build() {
            return new RGB24GradientFillingLinear(colorStopMap, repeating);
        }
    }
}
