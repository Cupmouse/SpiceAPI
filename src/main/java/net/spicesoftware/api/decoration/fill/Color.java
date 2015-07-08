package net.spicesoftware.api.decoration.fill;

import net.spicesoftware.api.util.decoration.fill.color.GrayScaleColor;
import net.spicesoftware.api.util.decoration.fill.color.RGB24Color;
import net.spicesoftware.api.util.decoration.fill.color.RGBA32Color;

/**
 * 色を表すインターフェイスです。
 *
 * @see GrayScaleColor
 * @see RGB24Color
 * @see RGBA32Color
 * @since 2015/02/01
 */
public interface Color extends DecorationFilling {

    @Override
    Color copyDeeply();
}
