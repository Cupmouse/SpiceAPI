package net.spicesoftware.api.gui.window.location;

import net.spicesoftware.api.util.vector.Vector2i;

/**
 * 画面上の絶対的な位置を表す場合、{@link WindowLocationAbsolute}を利用してください。
 * 相対的な位置を表す、例えば、画面の中央や、左端などの位置を表すなら、{@link WindowLocationRelative}を利用してください。
 * また、{@link WindowLocationRelative}では、オフセットを利用できます。
 *
 * @since 2015/10/31
 */
public interface WindowLocation {

    /**
     * 指定されたウィンドウのサイズの{@link Vector2i}から、この{@code WindowLocation}のウィンドウ内の絶対位置を返します。
     *
     * @param windowSize ウィンドウのサイズ
     * @return この{@code WindowLocation}のウィンドウ内の絶対位置
     */
    Vector2i getPosition(Vector2i windowSize);
}
