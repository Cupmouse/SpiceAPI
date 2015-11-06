package net.spicesoftware.api.util.decoration.fill.color;

import net.spicesoftware.api.decoration.fill.Color;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * 全24ビット、各要素8ビット(256段階、0~255)づつでRGBの色を表すイミュータブルクラスです。
 *
 * @since 2014/10/06
 */
public final class RGB24Color implements Color, Serializable {

    public final int r;
    public final int g;
    public final int b;

    public RGB24Color(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b) {
        validateRGB(r, g, b);

        this.r = r;
        this.g = g;
        this.b = b;
    }

    public RGB24Color(@Min(0) @Max(0xFFFFFF) int rgb) {
        validateRGBInt(rgb);

        this.r = rgb >> 16 & 0xFF;
        this.g = rgb >> 8 & 0xFF;
        this.b = rgb & 0xFF;
    }

    public static void validateRGB(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b) {
        if (r < 0 || r > 0xFF || g < 0 || g > 0xFF || b < 0 || b > 0xFF) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateRGBInt(@Min(0) @Max(0xFFFFFF) int rgb) {
        // 空であるはずの領域（先頭８ビット）にデータが書き込まれている場合、例外
        if (rgb >>> 24 != 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int opposite(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b) {
        validateRGB(r, g, b);
        return (r ^ 0xFF) << 16 | (g ^ 0xFF) << 8 | (b ^ 0xFF);
    }

    public static int oppositeInt(@Min(0) @Max(0xFFFFFF) int rgb) {
        validateRGBInt(rgb);
        return rgb ^ 0xFFFFFF;
    }

    public RGB24Color add(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b) {
        return new RGB24Color(Math.min(this.r + r, 0xFF), Math.min(this.g + g, 0xFF), Math.min(this.b + b, 0xFF));
    }

    public RGB24Color add(RGB24Color color) {
        return new RGB24Color(Math.min(r + color.r, 0xFF), Math.min(g + color.g, 0xFF), Math.min(b + color.b, 0xFF));
    }

    public RGB24Color sub(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b) {
        return new RGB24Color(Math.max(this.r - r, 0), Math.max(this.g - g, 0), Math.max(this.b - b, 0));
    }

    public RGB24Color sub(RGB24Color color) {
        return new RGB24Color(Math.max(r - color.r, 0), Math.max(g - color.g, 0), Math.max(b - color.b, 0));
    }

    public RGB24Color blend(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b) {
        return new RGB24Color(Math.round((this.r + r) / 2F), Math.round((this.g + g) / 2F), Math.round((this.b + b) / 2F));
    }

    public RGB24Color blend(RGB24Color color) {
        return new RGB24Color(Math.round((r + color.r) / 2F), Math.round((g + color.g) / 2F), Math.round((b + color.b) / 2F));
    }

    public RGB24Color opposite() {
        return new RGB24Color(r ^ 0xFF, g ^ 0xFF, b ^ 0xFF);
    }

    public int oppositeInt() {
        return toRGB24Int() ^ 0x00FFFFFF;
    }

    public RGBA32Color withOpacity(@Min(0) @Max(0xFF) int opacity) {
        return RGBA32Color.fromRGB24Color(this, opacity);
    }

    public int toRGB24Int() {
        return (r << 16) | (g << 8) | b;
    }

    /**
     * 整数値のみを計算に使って{@code RGB24Color}を{@link HSV360Color}に変換します。
     * 整数値のみを使うので計算中の小数値が無視されます。
     *
     * @return 変換されたHSVカラー
     */
    public HSV360Color toHSV360Color() {
        int max = Math.max(r, Math.max(g, b));
        int min = Math.min(r, Math.min(g, b));

        int hue;
        byte saturation;

        if (max == 0) {
            // すべて0の時、次の大小比較にもっていくとゼロで割ることになるので
            hue = 0;
            saturation = 0;
        } else {
            if (r == max) {
                hue = ((g - b) * 60) / (r - min);
            } else if (g == max) {
                hue = ((b - r) * 60) / (g - min) + 120;
            } else {
                hue = ((r - g) * 60) / (b - min) + 240;
            }
            if (hue < 0) {
                hue += 360;
            }

            saturation = (byte) (((max - min) * 0xFF) / max);
        }


        return new HSV360Color((short) hue, saturation, max);
    }

    @Override
    public RGB24Color copyDeeply() {
        return new RGB24Color(r, g, b);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            RGB24Color rgb24Color = (RGB24Color) obj;
            return rgb24Color.r == r && rgb24Color.g == g && rgb24Color.b == b;
        }
        return false;
    }

    public String toString() {
        return "RGB24Color{r=" + r + ",g=" + g + ",b=" + b + "}";
    }
}
