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
     * ����{@code HasValues}��{@link net.spicesoftware.api.value.Value}�̃}�b�s���O��Ԃ��܂��B
     *
     * @return �l�̃}�b�s���O
     */
    Map<String, ? extends Value<?>> getValueMap();

    /**
     * ����{@code HasValues}�̎w�肳�ꂽID��{@link net.spicesoftware.api.value.Value}��Ԃ��܂��B
     *
     * @param id id
     * @return �w�肳�ꂽID�̒l
     */
    Optional<? extends Value<?>> getValue(@Size(min = 1) String id);

    @Override
    Values copyDeeply();
}
