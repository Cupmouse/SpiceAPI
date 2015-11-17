package net.spicesoftware.api.decoration.fill;

/**
 * 色の表現の列挙です。
 *
 * @since 2015/01/17
 */
public enum ColorType {
    RGB24, RGBA32, HSV360, GRAYSCALE8, BLACK_WHITE;

    public Class<? extends Color> getColorClass() {
        switch (this) {
            case RGB24:
                return RGB24Color.class;
            case RGBA32:
                return RGBA32Color.class;
            case HSV360:
                return HSV360Color.class;
            case GRAYSCALE8:
                return GrayScale8Color.class;
            case BLACK_WHITE:
                break;
        }
        return null;
    }
}
