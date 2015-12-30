package net.spicesoftware.api;

/**
 * @since 2015/11/14
 */
public interface ParameterEssentialBuilder<T> extends Builder<T> {

    @Override
    T build() throws IllegalStateException;

    @Override
    ParameterEssentialBuilder<T> from(T copy);
}
