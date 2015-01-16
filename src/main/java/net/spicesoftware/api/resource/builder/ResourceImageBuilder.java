package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceImage;

/**
 * @since 2014/12/23
 */
public interface ResourceImageBuilder extends ResourceFromFileBuilder {

    @Override
    ResourceImage build() throws IllegalStateException;

    @Override
    ResourceImageBuilder copyDeeply();
}
