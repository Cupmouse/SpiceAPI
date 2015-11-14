package net.spicesoftware.api.item;

import net.spicesoftware.api.Box;

/**
 * {@link Box}を実装した{@link Item}です。
 *
 * @since 2014/10/04
 */
public interface ItemBox extends ItemRenderable, Box {

    @Override
    ItemBox copyDeeply();
}
