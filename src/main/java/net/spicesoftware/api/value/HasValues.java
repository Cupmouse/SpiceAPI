package net.spicesoftware.api.value;

import net.spicesoftware.api.util.DeepCopyable;

/**
 * {@link Value}を持つことを表すインターフェイスです。
 *
 * @since 2014/12/06
 */
public interface HasValues extends DeepCopyable {

    /**
     * この{@code HasValues}が持つ全値を持つ{@link Values}を返します。
     *
     * @return これが持つ全値を持つValues
     */
    Values getValues();

    @Override
    HasValues copyDeeply();
}
