package net.spicesoftware.api.layer;

import net.spicesoftware.api.item.Item;
import net.spicesoftware.api.util.time.FrameRanged;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @since 2014/10/04
 */
public interface Layer extends Serializable {

    /**
     * この{@code Layer}のすべての{@link net.spicesoftware.api.item.Item}を返します。
     *
     * @return このレイヤーのすべてのアイテム
     */
    List<FrameRanged<Item>> getAllItems();

    /**
     * この{@code Layer}の{@link net.spicesoftware.api.item.Item}の総数を返します。
     *
     * @return このレイヤーのアイテムの総数
     */
    @Min(value = 0)
    int getNumberOfItems();

    /**
     * この{@code Layer}の指定されたフレームの間のすべての{@link net.spicesoftware.api.item.Item}を返します。
     * フレーム間に含まれるアイテムはすべてが対象になります。
     *
     * @param frameFrom 開始フレーム
     * @param frameTo   終了フレーム
     * @return このレイヤーの指定されたフレームの間のすべてのアイテム
     */
    List<FrameRanged<Item>> getItemInFrameRange(@Min(value = 0) int frameFrom, @Min(value = 0) int frameTo);

    /**
     * この{@code Layer}の指定されたインデックス番号の間のすべての{@link net.spicesoftware.api.item.Item}を返します。
     *
     * @param indexFrom 開始インデックス番号
     * @param indexTo   終了インデックス番号
     * @return このレイヤーの指定されたインデックス番号の間のすべてのアイテム
     * @throws java.lang.IndexOutOfBoundsException 指定されたインデックス番号のどちらかが管理されている範囲を超えている場合
     */
    List<FrameRanged<Item>> getItemInIndexRange(@Min(value = 0) int indexFrom, @Min(value = 0) int indexTo) throws IndexOutOfBoundsException;

    /**
     * この{@code Layer}の指定されたフレームを含む{@link net.spicesoftware.api.item.Item}のインデックス番号を返します。
     *
     * @param frame フレーム
     * @return このレイヤーの指定されたフレームを含むアイテムのインデックス番号、アイテムがない場合-1
     */
    int getItemIndexFrameAt(@Min(value = 0) int frame);

    /**
     * この{@code Layer}の指定されたフレームの{@link net.spicesoftware.api.item.Item}を返します。
     *
     * @param frame フレーム
     * @return このレイヤーの指定されたフレームのアイテム
     */
    Optional<FrameRanged<Item>> getItemFrameAt(@Min(value = 0) int frame);

    /**
     * この{@code Layer}の指定されたインデックス番号の{@link net.spicesoftware.api.item.Item}を返します。
     *
     * @param index インデックス番号
     * @return このレイヤーの指定されたインデックス番号のアイテム
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    FrameRanged<Item> getItemIndexAt(@Min(value = 0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Layer}に開始フレームと終了フレームを指定して{@link net.spicesoftware.api.item.Item}を追加します。
     *
     * @param item      追加するアイテム
     * @param frameFrom アイテムの開始フレーム
     * @param frameTo   アイテムの終了フレーム
     * @return 追加されたアイテムのインデックス番号
     * @throws java.lang.IllegalArgumentException 開始フレームが終了フレームより小さい場合
     */
    @Min(value = 0)
    int addItem(Item item, @Min(value = 0) int frameFrom, @Min(value = 0) int frameTo) throws IllegalArgumentException;

    /**
     * この{@code Layer}に開始フレームと長さを指定して{@link net.spicesoftware.api.item.Item}を追加します。
     *
     * @param item          追加するアイテム
     * @param frameStart    アイテムの開始フレーム
     * @param frameDuration アイテムの長さ
     * @return 追加されたアイテムのインデックス番号
     */
    @Min(value = 0)
    int addItemDuration(Item item, @Min(value = 0) int frameStart, @Min(value = 0) int frameDuration);

    /**
     * この{@code Layer}の指定されたインデックス番号の{@link net.spicesoftware.api.item.Item}を削除します。
     *
     * @param index インデックス番号
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    void removeItemByIndex(@Min(value = 0) int index) throws IndexOutOfBoundsException;

}
