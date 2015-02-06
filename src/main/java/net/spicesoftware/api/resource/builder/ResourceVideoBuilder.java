package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceVideo;

/**
 * 映像リソースを作成するビルダーです。
 *
 * @since 2014/12/23
 */
public interface ResourceVideoBuilder extends ResourceFromFileBuilder<ResourceVideo> {

    @Override
    ResourceFromFileBuilder copyDeeply();
}
