package net.spicesoftware.api.gui.common;

import java.util.Set;

/**
 * 円形のポップアップメニューです。<br>
 * マウスの現在位置を中心とした円形のダイアログウィンドウに、扇状に分割された複数選択肢があるメニューです。<br>
 * キャンセルボタンはどれだけ選択肢があっても、下方向（南方向）にあります。<br>
 * 各選択肢は、マウスが上に乗るだけで選択された事になります。<br>
 * また、キーボードの十字キーでも選択することができます。
 *
 * @since 2015/10/17
 */
public interface CircularPopupMenu {

    /**
     * この{@code CircularPopupMenu}に登録されたすべての選択肢を返します。<br>
     * 編集できません。
     *
     * @return 登録されたすべての選択肢
     */
    Set<CircularPopupMenuChoice> getChoicesList();
}
