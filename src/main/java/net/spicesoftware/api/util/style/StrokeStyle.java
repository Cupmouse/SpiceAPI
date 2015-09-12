package net.spicesoftware.api.util.style;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.Validate;

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

    private final DecorationFilling filling;
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

    /**
     * @since 2015/08/14
     */
    public static final class StrokeStyleBuilder {

        private DecorationFilling filling;
        private int thickness = 1;

        private StrokeStyleBuilder() {
        }

        /**
         * 新しい{@link StrokeStyleBuilder}のインスタンスを返します。
         *
         * @return 新しいラインスタイルビルダーのインスタンス
         */
        public static StrokeStyleBuilder builder() {
            return new StrokeStyleBuilder();
        }

        /**
         * {@link StrokeStyle}の{@link DecorationFilling}を設定します。
         *
         * @param filling 線スタイルに設定する塗りつぶし
         */
        public void fill(DecorationFilling filling) {
            nullNot(filling);
            this.filling = filling;
        }

        /**
         * {@link StrokeStyle}の線の太さを設定します。
         *
         * @param thickness 線スタイルに設定する線の太さ、0以上
         * @throws IllegalArgumentException 線の太さを0未満に設定しようとした時
         */
        public void thickness(@Min(0) int thickness) throws IllegalArgumentException {
            zeroOrPositive(thickness);
            this.thickness = thickness;
        }
    }
}
