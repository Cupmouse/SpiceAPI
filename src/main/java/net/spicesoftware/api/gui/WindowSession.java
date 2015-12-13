package net.spicesoftware.api.gui;

import java.util.Optional;

/**
 * @since 2015/10/23
 */
public interface WindowSession<WS extends WindowSystem> {

    /**
     * {@link Window}を返します。
     *
     * @return {@link Window}
     */
    Optional<Window> getWindow();

    /**
     * この{@code WindowSession}の{@link WindowState}を{@link Optional}で返します。<br>
     * すでに閉じられている場合、空の{@link Optional}を返します。
     *
     * @return この{@code WindowSession}の{@link WindowState}
     */
    Optional<WindowState> getWindowState();

    /**
     * この{@code WindowSession}を閉じます。
     */
    void close();
}
