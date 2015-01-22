package net.spicesoftware.api.marker;

import java.util.Optional;

/**
 * マーカーです。
 *
 * @since 2014/12/16
 * @see net.spicesoftware.api.marker.Markable
 */
public interface Marker {

    /**
     * この{@code Marker}の説明文を返します。
     *
     * @return このマーカーの説明文
     */
    Optional<String> getText();

}
