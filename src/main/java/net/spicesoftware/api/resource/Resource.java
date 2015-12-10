package net.spicesoftware.api.resource;

import net.spicesoftware.api.Builder;
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

    /**
     * リソースを作成するビルダーです。
     *
     * @since 2014/12/23
     */
    interface IBuilder<T extends Resource> extends DeepCopyable, Builder<T> {

        @Override
        IBuilder copyDeeply();
    }
}
