package net.spicesoftware.api.resource;

import net.spicesoftware.api.Copyable;
import net.spicesoftware.api.item.ItemFromResource;
import net.spicesoftware.api.marker.Markable;

import java.io.Serializable;

/**
 * @since 2014/10/05
 */
public interface Resource extends Markable, Serializable, Copyable {

    /**
     * この{@code Resource}から新しい{@link net.spicesoftware.api.item.ItemFromResource}を作成し返します。
     *
     * @return このリソースからの新しいアイテム
     */
    ItemFromResource createNewItem();

    @Override
    Resource copy();
}
