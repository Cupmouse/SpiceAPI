package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemImage;

/**
 * @since 2014/10/06
 */
public interface ResourceImage extends ResourceFromFile {

    @Override
    ItemImage createNewItem();

    @Override
    ResourceImage copyDeeply();
}
