package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemVideo;
import net.spicesoftware.api.item.builder.ItemBuilder;

/**
 * 映像のリソースです。
 *
 * @since 2014/10/05
 */
public interface ResourceVideo extends ResourceFromFile, ItemBuilder<ItemVideo> {

    @Override
    ResourceVideo copyDeeply();
}
