package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemSound;
import net.spicesoftware.api.item.builder.ItemBuilder;

/**
 * 音のリソースです。
 *
 * @since 2014/12/06
 */
public interface ResourceSound extends ResourceFromFile, ItemBuilder<ItemSound> {

    @Override
    ResourceSound copyDeeply();
}
