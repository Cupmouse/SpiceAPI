package net.spicesoftware.api.item;

import net.spicesoftware.api.Box;

/**
 * Boxを実装したアイテムです。
 *
 * @since 2014/10/04
 */
public interface ItemBox extends Item, Box {// FIXME ItemFromResource

    @Override
    ItemBox copyDeeply();
}
