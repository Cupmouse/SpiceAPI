package net.spicesoftware.api.util.style;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;

import javax.validation.constraints.Min;

/**
 * 線のスタイルを保持します。
 * イミュータブルクラスです。
 *
 * @since 2015/01/26
 */
public final class LineStyle implements DeepCopyable {

    private final DecorationFilling filling;
    private final int thickness;

    public LineStyle(DecorationFilling filling, @Min(0) int thickness) {
        if (filling == null) {
            throw new IllegalArgumentException();
        }
        if (thickness < 0) {
            throw new IllegalArgumentException();
        }
        this.filling = filling;
        this.thickness = thickness;
    }

    /**
     * この{@code LineStyle}の{@link DecorationFilling}を返します。
     *
     * @return この線スタイルの塗りつぶし
     */
    public DecorationFilling getFilling() {
        return filling;
    }

    /**
     * この{@code LineStyle}の線の太さを返します。
     *
     * @return この線スタイルの線の太さ
     */
    @Min(0)
    public int getThickness() {
        return thickness;
    }

    @Override
    public LineStyle copyDeeply() {
        return new LineStyle(filling.copyDeeply(), thickness);
    }

    /**
     * @since 2015/08/14
     */
    public static final class LineStyleBuilder {

        private DecorationFilling filling;
        private int thickness = 1;

        private LineStyleBuilder() {
        }

        /**
         * {@link LineStyle}の{@link DecorationFilling}を設定します。
         *
         * @param filling 線スタイルに設定する塗りつぶし
         */
        public void fill(DecorationFilling filling) {
            this.filling = filling;
        }

        /**
         * {@link LineStyle}の線の太さを設定します。
         *
         * @param thickness 線スタイルに設定する線の太さ、0以上
         * @throws IllegalArgumentException 線の太さを0未満に設定しようとした時
         */
        public void thickness(@Min(0) int thickness) throws IllegalArgumentException {
            if (thickness < 0) {
                throw new IllegalArgumentException();
            }
            this.thickness = thickness;
        }

        /**
         * 新しい{@link LineStyleBuilder}のインスタンスを返します。
         *
         * @return 新しいラインスタイルビルダーのインスタンス
         */
        public static LineStyleBuilder builder() {
            return new LineStyleBuilder();
        }
    }
}
