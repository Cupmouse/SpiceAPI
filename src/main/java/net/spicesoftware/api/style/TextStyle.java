package net.spicesoftware.api.style;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;

import java.util.Optional;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * テキストのスタイルを保持します。
 * イミュータブルクラスです。
 *
 * @since 2015/01/26
 */
public interface TextStyle extends DeepCopyable {

    /**
     * 新しい{@link Builder}のインスタンスを返します。
     *
     * @return 新しいテキストスタイルビルダーのインスタンス
     */
    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    /**
     * この{@code TextStyle}のアウトラインの{@link StrokeStyle}を返します。
     *
     * @return このテキストスタイルのアウトラインのスタイル
     */
    Optional<StrokeStyle> getOutline();

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
    DecorationFilling getFilling();

    TextStyle copyDeeply();
    /**
     * @since 2015/08/14
     */

    interface Builder extends ParameterEssentialBuilder<TextStyle> {

        /**
         * {@link TextStyle}のアウトラインの{@link StrokeStyle}を設定します。
         *
         * @param outline テキストスタイルに設定するアウトラインのスタイル
         */
        void outline(StrokeStyle outline);

        /**
         * {@link TextStyle}の文字の{@link DecorationFilling}を設定します。
         *
         * @param filling テキストスタイルに設定する文字のデコレーション
         */
        void fill(DecorationFilling filling);
    }
}
