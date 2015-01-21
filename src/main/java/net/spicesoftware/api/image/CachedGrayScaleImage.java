package net.spicesoftware.api.image;

/**
 * @since 2015/01/17
 */
public interface CachedGrayScaleImage extends GrayScaleImage {

    @Override
    CachedGrayScaleImage copyDeeply();
}
