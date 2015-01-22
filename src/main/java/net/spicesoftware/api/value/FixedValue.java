package net.spicesoftware.api.value;

/**
 * @since 2014/12/20
 */
public interface FixedValue<T> extends Value<T> {

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
