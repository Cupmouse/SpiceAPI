package net.spicesoftware.api.util.style;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;

import java.util.Optional;

/**
 * テキストのスタイルを保持します。
 * イミュータブルクラスです。
 *
 * @since 2015/01/26
 */
public final class TextStyle implements DeepCopyable {

    private final LineStyle outline;
    private final DecorationFilling filling;

    public TextStyle(LineStyle outline, DecorationFilling filling) {
        if (filling == null) {
            throw new IllegalArgumentException();
        }
        this.outline = outline;
        this.filling = filling;
    }

    /**
     * この{@code TextStyle}のアウトラインの{@link LineStyle}を返します。
     *
     * @return このテキストスタイルのアウトラインのスタイル
     */
    public Optional<LineStyle> getOutline() {
        return Optional.ofNullable(outline);
    }

    /**
     * アウトラインが存在する、縁取られているかを真偽値で返します。
     *
     * @return アウトラインが存在するか
     */
    public boolean isOutlined() {
        return outline != null;
    }

    /**
     * この{@code TextStyle}の文字の{@link DecorationFilling}を返します。
     *
     * @return このテキストスタイルの文字のデコレーション
     */
    public DecorationFilling getFilling() {
        return filling;
    }

    public TextStyle copyDeeply() {
        return new TextStyle(outline == null ? null : outline.copyDeeply(), filling.copyDeeply());
    }

    /**
     * @since 2015/08/14
     */
    public static final class TextStyleBuilder {

        private LineStyle outline;
        private DecorationFilling filling;

        private TextStyleBuilder() {
        }

        /**
         * {@link TextStyle}のアウトラインの{@link LineStyle}を設定します。
         *
         * @param outline テキストスタイルに設定するアウトラインのスタイル
         */
        public void outline(LineStyle outline) {
            this.outline = outline;
        }

        /**
         * {@link TextStyle}の文字の{@link DecorationFilling}を設定します。
         *
         * @param filling テキストスタイルに設定する文字のデコレーション
         */
        public void fill(DecorationFilling filling) {
            this.filling = filling;
        }

        public TextStyle build() {
            return new TextStyle(outline, filling);
        }

        /**
         * 新しい{@link TextStyleBuilder}のインスタンスを返します。
         *
         * @return 新しいテキストスタイルビルダーのインスタンス
         */
        public static TextStyleBuilder builder() {
            return new TextStyleBuilder();
        }
    }
}
