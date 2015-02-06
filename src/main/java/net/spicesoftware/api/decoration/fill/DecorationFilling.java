package net.spicesoftware.api.decoration.fill;

import net.spicesoftware.api.decoration.Decoration;

/**
 * 塗りつぶしのデコレーションです。
 *
 * @see net.spicesoftware.api.decoration.fill.GradientFilling
 * @see net.spicesoftware.api.decoration.fill.PatternFilling
 * @since 2015/02/04
 */
public interface DecorationFilling extends Decoration {

    @Override
    DecorationFilling copyDeeply();
}
