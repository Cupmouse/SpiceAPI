package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemVideo;

/**
 * @since 2014/10/05
 */
public interface ResourceVideo extends ResourceFromFile {

    @Override
    ResourceVideo copyDeeply();

    @Override
    ItemVideo createNewItem();
}
