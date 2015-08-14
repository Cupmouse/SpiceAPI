package net.spicesoftware.api.util.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.util.decoration.fill.color.RGB24Color;
import net.spicesoftware.api.util.decoration.fill.gradient.GradientFillingLinear;

/**
 * @since 2015/07/08
 */
public final class RGB24GradientFillingLinear extends GradientFillingLinear<RGB24Color> {

    public RGB24GradientFillingLinear(RGB24Color firstColor, int firstColorPos, RGB24Color secondColor, int secondColorPos, boolean repeat) {
        super(firstColor, firstColorPos, secondColor, secondColorPos, repeat);
    }

    public RGB24GradientFillingLinear(RGB24Color firstColor, RGB24Color secondColor) {
        super(firstColor, secondColor);
    }

    public RGB24GradientFillingLinear(RGB24Color firstColor, int firstColorPos, RGB24Color secondColor, int secondColorPos) {
        super(firstColor, firstColorPos, secondColor, secondColorPos);
    }

    protected RGB24GradientFillingLinear() {
    }

    @Override
    public RGB24GradientFillingLinear copyDeeply() {
        RGB24GradientFillingLinear newOne = new RGB24GradientFillingLinear();
        copyDeeply(newOne);
        return newOne;
    }
}
