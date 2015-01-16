package net.spicesoftware.api;

/**
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
