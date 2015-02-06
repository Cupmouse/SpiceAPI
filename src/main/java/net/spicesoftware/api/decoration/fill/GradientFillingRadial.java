package net.spicesoftware.api.decoration.fill;

/**
 * 円形グラデーションです。
 *
 * @since 2015/02/01
 */
public interface GradientFillingRadial<T extends Color> extends GradientFilling<T> {

    @Override
    GradientFillingRadial<T> copyDeeply();
}
