package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceSound;

/**
 * 音リソースを作成するビルダーです。
 *
 * @since 2014/12/23
 */
public interface ResourceSoundBuilder extends ResourceFromFileBuilder<ResourceSound> {

    @Override
    ResourceSoundBuilder copyDeeply();
}
