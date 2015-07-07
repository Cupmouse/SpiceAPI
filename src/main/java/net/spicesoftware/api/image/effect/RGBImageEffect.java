package net.spicesoftware.api.image.effect;

/**
 * @since 2015/05/09
 */
public interface RGBImageEffect {

    int[] applyRGB(int width, int height, int[] data);
}
