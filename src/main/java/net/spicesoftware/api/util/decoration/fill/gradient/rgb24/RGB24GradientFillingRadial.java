package net.spicesoftware.api.util.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.util.decoration.fill.color.RGB24Color;
import net.spicesoftware.api.util.decoration.fill.gradient.GradientFillingRadial;

import java.util.Map;

/**
 * @since 2015/07/08
 */
public final class RGB24GradientFillingRadial extends GradientFillingRadial<RGB24Color> {

    private RGB24GradientFillingRadial(Map<Integer, RGB24Color> colorStopMap, boolean repeating, int centerXPos, int centerYPos) {
        super(colorStopMap, repeating, centerXPos, centerYPos);
    }

    private RGB24GradientFillingRadial(GradientFillingRadial<RGB24Color> copyFrom) {
        super(copyFrom);
    }

    @Override
    public RGB24GradientFillingRadial copyDeeply() {
        return new RGB24GradientFillingRadial(this);
    }

    public static final class RGB24GradientFillingRadialBuilder extends GradientFillingRadialBasicBuilder<RGB24Color> {

        @Override
        public RGB24GradientFillingRadial build() {
            return new RGB24GradientFillingRadial(colorStopMap, repeating, centerXPos, centerYPos);
        }
    }
}
