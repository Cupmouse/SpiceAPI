package net.spicesoftware.api.gui.location;

import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/10/31
 */
public final class WindowLocationAbsolute implements WindowLocation {

    private final Vector2i position;

    private WindowLocationAbsolute(Vector2i position) {
        this.position = position;
    }

    @Override
    public Vector2i getPosition(Vector2i windowSize) {
        return position;
    }

    public static WindowLocationAbsolute windowLocationAbsolute(Vector2i position) {
        return new WindowLocationAbsolute(position);
    }
}
