package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourceShape;

/**
 * @since 2014/12/11
 */
public interface ItemShape extends ItemFromResource {

    @Override
    ResourceShape getResource();

    @Override
    ItemShape copyDeeply();
}
