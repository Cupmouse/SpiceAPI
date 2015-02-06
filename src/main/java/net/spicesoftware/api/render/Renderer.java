package net.spicesoftware.api.render;

import net.spicesoftware.api.image.Image;

/**
 * @since 2014/10/06
 */
public interface Renderer<T extends Renderable, I extends Image> {

    void render(T renderable, I image);
}
