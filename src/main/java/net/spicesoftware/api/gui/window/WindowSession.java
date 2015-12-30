package net.spicesoftware.api.gui.window;

import java.util.Optional;

/**
 * @since 2015/10/23
 */
public interface WindowSession<T extends WindowSystem, W extends Window<T>> {

    /**
     * {@link Window}を返します。
     *
     * @return {@link Window}
     */
    Optional<W> getWindow();

    /**
     * この{@code WindowSession}の{@link WindowState}を{@link Optional}で返します。<br>
     * すでに閉じられている場合、空の{@link Optional}を返します。
     *
     * @return この{@code WindowSession}の{@link WindowState}
     */
    Optional<? extends WindowState> getWindowState();

    /**
     * この{@code WindowSession}を閉じます。
     *
     * @throws IllegalStateException すでに閉じられている場合
     */
    void close() throws IllegalStateException;
}
