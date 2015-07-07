package net.spicesoftware.api.gui.common;

import net.spicesoftware.api.gui.GUIHaveText;

/**
 * @since 2015/07/07
 */
public interface TextField extends GUIHaveText {

    String getPlaceHolder();

    void setPlaceHolder(String placeHolder);
}
