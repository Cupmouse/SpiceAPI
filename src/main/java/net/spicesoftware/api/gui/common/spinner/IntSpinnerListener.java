package net.spicesoftware.api.gui.common.spinner;

/**
 * {@link IntSpinner}特有の変更を受け取るためのリスナです。
 * {@link SpinnerListener}を継承していません。
 *
 * @since 2015/07/04
 */
public interface IntSpinnerListener {

    /**
     * {@link IntSpinner}の値が変化した時に呼ばれます。
     *
     * @param spinner 値が変化したIntSpinner
     * @param from    変化する前の値
     * @param to      変化した後の値
     */
    void onValueChanged(IntSpinnerListener spinner, int from, int to);
}
