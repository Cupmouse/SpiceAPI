package net.spicesoftware.api;

import net.spicesoftware.api.project.Project;

import java.util.Optional;

/**
 * Spiceインターフェイスです。
 * {@link net.spicesoftware.api.Registry}と
 * {@link net.spicesoftware.api.project.Project}を持ちます。
 *
 * @since 2014/10/06
 */
public interface Spice {

    public static String API_VERSION = "alpha-0.0.1";

    /**
     * この{@code Spice}のレジストリを返します。
     *
     * @return レジストリ
     */
    Registry getRegistry();

    /**
     * この{@code Spice}の実装バージョンを返します。
     *
     * @return このSpiceの実装バージョン
     */
    String getImplementationVersion();

    /**
     * この{@code Spice}の今開いているプロジェクトを返します。
     *
     * @return 今開いているプロジェクト
     */
    Optional<Project> getProject();

}
