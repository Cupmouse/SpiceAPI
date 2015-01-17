package net.spicesoftware.api.layer;

import javax.validation.constraints.Min;
import java.util.List;

/**
 * @since 2015/01/17
 */
public interface Layerable {

    /**
     * この{@code Layerable}のすべての{@link net.spicesoftware.api.layer.Layer}を上から順に並べたものを返します。
     *
     * @return このLayerableのすべてのレイヤー
     */
    List<Layer> getLayers();

    /**
     * この{@code Layerable}の{@link net.spicesoftware.api.layer.Layer}の総数を返します。
     *
     * @return このLayerableのレイヤーの総数
     */
    @Min(value = 0)
    int getNumberOfLayers();

    /**
     * この{@code Layerable}の指定されたインデックス番号の{@link net.spicesoftware.api.layer.Layer}を返します。
     * インデックス番号は0以上で上から順に付けられます。
     *
     * @param index 取得するレイヤーのインデックス番号
     * @return このLayerableの指定されたインデックス番号のレイヤー
     * @throws java.lang.IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    Layer getLayer(@Min(value = 0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Layerable}の最後に新しい{@link net.spicesoftware.api.layer.Layer}を追加します。
     *
     * @return このLayerableに追加したレイヤー
     */
    Layer addLastNewLayer();

    /**
     * この{@code Layerable}の最初に新しい{@link net.spicesoftware.api.layer.Layer}を追加します。
     *
     * @return このLayerableに追加したレイヤー
     */
    Layer addFirstNewLayer();

    /**
     * 新しい{@link net.spicesoftware.api.layer.Layer}を指定されたインデックス番号として挿入します。
     *
     * @param index 追加するレイヤーに割り振られるインデックス番号
     * @return このLayerableに追加したレイヤー
     * @throws java.lang.IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    Layer insertNewLayer(@Min(value = 0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Layerable}の{@link net.spicesoftware.api.layer.Layer}を削除します。
     *
     * @param index このLayerableから削除するレイヤーの番号
     * @throws java.lang.IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    void removeLayer(@Min(value = 0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Layerable}の最初の{@link net.spicesoftware.api.layer.Layer}を削除します。
     *
     * @throws java.lang.IllegalStateException レイヤーが存在しない場合
     */
    void removeFirstLayer() throws IllegalStateException;

    /**
     * この{@code Layerable}の最後の{@link net.spicesoftware.api.layer.Layer}を削除します。
     *
     * @throws java.lang.IllegalStateException レイヤーが存在しない場合
     */
    void removeLastLayer() throws IllegalStateException;

    /**
     * この{@code Layerable}の{@link net.spicesoftware.api.layer.Layer}をすべて削除します。
     */
    void removeAllLayer();

    /**
     * この{@code Layerable}の{@link net.spicesoftware.api.layer.StaticLayer}を返します。
     *
     * @return このLayerableのスタティックレイヤー
     */
    StaticLayer getStaticLayer();

    /**
     * この{@code Layerable}の{@link net.spicesoftware.api.layer.StaticLayer}を新しいものに置き換えます。
     */
    void resetStaticLayer();

}
