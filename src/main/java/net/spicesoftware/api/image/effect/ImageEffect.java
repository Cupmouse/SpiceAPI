package net.spicesoftware.api.image.effect;

import net.spicesoftware.api.image.CachedImage;

/**
 * @since 2014/12/12
 */
public interface ImageEffect<I extends CachedImage> {

    I apply(I image);
}
