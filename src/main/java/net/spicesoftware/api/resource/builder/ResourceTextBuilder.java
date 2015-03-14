package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceTextDecoration;

/**
 * @since 2015/02/10
 */
public interface ResourceTextBuilder extends ResourceBuilder<ResourceTextDecoration> {

    @Override
    ResourceTextBuilder copyDeeply();
}
