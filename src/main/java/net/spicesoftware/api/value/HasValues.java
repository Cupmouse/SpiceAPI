package net.spicesoftware.api.value;

import net.spicesoftware.api.util.DeepCopyable;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Map;
import java.util.Optional;

/**
 * {@link net.spicesoftware.api.value.Value}を持つことを表すインターフェイスです。
 *
 * @since 2014/12/06
 */
public interface HasValues extends DeepCopyable, Serializable {

    /**
     * この{@code HasValues}の{@link Value}のマッピングを返します。
     *
     * @return 値のマッピング
     */
    Map<String, Value<?>> getValueMap();

    /**
     * この{@code HasValues}の指定されたIDの{@link Value}を返します。
     *
     * @param id id
     * @return 指定されたIDの値
     */
    Optional<Value<?>> getValue(@Size(min = 1) String id);

    @Override
    HasValues copyDeeply();
}
