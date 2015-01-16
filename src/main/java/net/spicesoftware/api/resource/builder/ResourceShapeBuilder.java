package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceShape;

/**
 * @since 2015/01/09
 */
public interface ResourceShapeBuilder extends ResourceBuilder {

    @Override
    ResourceShape build() throws IllegalStateException;

    @Override
    ResourceShapeBuilder copyDeeply();
}
