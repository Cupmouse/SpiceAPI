package net.spicesoftware.api.value;

import java.io.Serializable;

/**
 * @since 2014/12/13
 */
public interface KeyFrame<T> extends Serializable {

    /**
     * この{@code KeyFrame}の補間法を返します。
     *
     * @return このキーフレームの補間法
     */
    Interpolator getInterpolator();

    /**
     * この{@code KeyFrame}の値を返します。
     *
     * @return このキーフレームの値
     */
    T getValue();

}
