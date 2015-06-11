package net.spicesoftware.api.plugin;

import java.util.Optional;

/**
 * {@link Plugin}を管理します。
 *
 * @since 2014/12/17
 */
public interface PluginContainer {

    /**
     * この{@code PluginContainer}が管理する{@link Plugin}の名前を返します。
     *
     * @return このコンテナーが管理するプラグインの名前
     */
    String getName();

    /**
     * この{@code PluginContainer}が管理する{@link Plugin}のIDを返します。
     *
     * @return このコンテナーが管理するプラグインのID
     */
    String getID();

    /**
     * この{@code PluginContainer}が管理する{@link Plugin}の依存するプラグインのIDを返します。
     *
     * @return このコンテナーが管理するプラグインが依存するプラグインのID
     */
    String[] getPluginIDsDepend();

    /**
     * この{@code PluginContainer}が管理する{@link Plugin}の依存するSpiceAPIのバージョンを返します。
     *
     * @return このコンテナーが管理するプラグインが依存するSpiceAPIのバージョン
     */
    String getSpiceAPIVersionDepend();

    /**
     * この{@code PluginContainer}が管理する{@link Plugin}のインスタンスを返します。
     *
     * @return このコンテナーが管理するプラグインのインスタンス
     */
    Optional<Plugin> getInstance();

    /**
     * この{@code PluginContainer}が管理する{@link Plugin}が初期化されているかを真偽値で返します。
     *
     * @return このコンテナーが管理するプラグインが初期化されているか
     */
    boolean isInitialized();

    /**
     * この{@code PluginContainer}が管理する{@link Plugin}が有効化されているかを真偽値で返します。
     *
     * @return このコンテナーが管理するプラグインが有効化されているか
     */
    boolean isEnabled();

    /**
     * この{@code PluginContainer}が管理する{@link Plugin}がこのバージョンのSpongeに対応しているかを真偽値で返します。
     *
     * @return このコンテナーが管理するプラグインがこのバージョンのSpongeに対応しているか
     */
    boolean isCompatible();

}
