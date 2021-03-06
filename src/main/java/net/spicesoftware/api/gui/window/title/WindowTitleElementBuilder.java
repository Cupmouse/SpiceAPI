package net.spicesoftware.api.gui.window.title;

import net.spicesoftware.api.Builder;

/**
 * @since 2015/12/10
 */
public interface WindowTitleElementBuilder<T extends WindowTitleElement> extends Builder<T> {

    WindowTitleElementBuilder<T> label(Object label);

    @Override
    WindowTitleElementBuilder<T> from(T copy);
}
