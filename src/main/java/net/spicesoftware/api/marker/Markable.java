package net.spicesoftware.api.marker;

/**
 * マーカーできるものが実装するインターフェイスです。
 *
 * @since 2014/12/13
 */
public interface Markable {

    /**
     * この{@code Markable}が持つマーカーを持つ{@link net.spicesoftware.api.marker.Markers}を返します。
     *
     * @return これが持つ、全マーカーを持つMarkersを返します。
     */
    Markers getMarkers();
}
