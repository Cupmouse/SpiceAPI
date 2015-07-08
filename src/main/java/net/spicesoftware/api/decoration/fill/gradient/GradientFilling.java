package net.spicesoftware.api.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;
import net.spicesoftware.api.decoration.fill.DecorationFilling;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Map;
import java.util.Optional;

/**
 * グラデーションの塗りつぶしです。
 * <p>
 * グラデーションのキーとなる色(中間色)を、0を最小、999を最大として配置します。
 * キーの間の色を補完することで、グラデーションになります。
 *
 * @see GradientFillingLinear
 * @see GradientFillingRadial
 * @since 2015/01/27
 */
public interface GradientFilling<T extends Color> extends DecorationFilling {

    /**
     * この{@code GradientFilling}の中間色のマッピングを返します。
     *
     * @return このグラデーションの中間色のマッピング
     */
    @Size(min = 2, max = 999)
    Map<Integer, T> getColorStopMap();

    /**
     * この{@code GradientFilling}の指定された位置の中間色を返します。
     *
     * @param i 取得する中間色の位置
     * @return このグラデーションの指定された位置の中間色
     */
    Optional<T> getColorStopAt(@Min(0) @Max(999) int i);

    /**
     * この{@code GradientFilling}の指定された位置の中間色を設定します。
     *
     * @param i     中間色を設定する位置
     * @param color 中間色にとして設定する色
     */
    void setColorStopAt(@Min(0) @Max(999) int i, T color);

    /**
     * この{@code GradientFilling}の指定された位置の中間色を削除します。
     *
     * @param i 削除する中間色の位置
     */
    void removeColorStopAt(@Min(0) @Max(999) int i);

    /**
     * この{@code GradientFilling}がリピートするかどうかを設定します。
     *
     * @param repeat このグラデーションがリピートするかどうか
     */
    void setRepeat(boolean repeat);

    /**
     * この{@code GradientFilling}がリピートするように設定します。
     */
    void repeat();

    /**
     * この{@code GradientFilling}がリピートするかどうかを返します。
     *
     * @return このグラデーションがリピートするかどうか
     */
    boolean isRepeating();

    @Override
    GradientFilling<T> copyDeeply();
}
