package net.spicesoftware.api.value;

import net.spicesoftware.api.util.DeepCopyable;

import javax.validation.constraints.Size;
import java.util.Map;
import java.util.Optional;

/**
 * @since 2015/04/07
 */
public interface Values extends DeepCopyable {

    /**
     * この{@code HasValues}の{@link net.spicesoftware.api.value.Value}のマッピングを返します。
     *
     * @return 値のマッピング
     */
    Map<String, ? extends Value<?>> getValueMap();

    /**
     * この{@code HasValues}の指定されたIDの{@link net.spicesoftware.api.value.Value}を返します。
     *
     * @param id id
     * @return 指定されたIDの値
     */
    Optional<? extends Value<?>> getValue(@Size(min = 1) String id);

    @Override
    Values copyDeeply();
}
