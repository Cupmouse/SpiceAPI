package net.spicesoftware.api.decoration.fill;

/**
 * 色を表すインターフェイスです。
 *
 * @see GrayScale8Color
 * @see RGB24Color
 * @see RGBA32Color
 * @since 2015/02/01
 */
public interface Color extends DecorationFilling {

    @Override
    Color copyDeeply();
}
