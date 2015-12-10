package net.spicesoftware.api.decoration.fill;

import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import static net.spicesoftware.api.util.Validate.nullNot;
import static net.spicesoftware.api.util.Validate.rangeIn;

/**
 * グレースケールの色を表すイミュータブルクラスです。
 *
 * @since 2015/01/17
 */
public final class GrayScale8Color implements Color {

    @ToString
    public final int whiteness;

    public GrayScale8Color(@Min(0) @Max(0xFF) int whiteness) {
        rangeIn(whiteness, 0, 0xFF);
        this.whiteness = whiteness;
    }

    public GrayScale8Color add(GrayScale8Color color) {
        nullNot(color);
        return new GrayScale8Color(Math.min(this.whiteness + color.whiteness, 0xFF));
    }

    public GrayScale8Color add(@Min(0) @Max(0xFF) int w) {
        rangeIn(w, 0, 0xFF);
        return new GrayScale8Color(Math.min(this.whiteness + w, 0xFF));
    }

    public GrayScale8Color sub(@Min(0) @Max(0xFF) int w) {
        rangeIn(w, 0, 0xFF);
        return new GrayScale8Color(Math.max(this.whiteness - w, 0));
    }

    public GrayScale8Color sub(GrayScale8Color color) {
        nullNot(color);
        return new GrayScale8Color(Math.max(this.whiteness - color.whiteness, 0));
    }

    public GrayScale8Color blend(@Min(0) @Max(0xFF) int w) {
        rangeIn(w, 0, 0xFF);
        return new GrayScale8Color(Math.round((this.whiteness + w) / 2F));
    }

    public GrayScale8Color blend(GrayScale8Color color) {
        nullNot(color);
        return new GrayScale8Color(Math.round((this.whiteness + color.whiteness) / 2F));
    }

    public GrayScale8Color opposite() {
        return new GrayScale8Color(~whiteness & 0xFF);
    }

    public RGB24Color toRGB24Color() {
        return new RGB24Color(whiteness, whiteness, whiteness);
    }

    public RGBA32Color toRGBA32Color(@Min(0) @Max(0xFF) int opacity) {
        rangeIn(whiteness, 0, 0xFF);
        return new RGBA32Color(whiteness, whiteness, whiteness, opacity);
    }

    @Override
    public GrayScale8Color copyDeeply() {
        return new GrayScale8Color(whiteness);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            GrayScale8Color grayScaleColor = (GrayScale8Color) obj;
            return grayScaleColor.whiteness == whiteness;
        }
        return false;
    }

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}
