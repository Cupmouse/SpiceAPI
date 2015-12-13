package net.spicesoftware.api.gui;

import java.util.Optional;

/**
 * @since 2015/10/22
 */
public interface WindowDispenser {

    /**
     * 指定された{@link Window}をディスペンスします。
     * {@link WindowState}は指定された{@link Window}のデフォルトが適用されます。
     *
     * @param window ディスペンスする{@link Window}
     * @return ディスペンスされた{@link Window}
     */
    Optional<WindowSession> dispense(Window window);

    /**
     * 指定された{@link Window}を指定された{@link WindowState}でディスペンスします。
     *
     * @param window      ディスペンスする{@link Window}
     * @param windowState ディスペンスする{@link Window}の{@link WindowState}
     * @return ディスペンスされた{@link Window}
     */
    Optional<WindowSession> dispense(Window window, WindowState windowState);
}
