package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourceVideo;

/**
 * 映像のアイテムです。
 *
 * @since 2014/12/06
 */
public interface ItemVideo extends ItemFromResourceFromFile {

    @Override
    ResourceVideo getResource();

    @Override
    ItemVideo copyDeeply();
}
