package net.spicesoftware.api.gui.common.colorpicker;

import net.spicesoftware.api.util.decoration.fill.color.RGB24Color;

/**
 * @since 2015/07/07
 */
public interface RGB24ColorSelector {

    RGB24Color getSelectedColor();

    void setSelectedColor(RGB24Color rgb24Color);
}
