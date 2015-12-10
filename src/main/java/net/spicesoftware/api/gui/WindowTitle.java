package net.spicesoftware.api.gui;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.SpiceStatic;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

/**
 * {@link Window}のタイトルを表すイミュータブルクラスです。
 *
 * @since 2015/11/04
 */
public interface WindowTitle {

    /**
     * 新しい{@link WindowTitle.Builder}のインスタンスを返します。
     *
     * @return 新しい{@link Builder}のインスタンス
     */
    static WindowTitle.Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    static WindowTitle windowTitle(WindowTitleElement... windowTitleElements) {
        Builder builder = builder();

        for (WindowTitleElement windowTitleElement : windowTitleElements) {
            builder.append(windowTitleElement);
        }

        return builder.build();
    }

    static WindowTitle empty() {
        return builder().build();
    }

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

    /**
     * @since 2015/11/07
     */
    interface Builder extends ParameterEssentialBuilder<WindowTitle> {

        // TODO
        Builder insert(@Min(0) int index, WindowTitleElement titleElement);

        Builder append(WindowTitleElement titleElement);

        Builder remove(@Min(0) int index);
    }
}
