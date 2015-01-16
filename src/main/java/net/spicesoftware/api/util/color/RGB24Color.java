package net.spicesoftware.api.util.color;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2014/10/06
 */
public final class RGB24Color extends RGBColor {

    public RGB24Color(@Min(value = 0) @Max(value = 255) int r, @Min(value = 0) @Max(value = 255) int g, @Min(value = 0) @Max(value = 255) int b) {
        super(r, g, b);
    }

    @Override
    public RGB24Color add(@Min(value = 0) @Max(value = 255) int r, @Min(value = 0) @Max(value = 255) int g, @Min(value = 0) @Max(value = 255) int b) {
        return new RGB24Color(Math.min(this.r + r, 0xFF), Math.min(this.g + g, 0xFF), Math.min(this.b + b, 0xFF));
    }

    public RGB24Color add(RGB24Color color) {
        return new RGB24Color(Math.min(r + color.r, 0xFF), Math.min(g + color.g, 0xFF), Math.min(b + color.b, 0xFF));
    }

    @Override
    public RGB24Color sub(@Min(value = 0) @Max(value = 255) int r, @Min(value = 0) @Max(value = 255) int g, @Min(value = 0) @Max(value = 255) int b) {
        return new RGB24Color(Math.max(this.r - r, 0), Math.max(this.g - g, 0), Math.max(this.b - b, 0));
    }

    public RGB24Color sub(RGB24Color color) {
        return new RGB24Color(Math.max(r - color.r, 0), Math.max(g - color.g, 0), Math.max(b - color.b, 0));
    }

    @Override
    public RGB24Color blend(@Min(value = 0) @Max(value = 255) int r, @Min(value = 0) @Max(value = 255) int g, @Min(value = 0) @Max(value = 255) int b) {
        return new RGB24Color(Math.round((this.r + r) / 2F), Math.round((this.g + g) / 2F), Math.round((this.b + b) / 2F));
    }

    public RGB24Color blend(RGB24Color color) {
        return new RGB24Color(Math.round((r + color.r) / 2F), Math.round((g + color.g) / 2F), Math.round((b + color.b) / 2F));
    }

    @Override
    public RGB24Color opposite() {
        return new RGB24Color(~r, ~g, ~b);
    }

}
