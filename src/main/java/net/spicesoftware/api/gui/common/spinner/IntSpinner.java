package net.spicesoftware.api.gui.common.spinner;

/**
 * @since 2015/07/04
 */
public interface IntSpinner extends Spinner {

    int getValue();

    void setValue(int value);

    int getMaxValue();

    void setMaxValue(int maxValue);

    void disableMaxValue();

    int getMinValue();

    void setMinValue(int minValue);

    void disableMinValue();

    float getSmallModifier();

    void setSmallModifier(float smallModifier);

    float getDefaultModifier();

    void setDefaultModifier(float defaultModifier);

    float getBigModifier();

    void setBigModifier(float bigModifier);

}
