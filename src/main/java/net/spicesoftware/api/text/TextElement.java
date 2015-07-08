package net.spicesoftware.api.text;

import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.style.TextStyle;

import java.util.Optional;

/**
 * 文字列とスタイルをペアで保持するイミュータブルクラス
 *
 * @since 2015/07/07
 */
public interface TextElement extends DeepCopyable {

    /**
     * この{@code TextElement}の{@link String}文字列
     *
     * @return このテキストエレメントの文字列
     */
    String getString();

    /**
     * この{@code TextElement}の{@link TextStyle}を返します。
     * 空の{@link Optional}の場合、デフォルトスタイル
     *
     * @return このテキストエレメントのテキストスタイル
     */
    Optional<TextStyle> getTextStyle();

    @Override
    TextElement copyDeeply();
}
