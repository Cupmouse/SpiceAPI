package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceSound;

/**
 * 音リソースを作成するビルダーです。
 *
 * @since 2014/12/23
 */
public interface ResourceSoundBuilder extends ResourceFromFileBuilder {

    @Override
    ResourceSound build() throws IllegalStateException;

    @Override
    ResourceSoundBuilder copyDeeply();
}
