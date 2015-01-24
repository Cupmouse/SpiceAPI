package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemVideo;

/**
 * 映像のリソースです。
 *
 * @since 2014/10/05
 */
public interface ResourceVideo extends ResourceFromFile {

    @Override
    ItemVideo createNewItem();

    @Override
    ResourceVideo copyDeeply();
}
