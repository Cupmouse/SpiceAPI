package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourceVideo;

/**
 * @since 2014/12/06
 */
public interface ItemVideo extends ItemFromResource {

    @Override
    ResourceVideo getResource();

    @Override
    ItemVideo copyDeeply();
}
