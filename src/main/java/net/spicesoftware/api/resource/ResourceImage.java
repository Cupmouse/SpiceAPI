package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemImage;

/**
 * 画像のリソースです。
 *
 * @since 2014/10/06
 */
public interface ResourceImage extends ResourceFromFile<ItemImage> {

    @Override
    ResourceImage copyDeeply();
}
