package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemFromResource;
import net.spicesoftware.api.marker.Markable;
import net.spicesoftware.api.util.DeepCopyable;

import java.io.Serializable;

/**
 * リソースです。
 * アイテムを作成できます。
 *
 * @since 2014/10/05
 */
public interface Resource<T extends ItemFromResource> extends Markable, Serializable, DeepCopyable {

    /**
     * この{@code Resource}から新しい{@link net.spicesoftware.api.item.ItemFromResource}を作成し返します。
     *
     * @return このリソースからの新しいアイテム
     */
    T createNewItem();

    @Override
    Resource copyDeeply();
}
