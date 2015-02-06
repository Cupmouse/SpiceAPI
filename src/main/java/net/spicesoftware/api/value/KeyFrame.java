package net.spicesoftware.api.value;

import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.NotRegisteredInterpolatorException;

import java.io.Serializable;

/**
 * キーフレームです。
 * 保管方法とキーフレームの値を持ちます。
 *
 * @since 2014/12/13
 */
public interface KeyFrame<T extends DeepCopyable> extends DeepCopyable, Serializable {

    /**
     * この{@code KeyFrame}の補間法を返します。
     *
     * @return このキーフレームの補間法
     */
    Interpolator getInterpolator();

    /**
     * この{@code KeyFrame}の補間法を設定します。
     *
     * @param interpolator 設定する補間法
     */
    void setInterpolator(Interpolator<T> interpolator) throws NotRegisteredInterpolatorException;

    /**
     * この{@code KeyFrame}の値を返します。
     *
     * @return このキーフレームの値
     */
    T getValue();

    /**
     * この{@code KeyFrame}の値を設定します。
     *
     * @param value 設定する値
     */
    void setValue(T value);

    /**
     * この{@code KeyFrame}のディープコピーを返します。
     * Interpolatorのインスタンスはコピーされません。
     * 全く同じインスタンスのInterpolatorがコピーに格納されます。
     *
     * @return このキーフレームのディープコピー
     */
    @Override
    KeyFrame<T> copyDeeply();
}
