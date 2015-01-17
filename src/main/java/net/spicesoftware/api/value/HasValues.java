package net.spicesoftware.api.value;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Map;
import java.util.Optional;

/**
 * @since 2014/12/06
 */
public interface HasValues extends Serializable {

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

}