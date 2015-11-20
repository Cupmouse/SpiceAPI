package net.spicesoftware.api.layer;

import net.spicesoftware.api.util.DeepCopyable;

import javax.validation.constraints.Min;
import java.util.List;

/**
 * アイテムを持つレイヤーです。
 *
 * @since 2015/01/17
 */
public interface Layerable extends DeepCopyable {

    /**
     * この{@code Layerable}のすべての{@link Layer}を上から順に並べたものを返します。
     *
     * @return このLayerableのすべてのレイヤー
     */
    List<Layer> getLayers();

    /**
     * この{@code Layerable}の{@link Layer}の総数を返します。
     *
     * @return このLayerableのレイヤーの総数
     */
    @Min(0)
    int getNumberOfLayers();

    /**
     * この{@code Layerable}の指定されたインデックス番号の{@link Layer}を返します。
     * インデックス番号は0以上で上から順に付けられます。
     *
     * @param index 取得するレイヤーのインデックス番号
     * @return このLayerableの指定されたインデックス番号のレイヤー
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    Layer getLayer(@Min(0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Layerable}の最後に新しい{@link Layer}を追加します。
     *
     * @return このLayerableに追加したレイヤー
     */
    Layer addLastNewLayer();

    /**
     * この{@code Layerable}の最初に新しい{@link Layer}を追加します。
     *
     * @return このLayerableに追加したレイヤー
     */
    Layer addFirstNewLayer();

    /**
     * 新しい{@link Layer}を指定されたインデックス番号として挿入します。
     *
     * @param index 追加するレイヤーに割り振られるインデックス番号
     * @return このLayerableに追加したレイヤー
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    Layer insertNewLayer(@Min(0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Layerable}の{@link Layer}を削除します。
     *
     * @param index このLayerableから削除するレイヤーの番号
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    void removeLayer(@Min(0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Layerable}の最初の{@link Layer}を削除します。
     *
     * @throws IllegalStateException レイヤーが存在しない場合
     */
    void removeFirstLayer() throws IllegalStateException;

    /**
     * この{@code Layerable}の最後の{@link Layer}を削除します。
     *
     * @throws IllegalStateException レイヤーが存在しない場合
     */
    void removeLastLayer() throws IllegalStateException;

    /**
     * この{@code Layerable}の{@link Layer}をすべて削除します。
     */
    void removeAllLayer();

    /**
     * この{@code Layerable}の{@link StaticField}を返します。
     *
     * @return このLayerableのスタティックフィールド
     */
    StaticField getStaticField();

    /**
     * この{@code Layerable}の{@link StaticField}を新しいものに置き換えます。
     */
    void resetStaticField();

    @Override
    Layerable copyDeeply();
}
