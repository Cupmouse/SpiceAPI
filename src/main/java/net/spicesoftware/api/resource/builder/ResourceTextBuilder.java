package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceText;

/**
 * @since 2015/02/10
 */
public interface ResourceTextBuilder extends ResourceBuilder<ResourceText> {

    @Override
    ResourceTextBuilder copyDeeply();
}
