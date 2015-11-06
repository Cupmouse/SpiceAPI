package net.spicesoftware.api.gui.location;

import net.spicesoftware.api.util.vector.Vector2i;

/**
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
