package net.spicesoftware.api.gui.location;

import net.spicesoftware.api.util.Direction9;
import net.spicesoftware.api.util.vector.Vector2i;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * 画面上の相対的な位置を表します。<br>
 * {@link Direction9}を利用して相対位置を設定し、{@code offset}でその位置からのずれを絶対的に指定します。<br>
 * {@code offset}は左上が原点、正の方向が下、または右方向になります。<br>
 * <br>
 * 中央などの除算が必要な位置の絶対的な位置を計算する場合、計算途中の値は切り捨てになります。
 *
 * @since 2015/11/01
 */
public final class WindowLocationRelative implements WindowLocation {

    private final Direction9 direction;
    private final Vector2i offset;

    private WindowLocationRelative(Direction9 direction, Vector2i offset) {
        nullNot(direction);
        nullNot(offset);
        this.direction = direction;
        this.offset = offset;
    }

    public static WindowLocationRelative windowLocationRelative(Direction9 direction) {
        return new WindowLocationRelative(direction, Vector2i.ZERO);
    }

    public static WindowLocationRelative windowLocationRelative(Direction9 direction, Vector2i offset) {
        return new WindowLocationRelative(direction, offset);
    }

    @Override
    public Vector2i getPosition(Vector2i windowSize) {
        switch (direction) {
            case TOP_LEFT:
                return offset;
            case TOP_CENTER:
                return offset.add(windowSize.x / 2, 0);
            case TOP_RIGHT:
                return offset.add(windowSize.x, 0);
            case CENTER_LEFT:
                return offset.add(0, windowSize.y / 2);
            case CENTER:
                return offset.add(windowSize.x / 2, windowSize.y / 2);
            case CENTER_RIGHT:
                return offset.add(windowSize.x, windowSize.y / 2);
            case BOTTOM_LEFT:
                return offset.add(0, windowSize.y);
            case BOTTOM_CENTER:
                return offset.add(windowSize.x / 2, windowSize.y);
            case BOTTOM_RIGHT:
                return windowSize.add(offset);
        }
        return null;
    }

}
