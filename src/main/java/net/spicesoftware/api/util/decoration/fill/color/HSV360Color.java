package net.spicesoftware.api.util.decoration.fill.color;

import net.spicesoftware.api.decoration.fill.Color;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * HSVのHを360段階、SとVを256段階で表現するイミュータブルクラスです。
 * H:0~359
 * S:0~255
 * V:0~255
 *
 * @since 2015/07/30
 */
public final class HSV360Color implements Color {
    public final int hue;
    public final int saturation;
    public final int value;

    public HSV360Color(@Min(0) @Max(359) int hue, @Min(0) @Max(0xFF) int saturation, @Min(0) @Max(0xFF) int value) {
        validateHSV(hue, saturation, value);
        hue %= 360;

        this.hue = (short) hue;
        this.saturation = (short) saturation;
        this.value = (short) value;
    }

    public static int toRGB24IntExact(@Min(0) @Max(359) int hue, @Min(0) @Max(0xFF) int saturation, @Min(0) @Max(0xFF) int value) {
        validateHSV(hue, saturation, value);

        float s = saturation / 255F;
        float h = hue / 360F;
        float r = value / 255F;
        float g = value / 255F;
        float b = value / 255F;

        if (s > 0.0f) {
            h *= 6.0f;
            final int i = (int) h;
            final float f = h - (float) i;
            switch (i) {
                default:
                case 0:
                    g *= 1 - s * (1 - f);
                    b *= 1 - s;
                    break;
                case 1:
                    r *= 1 - s * f;
                    b *= 1 - s;
                    break;
                case 2:
                    r *= 1 - s;
                    b *= 1 - s * (1 - f);
                    break;
                case 3:
                    r *= 1 - s;
                    g *= 1 - s * f;
                    break;
                case 4:
                    r *= 1 - s * (1 - f);
                    g *= 1 - s;
                    break;
                case 5:
                    g *= 1 - s;
                    b *= 1 - s * f;
                    break;
            }
        }

        r *= 0xFF;
        g *= 0xFF;
        b *= 0xFF;

        if (r > 0xFF || g > 0xFF || b > 0xFF) {
            System.out.println(true);
        }
        return ((int) r) << 16 | ((int) g) << 8 | ((int) b);
    }

    public static int toRGB24Int(@Min(0) @Max(359) int hue, @Min(0) @Max(0xFF) int saturation, @Min(0) @Max(0xFF) int value) {
        validateHSV(hue, saturation, value);

        if (saturation == 0) {
            return value << 16 | value << 8 | value;
        }

        int r = value;
        int g = value;
        int b = value;

        int f = hue % 60;

//        if (hue % 60 == 0) {
//            return 0xFFFFFF;
//        }

        // x *= 1 - s * (1 - f) : ((0xFF * 60 - saturation * (60 - f)) * x) / (60 * 0xFF)
        // x *= 1 - s : ((0xFF - saturation) * x) / 0xFF
        // x *= 1 - s * f : ((0xFF * 60 - saturation * f) * x) / (0xFF * 0xFF * 60)
        switch (hue / 60) {
            default:
            case 0:
                g = ((0xFF * 60 - saturation * (60 - f)) * g) / (60 * 0xFF);
                b = ((0xFF - saturation) * b) / 0xFF;
                break;
            case 1:
                r = ((0xFF * 60 - saturation * f) * r) / (0xFF * 60);
                b = ((0xFF - saturation) * b) / 0xFF;
                break;
            case 2:
                r = ((0xFF - saturation) * r) / 0xFF;
                b = ((0xFF * 60 - saturation * (60 - f)) * b) / (60 * 0xFF);
                break;
            case 3:
                r = ((0xFF - saturation) * r) / 0xFF;
                g = ((0xFF * 60 - saturation * f) * g) / (0xFF * 60);
                break;
            case 4:
                r = ((0xFF * 60 - saturation * (60 - f)) * r) / (60 * 0xFF);
                g = ((0xFF - saturation) * g) / 0xFF;
                break;
            case 5:
                g = ((0xFF - saturation) * g) / 0xFF;
                b = ((0xFF * 60 - saturation * f) * b) / (0xFF * 60);
                break;
        }

        if (r > 0xFF || g > 0xFF || b > 0xFF) {
            System.out.println(true);
        }
        return r << 16 | g << 8 | b;
    }

    public static void validateHSV(@Min(0) @Max(359) int hue, @Min(0) @Max(0xFF) int saturation, @Min(0) @Max(0xFF) int value) {
        if (hue < 0) {
            throw new IllegalArgumentException();
        }
        if (saturation < 0 || saturation > 0xFF) {
            throw new IllegalArgumentException();
        }
        if (value < 0 || value > 0xFF) {
            throw new IllegalArgumentException();
        }
    }

    public RGB24Color toRGB24Color() {
        return new RGB24Color(toRGB24Int(hue, saturation, value));
    }

    @Override
    public Color copyDeeply() {
        return new HSV360Color(hue, saturation, value);
    }

    @Override
    public String toString() {
        return "HSV360Color{h=" + hue + ",s=" + saturation + ",v=" + value + "}";
    }
}
