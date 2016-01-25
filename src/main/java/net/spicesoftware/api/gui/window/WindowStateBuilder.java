package net.spicesoftware.api.gui.window;

import net.spicesoftware.api.Builder;
import net.spicesoftware.api.gui.window.location.WindowLocation;
import net.spicesoftware.api.gui.window.title.WindowTitle;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/12/12
 */
public interface WindowStateBuilder<T extends WindowState> extends Builder<T> {

    WindowStateBuilder<T> title(WindowTitle title);


    WindowStateBuilder<T> location(WindowLocation location);


    WindowStateBuilder<T> maxSize(Vector2i maxSize);

    WindowStateBuilder<T> minSize(Vector2i minSize);

    WindowStateBuilder<T> size(Vector2i size);

    WindowStateBuilder<T> sizeFixed();

    WindowStateBuilder<T> sizeFixed(boolean sizeFixed);


    WindowStateBuilder<T> invisible();

    WindowStateBuilder<T> visibility(boolean visibility);

    @Override
    default WindowStateBuilder<T> from(T copy) {
        fromWindowState(copy);
        return this;
    }

    default WindowStateBuilder<T> fromWindowState(WindowState copy) {
        title(copy.getTitle());
        location(copy.getLocation());
        maxSize(copy.getMaximumSize());
        minSize(copy.getMinimumSize());
        size(copy.getSize());
        sizeFixed(copy.isSizeFixed());
        visibility(copy.isVisible());
        return this;
    }
}
