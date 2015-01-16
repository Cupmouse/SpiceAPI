package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemShape;

/**
 * @since 2014/12/11
 */
public interface ResourceShape extends Resource {

    @Override
    ItemShape createNewItem();

    @Override
    ResourceShape copy();
}
