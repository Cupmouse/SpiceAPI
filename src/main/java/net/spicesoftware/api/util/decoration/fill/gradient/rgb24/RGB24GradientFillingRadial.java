package net.spicesoftware.api.util.decoration.fill.gradient.rgb24;

import net.spicesoftware.api.util.decoration.fill.color.RGB24Color;
import net.spicesoftware.api.util.decoration.fill.gradient.GradientFillingRadial;

/**
 * @since 2015/07/08
 */
public final class RGB24GradientFillingRadial extends GradientFillingRadial<RGB24Color> {

    public RGB24GradientFillingRadial(RGB24Color firstColor, int firstColorPos, RGB24Color secondColor, int secondColorPos, boolean repeat) {
        super(firstColor, firstColorPos, secondColor, secondColorPos, repeat);
    }

    public RGB24GradientFillingRadial(RGB24Color firstColor, RGB24Color secondColor) {
        super(firstColor, secondColor);
    }

    public RGB24GradientFillingRadial(RGB24Color firstColor, int firstColorPos, RGB24Color secondColor, int secondColorPos) {
        super(firstColor, firstColorPos, secondColor, secondColorPos, false);
    }

    protected RGB24GradientFillingRadial() {
    }

    @Override
    public RGB24GradientFillingRadial copyDeeply() {
        RGB24GradientFillingRadial newOne = new RGB24GradientFillingRadial();
        copyDeeply(newOne);
        return newOne;
    }
}
