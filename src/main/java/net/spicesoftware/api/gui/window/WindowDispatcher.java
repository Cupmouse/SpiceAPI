package net.spicesoftware.api.gui.window;

import net.spicesoftware.api.util.AlreadyRegisteredException;
import net.spicesoftware.api.util.Pair;

import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

/**
 * @since 2015/10/28
 */
public interface WindowDispatcher<WS extends WindowSystem, WC extends Window<WS>> {

    <W extends WC> Pair<W, WindowStateImmutable> createNewWindow(Class<W> clazz);

    void registerWindowSupplier(String id, Supplier<? extends WC> windowSupplier, WindowStateImmutable defaultState) throws AlreadyRegisteredException;

    Set<? extends WindowSession<WS, ? extends Window<WS>>> getDispensed();

    <W extends WC> Set<? extends WindowSession<WS, W>> getDispensed(Class<W> clazz);

    /**
     * 指定された{@link Window}をディスペンスします。
     * {@link WindowState}は指定された{@link Window}のデフォルトが適用されます。
     *
     * @param window ディスペンスする{@link Window}
     * @return ディスペンスされた{@link WindowSession}
     */
    <W extends WC> WindowSession<WS, W> dispense(W window);

    /**
     * 指定された{@link Window}を指定された{@link WindowState}でディスペンスします。
     *
     * @param window      ディスペンスする{@link Window}
     * @param windowState ディスペンスする{@link Window}の{@link WindowState}
     * @return ディスペンスされた{@link WindowSession}
     */
    <W extends WC> WindowSession<WS, W> dispense(W window, WindowState windowState);
}
