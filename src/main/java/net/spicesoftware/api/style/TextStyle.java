package net.spicesoftware.api.style;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.decoration.fill.DecorationFilling;
import net.spicesoftware.api.util.DeepCopyable;

import java.util.Optional;

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

    static TextStyle textStyle(StrokeStyle outline, DecorationFilling filling) throws NullPointerException {
        return builder().outline(outline).fill(filling).build();
    }

    static TextStyle textStyle(DecorationFilling filling) throws NullPointerException {
        return builder().fill(filling).build();
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
         * {@link TextStyle}のアウトラインの{@link StrokeStyle}を設定します。<br>
         * 指定しないことができます。指定しない場合、アウトラインは設定されません。
         *
         * @param outline テキストスタイルに設定するアウトラインのスタイル
         */
        Builder outline(StrokeStyle outline) throws NullPointerException;

        /**
         * {@link TextStyle}の文字の{@link DecorationFilling}を設定します。
         *
         * @param filling テキストスタイルに設定する文字のデコレーション
         */
        Builder fill(DecorationFilling filling) throws NullPointerException;

        @Override
        default Builder from(TextStyle copy) {
            Optional<StrokeStyle> outline = copy.getOutline();
            if (outline.isPresent()) {
                outline(outline.get());
            }
            fill(copy.getFilling());
            return this;
        }
    }
}
