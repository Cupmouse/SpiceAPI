package net.spicesoftware.api.util;

/**
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
