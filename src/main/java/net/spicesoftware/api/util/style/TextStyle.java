package net.spicesoftware.api.util.style;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;

import javax.annotation.Nullable;
import java.util.Optional;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * テキストのスタイルを保持します。
 * イミュータブルクラスです。
 *
 * @since 2015/01/26
 */
public final class TextStyle implements DeepCopyable {

    @ToString
    private final StrokeStyle outline;
    @ToString
    private final DecorationFilling filling;

    public TextStyle(@Nullable StrokeStyle outline, DecorationFilling filling) {
        nullNot(filling);
        this.outline = outline;
        this.filling = filling;
    }

    /**
     * この{@code TextStyle}のアウトラインの{@link StrokeStyle}を返します。
     *
     * @return このテキストスタイルのアウトラインのスタイル
     */
    public Optional<StrokeStyle> getOutline() {
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

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}
