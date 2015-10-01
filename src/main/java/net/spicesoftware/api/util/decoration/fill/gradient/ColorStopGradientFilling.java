package net.spicesoftware.api.util.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;
import net.spicesoftware.api.decoration.fill.GradientFilling;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static net.spicesoftware.api.util.Validate.nullNot;
import static net.spicesoftware.api.util.Validate.rangeIn;

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
public abstract class ColorStopGradientFilling<T extends Color> implements GradientFilling {

    private final boolean repeat;
    private final Map<Integer, T> colorStopMap;

    protected ColorStopGradientFilling(Map<Integer, T> colorStopMap, boolean repeating) {
        nullNot(colorStopMap);
        this.colorStopMap = Collections.unmodifiableMap(colorStopMap);
        this.repeat = repeating;
    }

    protected ColorStopGradientFilling(ColorStopGradientFilling<T> copyFrom) {
        nullNot(copyFrom);
        this.colorStopMap = Collections.unmodifiableMap(new HashMap<>(copyFrom.colorStopMap));
        this.repeat = copyFrom.repeat;
    }

    /**
     * この{@code GradientFilling}の中間色のマッピングを返します。
     *
     * @return このグラデーションの中間色のマッピング
     */
    public Map<Integer, T> getColorStopMap() {
        return colorStopMap;
    }

    /**
     * この{@code GradientFilling}の指定された位置の中間色を返します。
     *
     * @param i 取得する中間色の位置
     * @return このグラデーションの指定された位置の中間色
     */
    public Optional<T> getColorStopAt(@Min(0) @Max(999) int i) {
        rangeIn(i, 0, 999);
        return Optional.ofNullable(colorStopMap.get(i));
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

//    protected static abstract class ColorStopGradientFillingBasicFactory<T extends Color> {
//
//        protected ColorStopGradientFillingBasicFactory() {
//        }
//
//        public ColorStopGradientFilling<T> twoColor(T firstColor, int firstColorPos, T secondColor, int secondColorPos, boolean repeating) {
//            if (firstColorPos < 0 || firstColorPos > 999 || secondColorPos < 0 || secondColorPos > 999) {
//                throw new IllegalArgumentException();
//            }
//            if (firstColor == null || secondColor == null) {
//                throw new NullPointerException();
//            }
//            Map<Integer, T> colorStopMap = new HashMap<>();
//            colorStopMap.put(firstColorPos, firstColor);
//            colorStopMap.put(secondColorPos, secondColor);
//            return createNew(Collections.unmodifiableMap(colorStopMap), repeating);
//        }
//
//        public ColorStopGradientFilling<T> twoColor(T firstColor, int firstColorPos, T secondColor, int secondColorPos) {
//            return twoColor(firstColor, firstColorPos, secondColor, secondColorPos, false);
//        }
//
//        public ColorStopGradientFilling<T> twoColor(T firstColor, T secondColor, boolean repeating) {
//            return twoColor(firstColor, 0, secondColor, 999, repeating);
//        }
//
//        public ColorStopGradientFilling<T> twoColor(T firstColor, T secondColor) {
//            return twoColor(firstColor, secondColor, false);
//        }
//
//        public abstract ColorStopGradientFilling<T> createNew(Map<Integer, T> colorStopMap, boolean repeating);
//    }

    protected static abstract class ColorStopGradientFillingBasicBuilder<T extends Color> {

        protected final Map<Integer, T> colorStopMap = new HashMap<>();
        protected boolean repeating;

        protected ColorStopGradientFillingBasicBuilder() {
        }

        /**
         * この{@code GradientFilling}の指定された位置の中間色を設定します。
         *
         * @param i     中間色を設定する位置
         * @param color 中間色にとして設定する色
         */
        public void setColorStopAt(@Min(0) @Max(999) int i, T color) {
            rangeIn(i, 0, 999);
            nullNot(color);
            colorStopMap.put(i, color);
        }

        /**
         * この{@code GradientFilling}の指定された位置の中間色を削除します。
         *
         * @param i 削除する中間色の位置
         */
        public void removeColorStopAt(@Min(0) @Max(999) int i) {
            rangeIn(i, 0, 999);
            colorStopMap.remove(i);
        }

        /**
         * この{@code GradientFilling}がリピートするかどうかを設定します。
         *
         * @param repeating このグラデーションがリピートするかどうか
         */
        public void setRepeating(boolean repeating) {
            this.repeating = repeating;
        }

        /**
         * この{@code GradientFilling}がリピートするように設定します。
         */
        public void repeat() {
            this.repeating = true;
        }

        public abstract ColorStopGradientFilling<T> build();
    }
}
