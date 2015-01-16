package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceVideo;

/**
 * @since 2014/12/23
 */
public interface ResourceVideoBuilder extends ResourceFromFileBuilder {

    @Override
    ResourceVideo build() throws IllegalStateException;

    @Override
    ResourceFromFileBuilder copy();
}
