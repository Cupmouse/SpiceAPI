package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourceFromFile;

/**
 * @since 2015/02/02
 */
public interface ItemFromResourceFromFile extends ItemFromResource {

    @Override
    ResourceFromFile getResource();

    @Override
    ItemFromResource copyDeeply();
}
