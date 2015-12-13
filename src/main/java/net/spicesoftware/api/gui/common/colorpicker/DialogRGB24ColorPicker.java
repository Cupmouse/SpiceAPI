package net.spicesoftware.api.gui.common.colorpicker;

import net.spicesoftware.api.gui.Window;
import net.spicesoftware.api.gui.common.spinner.IntSpinner;

/**
 * {@link net.spicesoftware.api.decoration.fill.RGB24Color}をグラフィカルに選択するダイアログです。
 *
 * @since 2015/07/07
 */
public interface DialogRGB24ColorPicker extends Window {

    /**
     * このカラーピッカーダイアログのHSVのH要素の{@link IntSpinner}を返します。<br>
     * この{@link IntSpinner}の値は0~360になります。
     *
     * @return HSVのH要素の値の整数スピナー
     */
    IntSpinner getIntSpinnerH();

    /**
     * このカラーピッカーダイアログのHSVのS要素の{@link IntSpinner}を返します。<br>
     * この{@link IntSpinner}の値は0~255になります。
     *
     * @return HSVのS要素の値の整数スピナー
     */
    IntSpinner getIntSpinnerS();

    /**
     * このカラーピッカーダイアログのHSVのV要素の{@link IntSpinner}を返します。<br>
     * この{@link IntSpinner}の値は0~255になります。
     *
     * @return HSVのV要素の値の整数スピナー
     */
    IntSpinner getIntSpinnerV();

    /**
     * このカラーピッカーダイアログのRGBのR要素の{@link IntSpinner}を返します。<br>
     * この{@link IntSpinner}の値は0~255になります。
     *
     * @return RGBのR要素の値の整数スピナー
     */
    IntSpinner getIntSpinnerR();

    /**
     * このカラーピッカーダイアログのRGBのG要素の{@link IntSpinner}を返します。<br>
     * この{@link IntSpinner}の値は0~255になります。
     *
     * @return RGBのG要素の値の整数スピナー
     */
    IntSpinner getIntSpinnerG();

    /**
     * このカラーピッカーダイアログのRGBのB要素の{@link IntSpinner}を返します。<br>
     * この{@link IntSpinner}の値は0~255になります。
     *
     * @return RGBのB要素の値の整数スピナー
     */
    IntSpinner getIntSpinnerB();

    // TODO 選択モードクラスを作ってレジスタ登録しないとそのクラスを取得できないようにする

    /**
     * このカラーピッカーのセレクタ{@link RGB24ColorSelector}を返します。
     *
     * @return このカラーピッカーのセレクタ
     */
    RGB24ColorSelector getSelector();

    /**
     * このカラーピッカーのセレクタ{@link RGB24ColorSelector}を設定します。
     *
     * @param colorSelector このカラーピッカーに設定するセレクタ
     */
    void setColorSelector(RGB24ColorSelector colorSelector);
}
