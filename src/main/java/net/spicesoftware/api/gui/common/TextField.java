package net.spicesoftware.api.gui.common;

import net.spicesoftware.api.gui.GUIHaveText;

/**
 * @since 2015/07/07
 */
public interface TextField extends GUIHaveText {

    /**
     * このテキストフィールドのプレースホルダー（入力する前の空の状態で表示する文字列）を返します。
     *
     * @return このテキストフィールドのプレースホルダー
     */
    String getPlaceHolder();

    /**
     * このテキストフィールドのプレースホルダー（入力する前の空の状態で表示する文字列）を設定します。
     *
     * @param placeHolder このテキストフィールドに設定するプレースホルダー文字列
     */
    void setPlaceHolder(String placeHolder);
}
