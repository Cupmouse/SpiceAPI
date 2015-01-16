package net.spicesoftware.api;

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
