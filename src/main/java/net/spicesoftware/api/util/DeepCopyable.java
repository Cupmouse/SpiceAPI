package net.spicesoftware.api.util;

/**
 * ディープコピー可能であることを表すインターフェイスです。
 *
 * @since 2015/01/09
 */
public interface DeepCopyable {

    /**
     * ディープコピーをします。
     *
     * @return コピーされたインスタンス
     */
    DeepCopyable copyDeeply();
}
