package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourcePicture;

/**
 * 画像のアイテムです。
 *
 * @since 2014/12/06
 */
public interface ItemPicture extends ItemRenderable {

    ResourcePicture getResourcePicture();

    @Override
    ItemPicture copyDeeply();
}
