package net.spicesoftware.api.gui;

/**
 * 値が変更できないイミュータブルな{@link WindowTitleElement}です。
 *
 * @see WindowTitleElementMutable 値が変更できる{@link WindowTitleElement}
 * @since 2015/11/07
 */
public interface WindowTitleElementFixed<T> {

    /**
     * 固定値を返します。
     *
     * @return 固定値
     */
    T getValue();
}
