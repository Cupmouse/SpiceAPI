package net.spicesoftware.api.item;

import net.spicesoftware.api.Box;

/**
 * @since 2014/10/04
 */
public interface ItemBox extends Item, Box {

    @Override
    ItemBox copyDeeply();
}
