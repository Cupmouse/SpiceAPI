package net.spicesoftware.api.image.effect;

import net.spicesoftware.api.image.Image;

/**
 * @since 2014/12/12
 */
public interface ImageEffect<T extends Image> {

    T apply(T t);
}
