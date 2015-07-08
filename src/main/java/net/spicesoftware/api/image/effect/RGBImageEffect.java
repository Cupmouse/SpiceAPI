package net.spicesoftware.api.image.effect;

/**
 * @since 2015/05/09
 */
public interface RGBImageEffect extends ImageEffect {

    int[] applyRGB(int width, int height, int[] data);
}
