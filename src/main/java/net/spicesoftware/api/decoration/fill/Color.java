package net.spicesoftware.api.decoration.fill;

/**
 * 色を表すインターフェイスです。
 *
 * @see net.spicesoftware.api.util.color.GrayScaleColor
 * @see net.spicesoftware.api.util.color.RGB24Color
 * @see net.spicesoftware.api.util.color.RGBA32Color
 * @since 2015/02/01
 */
public interface Color extends DecorationFilling {

    @Override
    Color copyDeeply();
}
