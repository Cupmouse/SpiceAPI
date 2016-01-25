package net.spicesoftware.api.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * 円形グラデーションです。
 *
 * @since 2015/02/01
 */
public interface GradientFillingRadial<T extends Color> extends ColorStopGradientFilling<T> {

    @Override
    GradientFillingRadial<T> copyDeeply();

    Vector2i getRadialCenter();

    int getRadialCenterX();

    int getRadialCenterY();

    /**
     * @since 2015/11/15
     */
    interface IBuilder<C extends Color, T extends ColorStopGradientFilling<C>> extends ColorStopGradientFilling.IBuilder<C, T> {

        /**
         * グラデーションの中心の位置を設定します。
         *
         * @param centerXPos 中心のx位置
         * @param centerYPos 中心のy位置
         */
        IBuilder radialCenter(int centerXPos, int centerYPos);

        /**
         * グラデーションの中心の位置を{@link Vector2i}で設定します。
         *
         * @param centerPos 中心の位置
         */
        IBuilder radialCenter(Vector2i centerPos);
    }
}
