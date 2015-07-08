package net.spicesoftware.api.decoration;

import net.spicesoftware.api.decoration.fill.gradient.GradientFilling;
import net.spicesoftware.api.util.DeepCopyable;

/**
 * デコレーションを表すインターフェイスです。
 *
 * @see net.spicesoftware.api.decoration.fill.Color
 * @see net.spicesoftware.api.decoration.fill.PatternFilling
 * @see GradientFilling
 * @since 2015/01/26
 */
public interface Decoration extends DeepCopyable {

    @Override
    Decoration copyDeeply();
}
