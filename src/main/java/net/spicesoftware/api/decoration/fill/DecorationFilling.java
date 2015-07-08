package net.spicesoftware.api.decoration.fill;

import net.spicesoftware.api.decoration.Decoration;
import net.spicesoftware.api.decoration.fill.gradient.GradientFilling;

/**
 * 塗りつぶしのデコレーションです。
 *
 * @see GradientFilling
 * @see PatternFilling
 * @since 2015/02/04
 */
public interface DecorationFilling extends Decoration {

    @Override
    DecorationFilling copyDeeply();
}
