package net.spicesoftware.api.resource;

import java.io.File;

/**
 * @since 2014/10/05
 */
public interface ResourceFromFile extends Resource {

    /**
     * この{@code FileResource}の{@link java.io.File}を返します。
     *
     * @return このリソースのファイル
     */
    File getFile();

    @Override
    ResourceFromFile copyDeeply();
}
