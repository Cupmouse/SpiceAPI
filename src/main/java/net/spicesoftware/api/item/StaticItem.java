package net.spicesoftware.api.item;

import net.spicesoftware.api.Copyable;
import net.spicesoftware.api.marker.Markable;
import net.spicesoftware.api.value.HasValues;

import java.io.Serializable;

/**
 * @since 2014/12/12
 */
public interface StaticItem extends HasValues, Markable, Copyable, Serializable {

    @Override
    StaticItem copy();
}
