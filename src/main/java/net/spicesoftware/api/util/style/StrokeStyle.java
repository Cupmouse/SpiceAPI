package net.spicesoftware.api.util.style;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;

import javax.validation.constraints.Min;

import static net.spicesoftware.api.util.Validate.nullNot;
import static net.spicesoftware.api.util.Validate.zeroOrPositive;

/**
 * 線のスタイルを保持します。
 * イミュータブルクラスです。
 *
 * @since 2015/01/26
 */
public final class StrokeStyle implements DeepCopyable {

    @ToString
    private final DecorationFilling filling;
    @ToString
    private final int thickness;

    public StrokeStyle(DecorationFilling filling, @Min(0) int thickness) {
        nullNot(filling);
        zeroOrPositive(thickness);
        this.filling = filling;
        this.thickness = thickness;
    }

    /**
     * この{@code StrokeStyle}の{@link DecorationFilling}を返します。
     *
     * @return この線スタイルの塗りつぶし
     */
    public DecorationFilling getFilling() {
        return filling;
    }

    /**
     * この{@code StrokeStyle}の線の太さを返します。
     *
     * @return この線スタイルの線の太さ
     */
    @Min(0)
    public int getThickness() {
        return thickness;
    }

    @Override
    public StrokeStyle copyDeeply() {
        return new StrokeStyle(filling.copyDeeply(), thickness);
    }

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}
