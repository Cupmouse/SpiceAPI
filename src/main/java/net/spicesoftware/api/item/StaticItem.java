package net.spicesoftware.api.item;

import net.spicesoftware.api.marker.Markable;
import net.spicesoftware.api.value.HasValues;

/**
 * @since 2014/12/12
 */
public interface StaticItem extends HasValues, Markable {

    @Override
    StaticItem copyDeeply();
}
