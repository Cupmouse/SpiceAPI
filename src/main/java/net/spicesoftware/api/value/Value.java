package net.spicesoftware.api.value;

import net.spicesoftware.api.util.DeepCopyable;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * 値です。
 * 永久に固定の値を持つ{@link net.spicesoftware.api.value.FixedValue}と、
 * キーフレームで変動する値を持つ{@link net.spicesoftware.api.value.KeyFramedValue}があります。
 *
 * @see net.spicesoftware.api.value.FixedValue
 * @see net.spicesoftware.api.value.KeyFramedValue
 * @since 2014/12/20
 */
public interface Value<T extends DeepCopyable> extends DeepCopyable, Serializable {

    /**
     * この{@code Value}の指定されたフレームでの値を計算し返します。
     *
     * @param frame 指定するフレーム
     * @return 指定されたフレームでの値
     */
    T getValueAt(@Min(0) int frame);

    @Override
    Value<T> copyDeeply();
}
