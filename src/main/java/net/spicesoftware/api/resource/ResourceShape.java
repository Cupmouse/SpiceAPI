package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemShape;
import net.spicesoftware.api.item.builder.ItemBuilder;

/**
 * シェイプリソースです。
 *
 * @since 2014/12/11
 */
public interface ResourceShape extends Resource, ItemBuilder<ItemShape> {

    @Override
    ResourceShape copyDeeply();
}
