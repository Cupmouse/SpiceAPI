package net.spicesoftware.api.util.color;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @since 2015/01/17
 */
public class RGBA32Color implements Serializable {

    public final int r;
    public final int g;
    public final int b;
    public final int a;

    public RGBA32Color(@Min(0) @Max(0xFF) int r, @Min(0) @Max(0xFF) int g, @Min(0) @Max(0xFF) int b, @Min(0) @Max(0xFF) int a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public static RGBA32Color fromRGB24Color(RGB24Color color, @Min(0) @Max(0xFF) int transparent) {
        return new RGBA32Color(color.r, color.g, color.b, transparent);
    }

    public RGB24Color toRgb24Color() {
        return new RGB24Color(r, g, b);
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
