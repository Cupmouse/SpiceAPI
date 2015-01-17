package net.spicesoftware.api.item;

import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.marker.Markable;
import net.spicesoftware.api.value.HasValues;

import java.io.Serializable;

/**
 * @since 2014/12/12
 */
public interface StaticItem extends HasValues, Markable, DeepCopyable, Serializable {

    @Override
    StaticItem copyDeeply();
}
