package net.spicesoftware.api.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/11/15
 */
public interface GradientFillingRadialBuilder<C extends Color, T extends ColorStopGradientFilling<C>> extends ColorStopGradientFillingBuilder<C, T> {

    /**
     * グラデーションの中心の位置を設定します。
     *
     * @param centerXPos 中心のx位置
     * @param centerYPos 中心のy位置
     */
    GradientFillingRadialBuilder<C, T> radialCenter(int centerXPos, int centerYPos);

    /**
     * グラデーションの中心の位置を{@link Vector2i}で設定します。
     *
     * @param centerPos 中心の位置
     */
    GradientFillingRadialBuilder<C, T> radialCenter(Vector2i centerPos);
}
