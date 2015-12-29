package net.spicesoftware.api.gui.window;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.gui.window.location.WindowLocation;
import net.spicesoftware.api.gui.window.title.WindowTitle;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/12/10
 */
public interface WindowStateImmutable extends WindowState {

    static Builder immutable() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    interface Builder extends WindowStateBuilder<WindowStateImmutable> {

        @Override
        Builder title(WindowTitle windowTitle);

        @Override
        Builder location(WindowLocation windowLocation);

        @Override
        Builder maxSize(Vector2i maxSize);

        @Override
        Builder minSize(Vector2i minSize);

        @Override
        Builder size(Vector2i size);

        @Override
        Builder sizeFixed();

        @Override
        Builder sizeFixed(boolean sizeFixed);

        @Override
        Builder invisible();

        @Override
        Builder visibility(boolean visibility);
    }
}
