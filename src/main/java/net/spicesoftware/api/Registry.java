package net.spicesoftware.api;

import net.spicesoftware.api.image.RGBImageEditable;
import net.spicesoftware.api.resource.builder.ResourceImageBuilder;
import net.spicesoftware.api.resource.builder.ResourceSoundBuilder;
import net.spicesoftware.api.resource.builder.ResourceVideoBuilder;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2014/10/06
 */
public interface Registry {

    RGBImageEditable newImage(Vector2i size);

    ResourceImageBuilder getResourceImageBuilder();

    ResourceSoundBuilder getResourceSoundBuilder();

    ResourceVideoBuilder getResourceVideoBuilder();

}
