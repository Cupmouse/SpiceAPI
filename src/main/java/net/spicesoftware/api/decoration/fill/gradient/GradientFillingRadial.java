package net.spicesoftware.api.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;

/**
 * 円形グラデーションです。
 *
 * @since 2015/02/01
 */
public interface GradientFillingRadial<T extends Color> extends ColorStopGradientFilling<T> {

    @Override
    GradientFillingRadial<T> copyDeeply();
}
