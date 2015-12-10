package net.spicesoftware.api.gui;

/**
 * @since 2015/12/10
 */
public interface WindowTitleElementMutable<T> extends WindowTitleElement {

    /**
     * 値を返します。
     *
     * @return 値
     */
    T getValue();

    /**
     * 値を設定します。
     *
     * @param value 設定する値
     */
    void setValue(T value);
}
