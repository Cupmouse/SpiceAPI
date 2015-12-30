package net.spicesoftware.api.resource;

import net.spicesoftware.api.ParameterEssentialBuilder;

import java.io.File;

/**
 * ファイルから読み込まれたリソースを作成するビルダーです。
 *
 * @since 2014/12/23
 */
public interface ResourceFromFileBuilder<T extends ResourceFromFile> extends ResourceBuilder<T>, ParameterEssentialBuilder<T> {

    /**
     * ファイルを設定します
     *
     * @param file 設定するファイル
     */
    ResourceFromFileBuilder<T> file(File file);

    @Override
    ResourceFromFileBuilder<T> from(T copy);

    @Override
    ResourceFromFileBuilder copyDeeply();
}