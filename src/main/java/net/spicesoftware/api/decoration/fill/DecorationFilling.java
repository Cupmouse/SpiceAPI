package net.spicesoftware.api.decoration.fill;

import net.spicesoftware.api.decoration.Decoration;

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
