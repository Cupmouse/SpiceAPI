package net.spicesoftware.api.decoration.fill;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * RGBに透明度を追加した、各要素8ビット(256段階、0~255)づつ全32ビットでRGBAの色を表す、イミュータブルクラスです。
 *
 * @since 2015/01/17
 */
public final class RGBA32Color implements Color, Serializable {

    public final int r;
    public final int g;
    public final int b;
    public final int a;

    public RGBA32Color(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b, @Min(0) @Max(0xFF) int a) {
        validateRGBA(r, g, b, a);
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public RGBA32Color(@Min(0) @Max(0xFFFFFFFF) int rgba) {
        this.r = rgba >>> 24 & 0xFF;
        this.g = rgba >>> 16 & 0xFF;
        this.b = rgba >>> 8 & 0xFF;
        this.a = rgba & 0xFF;
    }

    public static void validateRGBA(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b, @Min(0) @Max(0xFF) int a) {
        if (r < 0 || r > 0xFF || g < 0 || g > 0xFF || b < 0 || b > 0xFF || a < 0 || a > 0xFF) {
            throw new IllegalArgumentException();
        }
    }

    public static RGBA32Color fromRGB24Color(RGB24Color color, @Min(0) @Max(0xFF) int transparency) {
        return new RGBA32Color(color.r, color.g, color.b, transparency);
    }

    public RGBA32Color add(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b, @Min(0) @Max(0xFF) int a) {
        return new RGBA32Color(Math.min(this.r + r, 0xFF), Math.min(this.g + g, 0xFF), Math.min(this.b + b, 0xFF), Math.min(this.a + a, 0xFF));
    }

    public RGBA32Color add(RGBA32Color color) {
        return new RGBA32Color(Math.min(r + color.r, 0xFF), Math.min(g + color.g, 0xFF), Math.min(b + color.b, 0xFF), Math.min(a + color.a, 0xFF));
    }

    public RGBA32Color sub(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b, @Min(0) @Max(0xFF) int a) {
        return new RGBA32Color(Math.max(this.r - r, 0), Math.max(this.g - g, 0), Math.max(this.b - b, 0), Math.max(this.a - a, 0));
    }

    public RGBA32Color sub(RGBA32Color color) {
        return new RGBA32Color(Math.max(r - color.r, 0), Math.max(g - color.g, 0), Math.max(b - color.b, 0), Math.max(a - color.a, 0));
    }

    public RGBA32Color blend(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b, @Min(0) @Max(0xFF) int a) {
        return new RGBA32Color(Math.round((this.r + r) / 2F), Math.round((this.g + g) / 2F), Math.round((this.b + b) / 2F), Math.round((this.a + a) / 2F));
    }

    public RGBA32Color blend(RGBA32Color color) {
        return new RGBA32Color(Math.round((r + color.r) / 2F), Math.round((g + color.g) / 2F), Math.round((b + color.b) / 2F), Math.round((a + color.a) / 2F));
    }

    public RGBA32Color opposite() {
        return new RGBA32Color(r ^ 0xFF, g ^ 0xFF, b ^ 0xFF, a);
    }

    public RGB24Color toRGB24Color() {
        return new RGB24Color(r, g, b);
    }

    public long toRGBA32Long() {
        return ((long) r << 24) | ((long) g << 16) | ((long) b << 8) | (long) a;
    }

    public int toRGBA32Int() {
        return (int) toRGBA32Long();
    }

    public boolean isTransparent() {
        return a == 0;
    }

    @Override
    public RGBA32Color copyDeeply() {
        return new RGBA32Color(r, g, b, a);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            RGBA32Color rgba32Color = (RGBA32Color) obj;
            return rgba32Color.r == r && rgba32Color.g == g && rgba32Color.b == b && rgba32Color.a == a;
        }
        return false;
    }

    @Override
    public String toString() {
        return "RGBA32Color{r=" + r + ",g=" + g + ",b=" + b + ",a=" + a + "}";
    }
}
