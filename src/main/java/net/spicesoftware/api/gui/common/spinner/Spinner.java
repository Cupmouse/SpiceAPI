package net.spicesoftware.api.gui.common.spinner;

import net.spicesoftware.api.gui.GUIHaveText;

/**
 * @since 2015/07/04
 */
public interface Spinner extends GUIHaveText {

    void addSpinnerListener(SpinnerListener spinnerListener);
}
