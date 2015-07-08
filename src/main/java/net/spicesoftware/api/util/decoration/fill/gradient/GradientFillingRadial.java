package net.spicesoftware.api.util.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;

/**
 * 円形グラデーションです。
 *
 * @since 2015/02/01
 */
public abstract class GradientFillingRadial<T extends Color> extends ColorStopGradientFilling<T> {

    public GradientFillingRadial(T firstColor, int firstColorPos, T secondColor, int secondColorPos, boolean repeat) {
        super(firstColor, firstColorPos, secondColor, secondColorPos, repeat);
    }

    public GradientFillingRadial(T firstColor, int firstColorPos, T secondColor, int secondColorPos) {
        super(firstColor, firstColorPos, secondColor, secondColorPos, false);
    }

    protected GradientFillingRadial() {
    }

    @Override
    public abstract GradientFillingRadial<T> copyDeeply();
}
