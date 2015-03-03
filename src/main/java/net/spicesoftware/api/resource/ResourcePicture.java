package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemPicture;
import net.spicesoftware.api.item.builder.ItemBuilder;

/**
 * 画像のリソースです。
 *
 * @since 2014/10/06
 */
public interface ResourcePicture extends ResourceFromFile, ItemBuilder<ItemPicture> {

    @Override
    ResourcePicture copyDeeply();
}
