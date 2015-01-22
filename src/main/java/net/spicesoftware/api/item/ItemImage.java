package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourceImage;

/**
 * 画像のアイテムです。
 *
 * @since 2014/12/06
 */
public interface ItemImage extends ItemFromResource {

    @Override
    ResourceImage getResource();

    @Override
    ItemImage copyDeeply();
}
