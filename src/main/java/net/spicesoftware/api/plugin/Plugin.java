package net.spicesoftware.api.plugin;

import net.spicesoftware.api.Spice;

/**
 * プラグインのクラスが実装するインターフェイスです。
 *
 * @since 2014/10/06
 */
public interface Plugin {

    /**
     * 初期化時に呼ばれます。
     *
     * @param spice {@link Spice}インスタンス
     */
    void onInit(Spice spice);

    /**
     * 有効化時に呼ばれます。
     *
     * @param spice {@link Spice}インスタンス
     */
    void onEnable(Spice spice);

    /**
     * 無効化時に呼ばれます。
     *
     * @param spice {@link Spice}インスタンス
     */
    void onDisable(Spice spice);

}
