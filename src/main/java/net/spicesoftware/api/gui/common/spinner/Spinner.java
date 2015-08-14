package net.spicesoftware.api.gui.common.spinner;

import net.spicesoftware.api.gui.GUIHaveText;

/**
 * ユーザーが値をグラフィカルに変更できるコンポーネントです。
 *
 * @since 2015/07/04
 */
public interface Spinner<T extends Number> extends GUIHaveText {

    /**
     * このスピナーの現在の値を返します。
     * <p>
     * {@link #setMaxValue(T)}で設定した最大値より大きい値、
     * もしくは、
     * {@link #setMinValue(T)}で設定した最小値より小さい値
     * を返すことはありません。
     *
     * @return このスピナーの現在の値
     */
    T getValue();

    /**
     * このスピナーの値を設定します。
     *
     * @param value このスピナーに設定する値
     * @throws IllegalArgumentException {@link #setMaxValue(T)}で設定した最大値より大きい値、
     *                                  もしくは、
     *                                  {@link #setMinValue(T)}で設定した最小値より小さい値
     *                                  を設定しようとした場合
     */
    void setValue(T value) throws IllegalArgumentException;

    /**
     * このスピナーで許容される最大値（一番大きな値）を返します。
     * このスピナーの値が最大値よりも大きくなることはありません。
     *
     * @return このスピナーで許容される最大値
     */
    T getMaxValue();

    /**
     * このスピナーで許容される最大値（一番大きな値）を設定します。
     * このスピナーの値が最大値よりも大きくなることはありません。
     * <p>
     * また、現在スピナーに設定されている値が、設定する最大値より大きい場合は、最大値に収まるように修正されます。
     * つまり、値が最大値に置き換わります。
     *
     * @param maxValue このスピナーで許容されるようになる最大値
     * @throws IllegalArgumentException {@link #setMinValue(T)}で設定した最小値よりも小さい最大値を設定しようとした場合
     */
    void setMaxValue(T maxValue) throws IllegalArgumentException;

    /**
     * この関数が呼ばれた後は、このスピナーを最大値で縛りません。
     * 最大値はリセット(int型の最大値に変更)されます。
     */
    void disableMaxValue();

    /**
     * このスピナーで許容される最小値（一番小さな値）を返します。
     * このスピナーの値が最小値よりも小さくなることはありません。
     *
     * @return このスピナーで許容される最小値
     */
    T getMinValue();

    /**
     * このスピナーで許容される最小値（一番小さな値）を設定します。
     * このスピナーの値が最小値よりも小さくなることはありません。
     * <p>
     * また、現在スピナーに設定されている値が、設定する最小値より小さい場合は、最小値に収まるように修正されます。
     * つまり、値が最小値に置き換わります。
     *
     * @param minValue このスピナーで許容されるようになる最小値
     * @throws IllegalArgumentException {@link #setMaxValue(T)}で設定した最大値よりも大きい最小値を設定しようとした場合
     */
    void setMinValue(T minValue);

    /**
     * この関数が呼ばれた後は、このスピナーを最小値で縛りません。
     * 最小値はリセット(int型の最小値に変更)されます。
     */
    void disableMinValue();

    /**
     * このスピナーが指定された{@link SpinnerListener}、リスナを呼ぶようにします。
     *
     * @param spinnerListener このスピナーに呼ばれるリスナのインスタンス
     */
    void addSpinnerListener(SpinnerListener spinnerListener);
}
