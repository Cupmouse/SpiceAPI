package net.spicesoftware.api.decoration.fill;

/**
 * 線形グラデーションです。
 *
 * @since 2015/02/01
 */
public interface GradientFillingLinear<T extends Color> extends GradientFilling<T> {

    @Override
    GradientFillingLinear<T> copyDeeply();
}
