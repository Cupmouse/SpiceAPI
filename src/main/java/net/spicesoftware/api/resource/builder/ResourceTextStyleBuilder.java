package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceTextStyle;

/**
 * @since 2015/02/10
 */
public interface ResourceTextStyleBuilder extends ResourceBuilder<ResourceTextStyle> {

    @Override
    ResourceTextStyleBuilder copyDeeply();
}
