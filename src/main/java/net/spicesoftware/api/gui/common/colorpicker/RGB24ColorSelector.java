package net.spicesoftware.api.gui.common.colorpicker;

import net.spicesoftware.api.decoration.fill.RGB24Color;

/**
 * セレクタは、実際にグラフィカルに色を選択するコンポーネントのことです。
 * 例えば、一般的なグラフィックソフトウェアで使用される、３要素の色を２次元と１次元に分割した、{@link RGB24ColorSelectorSquare}などがあります。
 *
 * @since 2015/07/07
 */
public interface RGB24ColorSelector {

    /**
     * このセレクタで選択されている色{@link RGB24Color}を返します。
     *
     * @return このセレクタで選択されている色
     */
    RGB24Color getSelectedColor();

    /**
     * このセレクタで選択されている色{@link RGB24Color}を設定します。
     *
     * @param rgb24Color このセレクタに設定する色
     */
    void setSelectedColor(RGB24Color rgb24Color);
}
