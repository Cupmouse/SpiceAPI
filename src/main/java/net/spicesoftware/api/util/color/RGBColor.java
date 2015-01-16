package net.spicesoftware.api.util.color;

import net.spicesoftware.api.color.Color;

import javax.validation.constraints.Min;

/**
 * RGBで色を保持するイミュータブルクラス
 *
 * @since 2014/10/06
 */
public abstract class RGBColor implements Color {

    public final int r;
    public final int g;
    public final int b;

    public RGBColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public abstract RGBColor add(@Min(value = 0) int r, @Min(value = 0) int g, @Min(value = 0) int b);

    public abstract RGBColor sub(@Min(value = 0) int r, @Min(value = 0) int g, @Min(value = 0) int b);

    public abstract RGBColor blend(@Min(value = 0) int r, @Min(value = 0) int g, @Min(value = 0) int b);

}
