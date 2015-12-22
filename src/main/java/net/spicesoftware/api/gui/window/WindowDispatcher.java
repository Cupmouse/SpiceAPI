package net.spicesoftware.api.gui.window;

import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

/**
 * @since 2015/10/28
 */
public interface WindowDispatcher<WS extends WindowSystem> {

    <W extends Window<WS>> W createNewWindow(Class<W> clazz);

    void registerWindowSupplier(WS windowSystem, String id, Supplier<Window<WS>> windowSupplier, WindowStateImmutable defaultState);

    Set<WindowSession<WS, ? extends Window<WS>>> getDispensed();

    <W extends Window<WS>> Set<WindowSession<WS, W>> getDispensed(Class<W> clazz);

    /**
     * 指定された{@link Window}をディスペンスします。
     * {@link WindowState}は指定された{@link Window}のデフォルトが適用されます。
     *
     * @param window ディスペンスする{@link Window}
     * @return ディスペンスされた{@link Window}
     */
    <W extends Window<WS>> Optional<WindowSession<WS, W>> dispense(W window);

    /**
     * 指定された{@link Window}を指定された{@link WindowState}でディスペンスします。
     *
     * @param window      ディスペンスする{@link Window}
     * @param windowState ディスペンスする{@link Window}の{@link WindowState}
     * @return ディスペンスされた{@link Window}
     */
    <W extends Window<WS>> Optional<WindowSession<WS, W>> dispense(Window<WS> window, WindowStateMutable windowState);
}
