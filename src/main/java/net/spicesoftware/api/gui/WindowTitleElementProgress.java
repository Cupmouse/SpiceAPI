package net.spicesoftware.api.gui;

import javax.validation.constraints.Min;

/**
 * @since 2015/11/04
 */
public interface WindowTitleElementProgress extends WindowTitleElement {

    /**
     * パーセントの分子を返します。
     * パーセント=(Numerator / Denominator) * 100
     *
     * @return パーセントの分子
     */
    @Min(0)
    int getNumerator();

    /**
     * パーセントの分子を設定します。
     * パーセント=(Numerator / Denominator) * 100
     *
     * @param numerator パーセントの分子
     * @throws IllegalArgumentException
     */
    void setNumerator(@Min(0) int numerator) throws IllegalArgumentException;

    /**
     * パーセントの分母を返します。
     * パーセント=(Numerator / Denominator) * 100
     *
     * @return パーセントの分母
     */
    @Min(0)
    int getDenominator();

    /**
     * パーセントの分母を設定します。
     * パーセント=(Numerator / Denominator) * 100
     *
     * @param denominator パーセントの分母
     */
    void setDenominator(@Min(0) int denominator);

    /**
     * {@link WindowTitleElementProgressFormat}を返します。
     *
     * @return この{@link WindowTitleElementProgressFormat}
     */
    WindowTitleElementProgressFormat getProgressFormat();

    /**
     * {@link WindowTitleElementProgressFormat}を設定します。
     *
     * @param progressFormat 設定する{@link WindowTitleElementProgressFormat}
     */
    void setProgressFormat(WindowTitleElementProgressFormat progressFormat);
}
