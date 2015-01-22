package net.spicesoftware.api.util.color;

import net.spicesoftware.api.util.DeepCopyable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * グレースケールの色を表すイミュータブルクラスです。
 *
 * @since 2015/01/17
 */
public final class GrayScaleColor implements DeepCopyable, Serializable {

    public final int w;

    public GrayScaleColor(@Min(0) @Max(0xFF) int w) {
        this.w = w;
    }

    public GrayScaleColor add(GrayScaleColor color) {
        return new GrayScaleColor(Math.min(this.w + color.w, 0xFF));
    }

    public GrayScaleColor add(@Min(0) @Max(0xFF) int w) {
        return new GrayScaleColor(Math.min(this.w + w, 0xFF));
    }

    public GrayScaleColor sub(@Min(0) @Max(0xFF) int w) {
        return new GrayScaleColor(Math.max(this.w - w, 0));
    }

    public GrayScaleColor sub(GrayScaleColor color) {
        return new GrayScaleColor(Math.max(this.w - color.w, 0));
    }

    public GrayScaleColor blend(@Min(0) @Max(0xFF) int w) {
        return new GrayScaleColor(Math.round((this.w + w) / 2F));
    }

    public GrayScaleColor blend(GrayScaleColor color) {
        return new GrayScaleColor(Math.round((this.w + color.w) / 2F));
    }

    public GrayScaleColor opposite() {
        return new GrayScaleColor(~w & 0xFF);
    }

    public RGB24Color toRgb24Color() {
        return new RGB24Color(w, w, w);
    }

    public RGBA32Color toRgba32Color(@Min(0) @Max(0xFF) int transparency) {
        return new RGBA32Color(w, w, w, transparency);
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
