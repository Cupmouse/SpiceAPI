package net.spicesoftware.api.gui.common.spinner;

/**
 * @since 2015/07/04
 */
public interface IntSpinnerListener {

    /**
     * {@link IntSpinner}の値が変化した時に呼ばれます。
     * ドラッグで値が変化するたびに呼ばれます。
     *
     * @param spinner 値が確定したIntSpinner
     * @param from
     * @param to
     */
    void onValueChanged(IntSpinnerListener spinner, int from, int to);
}
