package net.spicesoftware.api.util.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;
import net.spicesoftware.api.decoration.fill.DecorationFilling;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * グラデーションの塗りつぶしです。
 * <p>
 * グラデーションのキーとなる色(中間色)を、0を最小、999を最大として配置します。
 * キーの間の色を補完することで、グラデーションになります。
 *
 * @see net.spicesoftware.api.util.decoration.fill.gradient.GradientFillingLinear
 * @see net.spicesoftware.api.util.decoration.fill.gradient.GradientFillingRadial
 * @since 2015/01/27
 */
public abstract class ColorStopGradientFilling<T extends Color> implements DecorationFilling {

    public boolean repeat;
    private Map<Integer, T> colorStopMap = new HashMap<Integer, T>();

    public ColorStopGradientFilling(T firstColor, int firstColorPos, T secondColor, int secondColorPos, boolean repeat) {
        this.repeat = repeat;
    }

    public ColorStopGradientFilling(T firstColor, int firstColorPos, T secondColor, int secondColorPos) {
        this(firstColor, firstColorPos, secondColor, secondColorPos, false);
    }

    protected ColorStopGradientFilling() {
    }

    /**
     * この{@code GradientFilling}の中間色のマッピングを返します。
     *
     * @return このグラデーションの中間色のマッピング
     */
    public Map<Integer, T> getColorStopMap() {
        return Collections.unmodifiableMap(colorStopMap);
    }

    /**
     * この{@code GradientFilling}の指定された位置の中間色を返します。
     *
     * @param i 取得する中間色の位置
     * @return このグラデーションの指定された位置の中間色
     */
    public Optional<T> getColorStopAt(@Min(0) @Max(999) int i) {
        return Optional.ofNullable(colorStopMap.get(i));
    }

    /**
     * この{@code GradientFilling}の指定された位置の中間色を設定します。
     *
     * @param i     中間色を設定する位置
     * @param color 中間色にとして設定する色
     */
    public void setColorStopAt(@Min(0) @Max(999) int i, T color) {
        colorStopMap.put(i, color);
    }

    /**
     * この{@code GradientFilling}の指定された位置の中間色を削除します。
     *
     * @param i 削除する中間色の位置
     */
    public void removeColorStopAt(@Min(0) @Max(999) int i) {
        colorStopMap.remove(i);
    }

    /**
     * この{@code GradientFilling}がリピートするかどうかを設定します。
     *
     * @param repeat このグラデーションがリピートするかどうか
     */
    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    /**
     * この{@code GradientFilling}がリピートするように設定します。
     */
    public void repeat() {
        this.repeat = true;
    }

    /**
     * この{@code GradientFilling}がリピートするかどうかを返します。
     *
     * @return このグラデーションがリピートするかどうか
     */
    public boolean isRepeating() {
        return repeat;
    }

    @Override
    public abstract ColorStopGradientFilling<T> copyDeeply();

    public void copyDeeply(ColorStopGradientFilling newColorStopGradientFilling) {
        for (Map.Entry<Integer, T> entry : colorStopMap.entrySet()) {
            newColorStopGradientFilling.colorStopMap.put(entry.getKey(), entry.getValue().copyDeeply());
        }
    }
}
