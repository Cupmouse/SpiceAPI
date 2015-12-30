package net.spicesoftware.api.item.builder;

import net.spicesoftware.api.Builder;
import net.spicesoftware.api.item.Item;

/**
 * @since 2015/02/12
 */
// TODO 各アイテムクラスのビルダー
public interface ItemBuilder<T extends Item> extends Builder<T> {

    @Override
    ItemBuilder<T> from(T copy);
}
