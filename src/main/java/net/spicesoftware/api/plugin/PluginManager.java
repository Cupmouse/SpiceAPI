package net.spicesoftware.api.plugin;

import java.util.Optional;
import java.util.Set;

/**
 * プラグインを管理します。
 *
 * @since 2014/10/06
 */
public interface PluginManager {

    /**
     * 登録されているすべての{@link Plugin}の{@link PluginContainer}を返します。
     *
     * @return 登録されているすべてのプラグインのコンテナー
     */
    Set<PluginContainer> getPlugins();

    // TODO javadoc

    /**
     * IDを指定してプラグインのインスタンスを返します。
     *
     * @param id 取得するプラグインのID
     * @return 指定されたIDのプラグインのインスタンス
     */
    Optional<PluginContainer> getPlugin(String id);

}
