package net.spicesoftware.api.gui;

import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;
import net.spicesoftware.api.util.Validate;

import javax.validation.constraints.Min;
import java.util.Optional;

import static net.spicesoftware.api.util.Validate.*;

/**
 * @since 2015/11/04
 */
public final class WindowTitleElementProgress implements WindowTitleElement {

    @ToString
    private Object label;
    @ToString
    private int numerator;
    @ToString
    private int denominator;
    @ToString
    private WindowTitleElementProgressFormat format;

    private WindowTitleElementProgress(Object label, int numerator, int denominator, WindowTitleElementProgressFormat format) {
        nullNot(format);
        zeroOrPositive(numerator, denominator);
        smallerEqual(numerator, denominator);
        this.label = label;
        this.numerator = numerator;
        this.denominator = denominator;
        this.format = format;
    }

    public static WindowTitleElementProgress progress(Object label, int numerator, int denominator, WindowTitleElementProgressFormat format) {
        return new WindowTitleElementProgress(label, numerator, denominator, format);
    }

    public static WindowTitleElementProgress progress(int numerator, int denominator, WindowTitleElementProgressFormat format) {
        return new WindowTitleElementProgress(null, numerator, denominator, format);
    }

    /**
     * パーセントの分子を返します。<br>
     * パーセント=(Numerator / Denominator) * 100
     *
     * @return パーセントの分子
     */
    @Min(0)
    public int getNumerator() {
        return numerator;
    }

    /**
     * パーセントの分子を設定します。<br>
     * パーセント=(Numerator / Denominator) * 100
     *
     * @param numerator パーセントの分子
     * @throws IllegalArgumentException 指定された数が負の値または{@code denominator}より大きい場合
     */
    public void setNumerator(@Min(0) int numerator) throws IllegalArgumentException {
        zeroOrPositive(numerator);
        smallerEqual(numerator, denominator);
        this.numerator = numerator;
    }

    /**
     * パーセントの分母を返します。<br>
     * パーセント=(Numerator / Denominator) * 100
     *
     * @return パーセントの分母
     */
    @Min(0)
    public int getDenominator() {
        return denominator;
    }

    /**
     * パーセントの分母を設定します。<br>
     * パーセント=(Numerator / Denominator) * 100
     *
     * @param denominator パーセントの分母
     * @throws IllegalArgumentException 指定された数が負の値または{@code numerator}より小さい場合
     */
    public void setDenominator(@Min(0) int denominator) throws IllegalArgumentException {
        zeroOrPositive(denominator);
        largerEqual(denominator, numerator);
        this.denominator = denominator;
    }

    /**
     * {@link WindowTitleElementProgressFormat}を返します。
     *
     * @return この{@link WindowTitleElementProgressFormat}
     */
    public WindowTitleElementProgressFormat getProgressFormat() {
        return format;
    }

    /**
     * {@link WindowTitleElementProgressFormat}を設定します。
     *
     * @param progressFormat 設定する{@link WindowTitleElementProgressFormat}
     */
    public void setProgressFormat(WindowTitleElementProgressFormat progressFormat) {
        nullNot(format);
        this.format = progressFormat;
    }

    @Override
    public String plain() {
        return format.format(this);
    }

    @Override
    public Optional<Object> getLabel() {
        return Optional.ofNullable(label);
    }

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}
