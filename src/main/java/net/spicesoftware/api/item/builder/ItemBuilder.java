package net.spicesoftware.api.item.builder;

import net.spicesoftware.api.item.Item;

/**
 * @since 2015/02/12
 */
public interface ItemBuilder<T extends Item> {

    /**
     * この{@code Resource}から新しい{@link net.spicesoftware.api.item.Item}を作成し返します。
     *
     * @return このリソースからの新しいアイテム
     */
    T createNewItem();
}
