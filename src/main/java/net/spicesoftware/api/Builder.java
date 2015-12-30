package net.spicesoftware.api;

/**
 * @since 2015/11/14
 */
public interface Builder<T> {

    // TODO from
    T build();

    /**
     * 指定された{@code &ltT&gt;}型のインスタンスを元に、新しい{@code Builder&lt;T&gt;}を作成します。
     *
     * @param copy 元になる{@code &lt;T&gt;}型のインスタンス
     * @return 新しい{@code  Builder&lt;T&gt;}
     */
    Builder<T> from(T copy);
}
