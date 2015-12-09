package net.spicesoftware.api.resource;

import net.spicesoftware.api.ParameterEssentialBuilder;

import java.io.File;

/**
 * ファイルから読み込まれたリソースです。
 *
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

    /**
     * ファイルから読み込まれたリソースを作成するビルダーです。
     *
     * @since 2014/12/23
     */
    interface IBuilder<T extends ResourceFromFile> extends Resource.IBuilder<T>, ParameterEssentialBuilder<T> {

        /**
         * ファイルを設定します
         *
         * @param file 設定するファイル
         */
        void file(File file);

        @Override
        IBuilder copyDeeply();
    }
}
