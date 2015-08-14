package net.spicesoftware.api.gui;

/**
 * @since 2015/07/07
 */
public interface GUIHaveText {

    /**
     * このコンポーネントが持つ文字列を返します。
     *
     * @return このコンポーネントが持つ文字列
     */
    String getText();

    /**
     * このコンポーネントが持つ文字列を設定します。
     *
     * @param text このコンポーネントに設定する文字列
     */
    void setText(String text);
}
