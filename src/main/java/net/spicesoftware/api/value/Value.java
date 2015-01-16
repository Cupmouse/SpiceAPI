package net.spicesoftware.api.value;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @since 2014/12/20
 */
public interface Value<T> extends Serializable {

    /**
     * この{@code Value}の指定されたフレームでの値を計算し返します。
     *
     * @param frame 指定するフレーム
     * @return 指定されたフレームでの値
     */
    T getValueAt(@Min(value = 0) int frame);

}
