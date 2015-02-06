package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemFromResource;

import java.io.File;

/**
 * ファイルから読み込まれたリソースです。
 *
 * @since 2014/10/05
 */
public interface ResourceFromFile<T extends ItemFromResource> extends Resource<T> {

    /**
     * この{@code FileResource}の{@link java.io.File}を返します。
     *
     * @return このリソースのファイル
     */
    File getFile();

    @Override
    ResourceFromFile copyDeeply();
}
