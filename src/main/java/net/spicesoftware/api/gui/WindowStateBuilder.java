package net.spicesoftware.api.gui;

import net.spicesoftware.api.Builder;
import net.spicesoftware.api.gui.location.WindowLocation;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/12/12
 */
public interface WindowStateBuilder<T extends WindowState> extends Builder<T> {

    WindowStateBuilder<T> title(WindowTitle windowTitle);


    WindowStateBuilder<T> location(WindowLocation windowLocation);


    WindowStateBuilder<T> maxSize(Vector2i maxSize);

    WindowStateBuilder<T> minSize(Vector2i minSize);

    WindowStateBuilder<T> size(Vector2i size);

    WindowStateBuilder<T> sizeFixed();

    WindowStateBuilder<T> sizeFixed(boolean sizeFixed);


    WindowStateBuilder<T> invisible();

    WindowStateBuilder<T> visibility(boolean visibility);
}
