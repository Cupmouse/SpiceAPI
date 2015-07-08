package net.spicesoftware.api.util.decoration.fill.color;

import net.spicesoftware.api.decoration.fill.Color;

/**
 * 色の表現の列挙です。
 *
 * @since 2015/01/17
 */
public enum ColorType {
    RGB24, RGBA32, GRAYSCALE, BLACK_WHITE;

    public Class<? extends Color> getClassOfColor() {
        switch (this) {
            case RGB24:
                return RGB24Color.class;
            case RGBA32:
                return RGBA32Color.class;
            case GRAYSCALE:
                return GrayScaleColor.class;
        }
        return null;
    }
}
