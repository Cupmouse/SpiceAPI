package net.spicesoftware.api.util.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;

/**
 * 円形グラデーションです。
 *
 * @since 2015/02/01
 */

public abstract class GradientFillingLinear<T extends Color> extends ColorStopGradientFilling<T> {

    public GradientFillingLinear(T firstColor, int firstColorPos, T secondColor, int secondColorPos, boolean repeat) {
        super(firstColor, firstColorPos, secondColor, secondColorPos, repeat);
    }

    public GradientFillingLinear(T firstColor, T secondColor) {
        super(firstColor, secondColor);
    }

    public GradientFillingLinear(T firstColor, int firstColorPos, T secondColor, int secondColorPos) {
        super(firstColor, firstColorPos, secondColor, secondColorPos);
    }

    protected GradientFillingLinear() {
    }

    @Override
    public abstract GradientFillingLinear<T> copyDeeply();
}
