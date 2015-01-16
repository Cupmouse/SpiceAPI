package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceSound;

/**
 * @since 2014/12/23
 */
public interface ResourceSoundBuilder extends ResourceFromFileBuilder {

    @Override
    ResourceSound build() throws IllegalStateException;

    @Override
    ResourceSoundBuilder copy();
}
