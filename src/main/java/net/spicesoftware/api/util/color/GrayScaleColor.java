package net.spicesoftware.api.util.color;

import net.spicesoftware.api.util.DeepCopyable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @since 2015/01/17
 */
public class GrayScaleColor implements DeepCopyable, Serializable {

    public final int w;

    public GrayScaleColor(@Min(0) @Max(0xFF) int w) {
        this.w = w;
    }

    public RGB24Color toRgb24Color() {
        return new RGB24Color(w, w, w);
    }

    public RGBA32Color toRgba32Color(@Min(0) @Max(0xFF) int transparent) {
        return new RGBA32Color(w, w, w, transparent);
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
