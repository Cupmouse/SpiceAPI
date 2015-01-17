package net.spicesoftware.api.image;

/**
 * @since 2015/01/17
 */
public interface CachedRGBImage extends RGBImage {

    @Override
    CachedRGBImage copyDeeply();
}
