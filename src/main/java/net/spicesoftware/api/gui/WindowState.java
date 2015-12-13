package net.spicesoftware.api.gui;

import net.spicesoftware.api.gui.location.WindowLocation;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/10/23
 */
public interface WindowState {

    /**
     * {@link Window}の{@link WindowTitle}を返します。
     *
     * @return {@link Window}の{@link WindowTitle}
     */
    WindowTitle getTitle();


    /**
     * {@link Window}の位置の{@link Vector2i}を返します。
     *
     * @return {@link Window}の位置の{@link Vector2i}
     */
    WindowLocation getWindowLocation();


    /**
     * {@link Window}の最大サイズの{@link Vector2i}を返します。
     *
     * @return {@link Window}の最大サイズの{@link Vector2i}
     */
    Vector2i getMaximumSize();

    /**
     * {@link Window}の最小サイズの{@link Vector2i}を返します。
     *
     * @return {@link Window}の最小サイズの{@link Vector2i}
     */
    Vector2i getMinimumSize();

    /**
     * {@link Window}のサイズの{@link Vector2i}を返します。
     *
     * @return {@link Window}のサイズの{@link Vector2i}
     */
    Vector2i getSize();

    /**
     * サイズが固定されているかどうかを{@code boolean}で返します。
     *
     * @return サイズが固定されているかどうか
     */
    boolean isSizeFixed();


    /**
     * {@link Window}が見えるかどうかを返します。
     *
     * @return {@link Window}が見えるかどうか
     */
    boolean isVisible();
}
