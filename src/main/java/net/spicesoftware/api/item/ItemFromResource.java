package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.Resource;

/**
 * {@link net.spicesoftware.api.resource.Resource}から作成されるアイテムです。
 *
 * @since 2014/10/06
 */
public interface ItemFromResource extends Item {

    /**
     * この{@code Item}の{@link net.spicesoftware.api.resource.Resource}を返します。
     *
     * @return このアイテムのリソース
     */
    Resource getResource();

    @Override
    ItemFromResource copyDeeply();
}
