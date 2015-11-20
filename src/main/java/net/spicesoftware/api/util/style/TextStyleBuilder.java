package net.spicesoftware.api.util.style;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * @since 2015/08/14
 */
public final class TextStyleBuilder {

    @ToString
    private StrokeStyle outline;
    @ToString
    private DecorationFilling filling;

    private TextStyleBuilder() {
    }

    /**
     * 新しい{@link TextStyleBuilder}のインスタンスを返します。
     *
     * @return 新しいテキストスタイルビルダーのインスタンス
     */
    public static TextStyleBuilder builder() {
        return new TextStyleBuilder();
    }

    /**
     * {@link TextStyle}のアウトラインの{@link StrokeStyle}を設定します。
     *
     * @param outline テキストスタイルに設定するアウトラインのスタイル
     */
    public void outline(StrokeStyle outline) {
        this.outline = outline;
    }

    /**
     * {@link TextStyle}の文字の{@link DecorationFilling}を設定します。
     *
     * @param filling テキストスタイルに設定する文字のデコレーション
     */
    public void fill(DecorationFilling filling) {
        nullNot(filling);
        this.filling = filling;
    }

    public TextStyle build() {
        return new TextStyle(outline, filling);
    }

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}