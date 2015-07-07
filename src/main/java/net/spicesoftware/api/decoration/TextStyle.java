package net.spicesoftware.api.decoration;

import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;

import java.util.Optional;

/**
 * テキストのスタイルを保持します。
 *
 * @since 2015/01/26
 */
public interface TextStyle extends DeepCopyable {

    /**
     * この{@code TextStyle}のアウトラインの{@link LineStyle}を返します。
     *
     * @return このテキストスタイルのアウトラインのスタイル
     */
    Optional<LineStyle> getOutline();

    /**
     * この{@code TextStyle}のアウトラインの{@link LineStyle}を設定します。
     *
     * @param outline このテキストスタイルに設定するアウトラインのスタイル
     */
    void setOutline(LineStyle outline);

    /**
     * アウトラインが存在する、縁取られているかを真偽値で返します。
     *
     * @return アウトラインが存在するか
     */
    boolean isOutlined();

    /**
     * この{@code TextStyle}の文字の{@link DecorationFilling}を返します。
     *
     * @return このテキストスタイルの文字のデコレーション
     */
    DecorationFilling getTextDecoration();

    /**
     * この{@code TextStyle}の文字の{@link DecorationFilling}を設定します。
     *
     * @param textDecoration このテキストスタイルに設定する文字のデコレーション
     */
    void setTextDecoration(DecorationFilling textDecoration);

    @Override
    TextStyle copyDeeply();
}
