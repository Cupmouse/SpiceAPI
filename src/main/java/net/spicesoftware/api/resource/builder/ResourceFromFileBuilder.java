package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceFromFile;

import java.io.File;

/**
 * ファイルから読み込まれたリソースを作成するビルダーです。
 *
 * @since 2014/12/23
 */
public interface ResourceFromFileBuilder<T extends ResourceFromFile> extends ResourceBuilder<T> {

    /**
     * 設定されているファイルを返します
     *
     * @return 設定されているファイル
     */
    File getFile();

    /**
     * ファイルを設定します
     *
     * @param file 設定するファイル
     */
    void setFile(File file);

    @Override
    ResourceFromFileBuilder copyDeeply();
}
