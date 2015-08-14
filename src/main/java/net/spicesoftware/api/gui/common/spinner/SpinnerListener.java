package net.spicesoftware.api.gui.common.spinner;

/**
 * @since 2015/07/04
 */
public interface SpinnerListener {

    /**
     * {@link Spinner}の値が変化した時に呼ばれます。
     * 例えば、ドラッグで値が変化するたびに呼ばれます。
     *
     * @param spinner 値が変化したSpinner
     */
    void onValueChanged(Spinner spinner);

    /**
     * {@link Spinner}の値が確定された時に呼ばれます。
     * 例えば、テキスト編集の確定、ドラッグの終了で呼ばれます。
     *
     * @param spinner 値が確定したSpinner
     */
    void onValueConfirmed(Spinner spinner);

}
