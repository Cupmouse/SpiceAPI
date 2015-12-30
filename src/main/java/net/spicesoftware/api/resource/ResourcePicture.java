package net.spicesoftware.api.resource;

import net.spicesoftware.api.SpiceStatic;

import java.io.File;

/**
 * 画像のリソースです。
 *
 * @since 2014/10/06
 */
public interface ResourcePicture extends ResourceFromFile {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    @Override
    ResourcePicture copyDeeply();

    /**
     * 画像リソースを作成するビルダーです。
     *
     * @since 2014/12/23
     */
    interface Builder extends ResourceFromFileBuilder<ResourcePicture> {

        @Override
        Builder file(File file);

        @Override
        Builder from(ResourcePicture copy);

        @Override
        Builder copyDeeply();
    }
}
