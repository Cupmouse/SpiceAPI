package net.spicesoftware.api.decoration.fill.gradient;

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
}
