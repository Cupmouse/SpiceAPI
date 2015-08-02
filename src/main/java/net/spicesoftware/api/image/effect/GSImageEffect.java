package net.spicesoftware.api.image.effect;

/**
 * @since 2015/05/09
 */
public interface GSImageEffect extends ImageEffect {

    byte[] applyGS(int width, int height, byte[] data);
}
