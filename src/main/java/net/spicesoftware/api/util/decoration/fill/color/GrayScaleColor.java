package net.spicesoftware.api.util.decoration.fill.color;

import net.spicesoftware.api.decoration.fill.Color;
import net.spicesoftware.api.util.Validate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

import static net.spicesoftware.api.util.Validate.nullNot;
import static net.spicesoftware.api.util.Validate.rangeIn;

/**
 * グレースケールの色を表すイミュータブルクラスです。
 *
 * @since 2015/01/17
 */
public final class GrayScaleColor implements Color, Serializable {

    public final int w;

    public GrayScaleColor(@Min(0) @Max(0xFF) int w) {
        rangeIn(w, 0, 0xFF);
        this.w = w;
    }

    public GrayScaleColor add(GrayScaleColor color) {
        nullNot(color);
        return new GrayScaleColor(Math.min(this.w + color.w, 0xFF));
    }

    public GrayScaleColor add(@Min(0) @Max(0xFF) int w) {
        rangeIn(w, 0, 0xFF);
        return new GrayScaleColor(Math.min(this.w + w, 0xFF));
    }

    public GrayScaleColor sub(@Min(0) @Max(0xFF) int w) {
        rangeIn(w, 0, 0xFF);
        return new GrayScaleColor(Math.max(this.w - w, 0));
    }

    public GrayScaleColor sub(GrayScaleColor color) {
        nullNot(color);
        return new GrayScaleColor(Math.max(this.w - color.w, 0));
    }

    public GrayScaleColor blend(@Min(0) @Max(0xFF) int w) {
        rangeIn(w, 0, 0xFF);
        return new GrayScaleColor(Math.round((this.w + w) / 2F));
    }

    public GrayScaleColor blend(GrayScaleColor color) {
        nullNot(color);
        return new GrayScaleColor(Math.round((this.w + color.w) / 2F));
    }

    public GrayScaleColor opposite() {
        return new GrayScaleColor(~w & 0xFF);
    }

    public RGB24Color toRGB24Color() {
        return new RGB24Color(w, w, w);
    }

    public RGBA32Color toRGBA32Color(@Min(0) @Max(0xFF) int opacity) {
        rangeIn(w, 0, 0xFF);
        return new RGBA32Color(w, w, w, opacity);
    }

    @Override
    public GrayScaleColor copyDeeply() {
        return new GrayScaleColor(w);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            GrayScaleColor grayScaleColor = (GrayScaleColor) obj;
            return grayScaleColor.w == w;
        }
        return false;
    }

    @Override
    public String toString() {
        return "GrayScaleColor{w=" + w + "}";
    }
}
