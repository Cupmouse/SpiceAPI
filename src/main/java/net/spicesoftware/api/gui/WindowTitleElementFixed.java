package net.spicesoftware.api.gui;

import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;
import net.spicesoftware.api.util.Validate;

import java.util.Optional;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * 値が変更できないイミュータブルな{@link WindowTitleElement}です。
 *
 * @see WindowTitleElementMutable 値が変更できる{@link WindowTitleElement}
 * @since 2015/11/07
 */
public final class WindowTitleElementFixed<T> implements WindowTitleElement {

    @ToString
    private Object label;
    @ToString
    private T value;

    private WindowTitleElementFixed(Object label, T value) {
        nullNot(value);
        this.label = label;
        this.value = value;
    }

    public static <T> WindowTitleElementFixed<T> fixed(T value) {
        return new WindowTitleElementFixed<>(null, value);
    }

    public static <T> WindowTitleElementFixed<T> fixed(Object label, T value) {
        return new WindowTitleElementFixed<>(label, value);
    }

    /**
     * 固定値を返します。
     *
     * @return 固定値
     */
    public T getValue() {
        return value;
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
