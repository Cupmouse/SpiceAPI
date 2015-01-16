package net.spicesoftware.api.item;

import net.spicesoftware.api.color.Color;
import net.spicesoftware.api.color.palette.Palette;
import net.spicesoftware.api.layer.Layer;
import net.spicesoftware.api.layer.StaticLayer;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

/**
 * @since 2014/10/04
 */
public interface ItemBox extends Item {

    /**
     * この{@code Box}のすべての{@link net.spicesoftware.api.layer.Layer}を上から順に並べたものを返します。
     *
     * @return このボックスのすべてのレイヤー
     */
    List<Layer> getLayers();

    /**
     * この{@code Box}の{@link net.spicesoftware.api.layer.Layer}の総数を返します。
     *
     * @return このボックスのレイヤーの総数
     */
    @Min(value = 0)
    int getNumberOfLayers();

    /**
     * この{@code Box}の指定されたインデックス番号の{@link net.spicesoftware.api.layer.Layer}を返します。
     * インデックス番号は0以上で上から順に付けられます。
     *
     * @param index 取得するレイヤーのインデックス番号
     * @return このボックスの指定されたインデックス番号のレイヤー
     * @throws java.lang.IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    Layer getLayer(@Min(value = 0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Box}の最後に新しい{@link net.spicesoftware.api.layer.Layer}を追加します。
     *
     * @return このボックスに追加したレイヤー
     */
    Layer addLastNewLayer();

    /**
     * この{@code Box}の最初に新しい{@link net.spicesoftware.api.layer.Layer}を追加します。
     *
     * @return このボックスに追加したレイヤー
     */
    Layer addFirstNewLayer();

    /**
     * 新しい{@link net.spicesoftware.api.layer.Layer}を指定されたインデックス番号として挿入します。
     *
     * @param index 追加するレイヤーに割り振られるインデックス番号
     * @return このボックスに追加したレイヤー
     * @throws java.lang.IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    Layer insertNewLayer(@Min(value = 0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Box}の{@link net.spicesoftware.api.layer.Layer}を削除します。
     *
     * @param index このボックスから削除するレイヤーの番号
     * @throws java.lang.IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    void removeLayer(@Min(value = 0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Box}の最初の{@link net.spicesoftware.api.layer.Layer}を削除します。
     *
     * @throws java.lang.IllegalStateException レイヤーが存在しない場合
     */
    void removeFirstLayer() throws IllegalStateException;

    /**
     * この{@code Box}の最後の{@link net.spicesoftware.api.layer.Layer}を削除します。
     *
     * @throws java.lang.IllegalStateException レイヤーが存在しない場合
     */
    void removeLastLayer() throws IllegalStateException;

    /**
     * この{@code Box}の{@link net.spicesoftware.api.layer.Layer}をすべて削除します。
     */
    void removeAllLayer();

    /**
     * この{@code Box}の{@link net.spicesoftware.api.layer.StaticLayer}を返します。
     *
     * @return このボックスのスタティックレイヤー
     */
    StaticLayer getStaticLayer();

    /**
     * この{@code Box}の{@link net.spicesoftware.api.layer.StaticLayer}を新しいものに置き換えます。
     */
    void resetStaticLayer();

    /**
     * この{@code Box}の{@link net.spicesoftware.api.color.palette.Palette}を返します。
     *
     * @return このボックスの色の表現
     */
    Palette getPalette();

    /**
     * この{@code Box}の背景を返します。
     *
     * @return このボックスの背景色、透明の場合はnull
     */
    Optional<Color> getBackgroundColor();

    /**
     * この{@code Box}の最大フレーム数を返します。
     *
     * @return このボックスの最大フレーム数
     */
    @Min(value = 0)
    int getMaxFrame();

    /**
     * この{@code Box}の最大フレーム数を設定します。
     *
     * @param frame このボックスに設定する最大フレーム数
     */
    void setMaxFrame(@Min(value = 0) int frame);

    @Override
    ItemBox copy();
}
