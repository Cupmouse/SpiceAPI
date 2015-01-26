package net.spicesoftware.api.value;

import net.spicesoftware.api.util.DeepCopyable;

/**
 * キーフレームを持たない永久に固定の値をもつ{@link net.spicesoftware.api.value.Value}です。
 *
 * @since 2014/12/20
 */
public interface FixedValue<T extends DeepCopyable> extends Value<T> {

    /**
     * この{@code FixedValue}に設定されている値を返します。
     *
     * @return 固定値
     */
    T getValue();

    /**
     * この{@code FixedValue}の値を変更します。
     *
     * @param value 設定する値
     */
    void setValue(T value);

    @Override
    FixedValue<T> copyDeeply();
}
