package net.spicesoftware.api.resource;

import net.spicesoftware.api.marker.Markable;
import net.spicesoftware.api.util.DeepCopyable;

/**
 * リソースです。
 *
 * @since 2014/10/05
 */
public interface Resource extends Markable, DeepCopyable {

    @Override
    Resource copyDeeply();
}
