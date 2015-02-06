package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceShape;

/**
 * シェイプリソースを作成するビルダーです。
 *
 * @since 2015/01/09
 */
public interface ResourceShapeBuilder extends ResourceBuilder<ResourceShape> {

    @Override
    ResourceShapeBuilder copyDeeply();
}
