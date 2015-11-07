package net.spicesoftware.api.gui;

import java.util.Optional;

/**
 * @since 2015/11/04
 */
public interface WindowTitleElement {

    /**
     * {@link String}文字列にして返します。
     *
     * @return {@link String}文字列になった{@link WindowTitleElement}
     */
    String plain();

    /**
     * ラベルを返します。
     *
     * @return ラベル
     * @see WindowTitle#getElement(Object) {@link WindowTitle}内の特定の{@code WindowTitleElement}を取得するためにラベルを使用します。
     */
    Optional<Object> getLabel();
}
