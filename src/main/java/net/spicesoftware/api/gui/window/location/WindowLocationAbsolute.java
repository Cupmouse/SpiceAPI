package net.spicesoftware.api.gui.window.location;

import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;
import net.spicesoftware.api.util.Validate;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * 画面上の絶対的な位置を表します。<br>
 * 2Dの画面を想定しています。<br>
 * 左上が原点で、正の向きが下、または右方向になります。
 *
 * @since 2015/10/31
 */
public final class WindowLocationAbsolute implements WindowLocation {

    @ToString
    private final Vector2i position;

    private WindowLocationAbsolute(Vector2i position) {
        Validate.nullNot(position);
        this.position = position;
    }

    public static WindowLocationAbsolute windowLocationAbsolute(Vector2i position) {
        return new WindowLocationAbsolute(position);
    }

    @Override
    public Vector2i getPosition(Vector2i windowSize) {
        return position;
    }

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}
