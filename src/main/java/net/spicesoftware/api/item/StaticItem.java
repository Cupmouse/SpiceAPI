package net.spicesoftware.api.item;

import net.spicesoftware.api.marker.Markable;
import net.spicesoftware.api.value.HasValues;

/**
 * スタティックアイテムです。
 * {@link net.spicesoftware.api.layer.StaticField}上に配置できます。
 *
 * @since 2014/12/12
 */
public interface StaticItem extends HasValues, Markable {

    @Override
    StaticItem copyDeeply();
}
