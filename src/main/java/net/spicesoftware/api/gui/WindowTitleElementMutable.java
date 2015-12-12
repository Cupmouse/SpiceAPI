package net.spicesoftware.api.gui;

import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;
import net.spicesoftware.api.util.Validate;

import java.util.Optional;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * @since 2015/12/10
 */
public final class WindowTitleElementMutable<T> implements WindowTitleElement {

    @ToString
    private Object label;
    @ToString
    private T value;

    private WindowTitleElementMutable(Object label, T value) {
        nullNot(value);
        this.label = label;
        this.value = value;
    }

    public static <T> WindowTitleElementMutable<T> mutable(T value) {
        return new WindowTitleElementMutable<>(null, value);
    }

    public static <T> WindowTitleElementMutable<T> mutable(Object label, T value) {
        return new WindowTitleElementMutable<>(label, value);
    }

    /**
     * 値を返します。
     *
     * @return 値
     */
    public T getValue() {
        return value;
    }

    /**
     * 値を設定します。
     *
     * @param value 設定する値
     */
    public void setValue(T value) {
        nullNot(value);
        this.value = value;
    }

    @Override
    public String plain() {
        return value.toString();
    }

    @Override
    public Optional<Object> getLabel() {
        return Optional.ofNullable(label);
    }

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}
