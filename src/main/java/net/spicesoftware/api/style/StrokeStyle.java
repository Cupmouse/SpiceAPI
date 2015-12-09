package net.spicesoftware.api.style;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;

import javax.validation.constraints.Min;

import static net.spicesoftware.api.util.Validate.nullNot;
import static net.spicesoftware.api.util.Validate.zeroOrPositive;

/**
 * 線のスタイルを保持します。
 * イミュータブルクラスです。
 *
 * @since 2015/01/26
 */
public interface StrokeStyle extends DeepCopyable {

    /**
     * 新しい{@link Builder}のインスタンスを返します。
     *
     * @return 新しいラインスタイルビルダーのインスタンス
     */
    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    /**
     * この{@code StrokeStyle}の{@link DecorationFilling}を返します。
     *
     * @return この線スタイルの塗りつぶし
     */
    DecorationFilling getFilling();

    /**
     * この{@code StrokeStyle}の線の太さを返します。
     *
     * @return この線スタイルの線の太さ
     */
    @Min(0)
    int getThickness();

    @Override
    StrokeStyle copyDeeply();

    /**
     * @since 2015/08/14
     */
    interface Builder extends ParameterEssentialBuilder<StrokeStyle> {

        /**
         * {@link StrokeStyle}の{@link DecorationFilling}を設定します。
         *
         * @param filling 線スタイルに設定する塗りつぶし
         */
        void fill(DecorationFilling filling);

        /**
         * {@link StrokeStyle}の線の太さを設定します。
         *
         * @param thickness 線スタイルに設定する線の太さ、0以上
         * @throws IllegalArgumentException 線の太さを0未満に設定しようとした時
         */
        void thickness(@Min(0) int thickness) throws IllegalArgumentException;
    }
}
