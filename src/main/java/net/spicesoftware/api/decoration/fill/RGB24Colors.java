package net.spicesoftware.api.decoration.fill;

/**
 * {@link RGB24Color}の基本的な色を保持します。
 *
 * @since 2014/12/11
 */
public final class RGB24Colors {

    public static final RGB24Color WHITE = new RGB24Color(0xFF, 0xFF, 0xFF);
    public static final RGB24Color GRAY = new RGB24Color(0x80, 0x80, 0x80);
    public static final RGB24Color BLACK = new RGB24Color(0, 0, 0);
    public static final RGB24Color RED = new RGB24Color(0xFF, 0, 0);
    public static final RGB24Color GREEN = new RGB24Color(0, 0xFF, 0);
    public static final RGB24Color BLUE = new RGB24Color(0, 0, 0xFF);
    public static final RGB24Color YELLOW = new RGB24Color(0xFF, 0xFF, 0);
    public static final RGB24Color AQUA = new RGB24Color(0, 0xFF, 0xFF);
    public static final RGB24Color MAGENTA = new RGB24Color(0xFF, 0, 0xFF);

    private RGB24Colors() {
    }
}
