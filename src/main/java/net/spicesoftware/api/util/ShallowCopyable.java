package net.spicesoftware.api.util;

/**
 * シャローコピーができることを表すインターフェイスです。
 *
 * @since 2015/01/16
 */
public interface ShallowCopyable {

    /**
     * シャローコピーをします。
     *
     * @return コピーされたインスタンス
     */
    ShallowCopyable copyShallowly();
}
