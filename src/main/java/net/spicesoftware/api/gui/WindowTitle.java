package net.spicesoftware.api.gui;

import java.util.List;
import java.util.Optional;

/**
 * {@link Window}のタイトルを表すイミュータブルクラスです。
 *
 * @since 2015/11/04
 */
public interface WindowTitle {

    /**
     * {@link String}文字列にして返します。
     *
     * @return {@link String}文字列になった{@code WindowTitle}
     */
    String plain();

    /**
     * 指定された{@link Object}のラベルを持つ{@link WindowTitleElement}を返します。
     *
     * @param label {@link WindowTitleElement}が持つラベル
     * @return 指定された{@link Object}のラベルを持つ{@link WindowTitleElement}
     */
    Optional<WindowTitleElement> getElement(Object label);

    /**
     * すべての{@link WindowTitleElement}が、{@link #plain()}が生成される順に並んだ、内容の変更できない{@link List}を返します。
     *
     * @return すべての{@link WindowTitleElement}が、{@link #plain()}が生成される順に並んだ、内容の変更できない{@link List}
     */
    List<WindowTitleElement> getElements();
}
