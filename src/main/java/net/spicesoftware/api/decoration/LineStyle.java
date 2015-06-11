package net.spicesoftware.api.decoration;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;

/**
 * 線のスタイルを保持します。
 *
 * @since 2015/01/26
 */
public interface LineStyle extends DeepCopyable {

    /**
     * この{@code LineStyle}の{@link DecorationFilling}を返します。
     *
     * @return この線スタイルの塗りつぶし
     */
    DecorationFilling getDecoration();

    /**
     * この{@code LineStyle}の{@link DecorationFilling}を設定します。
     *
     * @param decorationFilling この線スタイルに設定する塗りつぶし
     */
    void setDecorationFilling(DecorationFilling decorationFilling);

    /**
     * この{@code LineStyle}の線の太さを返します。
     *
     * @return この線スタイルの線の太さ
     */
    int getWidth();

    /**
     * この{@code LineStyle}の線の太さを設定します。
     *
     * @param width この線スタイルに設定する線の太さ
     */
    void setWidth(int width);

    @Override
    LineStyle copyDeeply();
}
