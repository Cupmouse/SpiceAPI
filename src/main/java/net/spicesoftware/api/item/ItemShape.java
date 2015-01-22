package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourceShape;

/**
 * 特定の形状を持ったアイテムです。
 *
 * @since 2014/12/11
 */
public interface ItemShape extends ItemFromResource {

    @Override
    ResourceShape getResource();

    @Override
    ItemShape copyDeeply();
}
