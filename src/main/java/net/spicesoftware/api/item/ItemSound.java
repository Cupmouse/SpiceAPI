package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourceSound;

/**
 * @since 2014/12/06
 */
public interface ItemSound extends ItemFromResource {

    @Override
    ResourceSound getResource();

    @Override
    ItemSound copyDeeply();
}
