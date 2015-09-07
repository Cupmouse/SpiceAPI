package net.spicesoftware.api.util.decoration.fill.color;

import net.spicesoftware.api.decoration.fill.Color;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * グレースケールの色を表すイミュータブルクラスです。
 *
 * @since 2015/01/17
 */
public final class GrayScale8Color implements Color, Serializable {

    public final int w;

    public GrayScale8Color(@Min(0) @Max(0xFF) int w) {
        this.w = w;
    }

    public GrayScale8Color add(GrayScale8Color color) {
        return new GrayScale8Color(Math.min(this.w + color.w, 0xFF));
    }

    public GrayScale8Color add(@Min(0) @Max(0xFF) int w) {
        return new GrayScale8Color(Math.min(this.w + w, 0xFF));
    }

    public GrayScale8Color sub(@Min(0) @Max(0xFF) int w) {
        return new GrayScale8Color(Math.max(this.w - w, 0));
    }

    public GrayScale8Color sub(GrayScale8Color color) {
        return new GrayScale8Color(Math.max(this.w - color.w, 0));
    }

    public GrayScale8Color blend(@Min(0) @Max(0xFF) int w) {
        return new GrayScale8Color(Math.round((this.w + w) / 2F));
    }

    public GrayScale8Color blend(GrayScale8Color color) {
        return new GrayScale8Color(Math.round((this.w + color.w) / 2F));
    }

    public GrayScale8Color opposite() {
        return new GrayScale8Color(~w & 0xFF);
    }

    public RGB24Color toRGB24Color() {
        return new RGB24Color(w, w, w);
    }

    public RGBA32Color toRGBA32Color(@Min(0) @Max(0xFF) int opacity) {
        return new RGBA32Color(w, w, w, opacity);
    }

    @Override
    public GrayScale8Color copyDeeply() {
        return new GrayScale8Color(w);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            GrayScale8Color grayScale8Color = (GrayScale8Color) obj;
            return grayScale8Color.w == w;
        }
        return false;
    }

    @Override
    public String toString() {
        return "GrayScale8Color{w=" + w + "}";
    }
}
