package net.spicesoftware.api.plugin;

import java.util.Optional;
import java.util.Set;

/**
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
     * @param id
     * @return
     */
    Optional<PluginContainer> getPlugin(String id);

}
