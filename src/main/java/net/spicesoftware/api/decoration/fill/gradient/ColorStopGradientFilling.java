package net.spicesoftware.api.decoration.fill.gradient;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.decoration.fill.Color;
import net.spicesoftware.api.decoration.fill.GradientFilling;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Map;
import java.util.Optional;

/**
 * グラデーションの塗りつぶしです。
 * <p>
 * グラデーションのキーとなる色(中間色)を、0を最小、999を最大として配置します。
 * キーの間の色を補完することで、グラデーションになります。
 *
 * @see net.spicesoftware.api.decoration.fill.gradient.GradientFillingLinear
 * @see net.spicesoftware.api.decoration.fill.gradient.GradientFillingRadial
 * @since 2015/01/27
 */
public interface ColorStopGradientFilling<T extends Color> extends GradientFilling {

    /**
     * この{@code GradientFilling}の中間色のマッピングを返します。
     *
     * @return このグラデーションの中間色のマッピング
     */
    Map<Integer, T> getColorStopMap();

    /**
     * この{@code GradientFilling}の指定された位置の中間色を返します。
     *
     * @param i 取得する中間色の位置
     * @return このグラデーションの指定された位置の中間色
     */
    Optional<T> getColorStopAt(@Min(0) @Max(999) int i);

    /**
     * この{@code GradientFilling}がリピートするかどうかを返します。
     *
     * @return このグラデーションがリピートするかどうか
     */
    boolean isRepeating();

    @Override
    ColorStopGradientFilling<T> copyDeeply();

    /**
     * @since 2015/11/15
     */
    interface IBuilder<C extends Color, T extends ColorStopGradientFilling<C>> extends ParameterEssentialBuilder<T> {

        /**
         * この{@code GradientFilling}の指定された位置の中間色を設定します。
         *
         * @param i     中間色を設定する位置
         * @param color 中間色にとして設定する色
         */
        IBuilder<C, T> colorStopAt(@Min(0) @Max(999) int i, C color);

        /**
         * この{@code GradientFilling}がリピートするかどうかを設定します。
         *
         * @param repeating このグラデーションがリピートするかどうか
         */
        IBuilder<C, T> repeating(boolean repeating);

        /**
         * この{@code GradientFilling}がリピートするように設定します。
         */
        IBuilder<C, T> repeat();
    }
}
