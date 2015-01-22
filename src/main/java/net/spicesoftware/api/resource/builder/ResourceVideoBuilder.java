package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceVideo;

/**
 * 映像リソースを作成するビルダーです。
 *
 * @since 2014/12/23
 */
public interface ResourceVideoBuilder extends ResourceFromFileBuilder {

    @Override
    ResourceVideo build() throws IllegalStateException;

    @Override
    ResourceFromFileBuilder copyDeeply();
}
