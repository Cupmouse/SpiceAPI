package net.spicesoftware.api.resource;

import net.spicesoftware.api.Builder;
import net.spicesoftware.api.util.DeepCopyable;

/**
 * リソースを作成するビルダーです。
 *
 * @since 2014/12/23
 */
public interface ResourceBuilder<T extends Resource> extends DeepCopyable, Builder<T> {

    @Override
    ResourceBuilder copyDeeply();
}