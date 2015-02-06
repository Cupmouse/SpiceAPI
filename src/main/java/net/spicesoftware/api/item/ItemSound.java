package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourceSound;

/**
 * 音のアイテムです。
 *
 * @since 2014/12/06
 */
public interface ItemSound extends ItemFromResourceFromFile {

    @Override
    ResourceSound getResource();

    @Override
    ItemSound copyDeeply();
}
