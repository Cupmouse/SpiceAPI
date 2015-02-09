package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemShape;

/**
 * シェイプリソースです。
 *
 * @since 2014/12/11
 */
public interface ResourceShape extends Resource<ItemShape> {

    @Override
    ResourceShape copyDeeply();
}
