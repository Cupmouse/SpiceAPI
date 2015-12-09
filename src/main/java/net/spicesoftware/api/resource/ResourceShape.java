package net.spicesoftware.api.resource;

import net.spicesoftware.api.SpiceStatic;

/**
 * シェイプリソースです。
 *
 * @since 2014/12/11
 */
public interface ResourceShape extends Resource {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    @Override
    ResourceShape copyDeeply();

    /**
     * シェイプリソースを作成するビルダーです。
     *
     * @since 2015/01/09
     */
    interface Builder extends IBuilder<ResourceShape> {

        @Override
        Builder copyDeeply();
    }
}
