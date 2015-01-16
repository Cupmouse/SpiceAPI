package net.spicesoftware.api.marker;

import javax.validation.constraints.Min;
import java.util.Map;
import java.util.Optional;

/**
 * @since 2014/12/13
 */
public interface Markable {

    /**
     * この{@code Markable}のすべての{@link Marker}のマッピングを返します。
     *
     * @return すべてのマーカーのマッピング
     */
    Map<Integer, Marker> getMarkerMap();

    /**
     * この{@code Markable}の{@link Marker}の総数を返します。
     *
     * @return マーカーの総数
     */
    @Min(value = 0)
    int getNumberOfMarkers();

    /**
     * この{@code Markable}の指定したフレームにある{@link Marker}を返します。
     *
     * @param frame フレーム
     * @return 指定したフレームにあるマーカー
     */
    Optional<Marker> getMarkerAt(@Min(value = 0) int frame);

    /**
     * この{@code Markable}の指定したフレームに{@link Marker}を追加します。
     *
     * @param frame フレーム
     * @return 追加したマーカー
     */
    Marker addMarkerAt(@Min(value = 0) int frame);

    /**
     * この{@code Markable}の指定したフレームの{@link Marker}を削除します。
     *
     * @param frame 削除するマーカーのフレーム
     */
    void removeMarkerAt(@Min(value = 0) int frame);

    /**
     * この{@code Markable}の指定したインデックス番号の{@link Marker}を削除します。
     *
     * @param index 削除するマーカーのインデックス番号
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    void removeMarkerByIndex(@Min(value = 0) int index) throws IndexOutOfBoundsException;

}
