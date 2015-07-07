package net.spicesoftware.api.gui.common.colorpicker;

import net.spicesoftware.api.gui.common.spinner.IntSpinner;

/**
 * @since 2015/07/07
 */
public interface RGB24ColorSelectorSquare extends RGB24ColorSelector {

    IntSpinner getIntSpinnerH();

    IntSpinner getIntSpinnerS();

    IntSpinner getIntSpinnerV();

    IntSpinner getIntSpinnerR();

    IntSpinner getIntSpinnerG();

    IntSpinner getIntSpinnerB();

    LockedElement getLockedElement();

    void setLockedElement(LockedElement element);

    enum LockedElement {
        H, S, V, R, G, B;
    }
}
