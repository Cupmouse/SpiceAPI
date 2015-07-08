package net.spicesoftware.api.util.style;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;

/**
 * 線のスタイルを保持します。
 *
 * @since 2015/01/26
 */
public class LineStyle implements DeepCopyable {

    private DecorationFilling decorationFilling;
    private int width;

    public LineStyle(DecorationFilling decorationFilling, int width) {
        this.decorationFilling = decorationFilling;
        this.width = width;
    }

    /**
     * この{@code LineStyle}の{@link DecorationFilling}を返します。
     *
     * @return この線スタイルの塗りつぶし
     */
    public DecorationFilling getDecorationFilling() {
        return decorationFilling;
    }

    /**
     * この{@code LineStyle}の{@link DecorationFilling}を設定します。
     *
     * @param decorationFilling この線スタイルに設定する塗りつぶし
     */
    public void setDecorationFilling(DecorationFilling decorationFilling) {
        this.decorationFilling = decorationFilling;
    }

    /**
     * この{@code LineStyle}の線の太さを返します。
     *
     * @return この線スタイルの線の太さ
     */
    public int getWidth() {
        return width;
    }

    /**
     * この{@code LineStyle}の線の太さを設定します。
     *
     * @param width この線スタイルに設定する線の太さ
     */
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public LineStyle copyDeeply() {
        return new LineStyle(decorationFilling.copyDeeply(), width);
    }
}
