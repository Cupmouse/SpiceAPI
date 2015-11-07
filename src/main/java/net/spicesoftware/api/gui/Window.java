package net.spicesoftware.api.gui;

import net.spicesoftware.api.util.vector.Vector2i;

import java.util.Optional;

/**
 * @since 2015/10/23
 */
public interface Window<WS extends WindowSystem> {

    /**
     * この{@code Window}のデフォルト{@link WindowTitle}を{@link Optional}で返します。
     *
     * @return この{@code Window}のデフォルト{@link WindowTitle}
     */
    Optional<WindowTitle> getDefaultTitle();

    /**
     * この{@code Window}のデフォルトサイズを{@link Vector2i}で返します。
     *
     * @return この{@code Window}のデフォルトサイズ
     */
    Vector2i getDefaultSize();
}
