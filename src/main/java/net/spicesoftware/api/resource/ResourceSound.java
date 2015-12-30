package net.spicesoftware.api.resource;

import net.spicesoftware.api.SpiceStatic;

/**
 * 音のリソースです。
 *
 * @since 2014/12/06
 */
public interface ResourceSound extends ResourceFromFile {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    @Override
    ResourceSound copyDeeply();

    /**
     * 音リソースを作成するビルダーです。
     *
     * @since 2014/12/23
     */
    interface Builder extends ResourceFromFileBuilder<ResourceSound> {

        @Override
        Builder copyDeeply();

        @Override
        Builder from(ResourceSound copy);
    }
}
