package net.spicesoftware.api.util.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;

import java.util.Map;

/**
 * 円形グラデーションです。
 *
 * @since 2015/02/01
 */

public abstract class GradientFillingLinear<T extends Color> extends ColorStopGradientFilling<T> {

    protected GradientFillingLinear(Map<Integer, T> colorStopMap, boolean repeating) {
        super(colorStopMap, repeating);
    }

    protected GradientFillingLinear(GradientFillingLinear<T> copyFrom) {
        super(copyFrom);
    }

    @Override
    public abstract GradientFillingLinear<T> copyDeeply();
}
