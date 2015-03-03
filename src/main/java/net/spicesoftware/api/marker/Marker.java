package net.spicesoftware.api.marker;

import net.spicesoftware.api.util.DeepCopyable;

import java.util.Optional;

/**
 * マーカーです。
 *
 * @see net.spicesoftware.api.marker.Markable
 * @since 2014/12/16
 */
public interface Marker extends DeepCopyable {

    /**
     * この{@code Marker}の説明文を返します。
     *
     * @return このマーカーの説明文
     */
    Optional<String> getText();

    @Override
    Marker copyDeeply();
}
