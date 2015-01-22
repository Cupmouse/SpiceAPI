package net.spicesoftware.api.util.color;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * RGBの色を表すイミュータブルクラスです。
 *
 * @since 2014/10/06
 */
public final class RGB24Color implements Serializable {

    public final int r;
    public final int g;
    public final int b;

    public RGB24Color(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public RGB24Color(@Min(0) @Max(0xFFFFFF) int rgb) {
        this.r = rgb >> 16 & 0xFF;
        this.g = rgb >> 8 & 0xFF;
        this.b = rgb & 0xFF;
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
        return new RGB24Color(~r & 0xFF, ~g & 0xFF, ~b & 0xFF);
    }

    public RGBA32Color withTransparency(@Min(0) @Max(0xFF) int transparency) {
        return RGBA32Color.fromRGB24Color(this, transparency);
    }

    public int getIntValue() {
        return (r << 16) | (g << 8) | b;
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
