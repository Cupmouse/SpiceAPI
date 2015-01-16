package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemSound;

/**
 * @since 2014/12/06
 */
public interface ResourceSound extends ResourceFromFile {

    @Override
    ItemSound createNewItem();

    @Override
    ResourceSound copy();
}
