package net.spicesoftware.api.image.effect;

/**
 * @since 2015/04/24
 */
public interface RGBAImageEffect extends ImageEffect {

    int[] applyRGBA(int width, int height, int[] data);
}
