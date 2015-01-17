package net.spicesoftware.api.image;

import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2014/12/17
 */
public interface Image extends DeepCopyable {

    Vector2i getSize();

    @Override
    Image copyDeeply();
}
