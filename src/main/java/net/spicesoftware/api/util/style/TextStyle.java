package net.spicesoftware.api.util.style;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;

import java.util.Optional;

/**
 * テキストのスタイルを保持します。
 *
 * @since 2015/01/26
 */
public class TextStyle implements DeepCopyable {

    private LineStyle outline;
    private DecorationFilling textFilling;

    public TextStyle(LineStyle outline, DecorationFilling textFilling) {
        this.outline = outline;
        this.textFilling = textFilling;
    }

    public TextStyle(DecorationFilling textFilling) {
        this.textFilling = textFilling;
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
     * この{@code TextStyle}のアウトラインの{@link LineStyle}を設定します。
     *
     * @param outline このテキストスタイルに設定するアウトラインのスタイル
     */
    public void setOutline(LineStyle outline) {
        this.outline = outline;
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
    public DecorationFilling getTextFilling() {
        return textFilling;
    }

    /**
     * この{@code TextStyle}の文字の{@link DecorationFilling}を設定します。
     *
     * @param textFilling このテキストスタイルに設定する文字のデコレーション
     */
    public void setTextFilling(DecorationFilling textFilling) {
        this.textFilling = textFilling;
    }

    public TextStyle copyDeeply() {
        return new TextStyle(outline == null ? null : outline.copyDeeply(), textFilling.copyDeeply());
    }
}
