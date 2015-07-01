package net.spicesoftware.api.layer;

import net.spicesoftware.api.image.blender.ImageBlender;
import net.spicesoftware.api.item.Item;
import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.NotRegisteredImageBlenderException;
import net.spicesoftware.api.util.Pair;
import net.spicesoftware.api.util.time.FrameRanged;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * {@link Layerable}の一つのレイヤーです。
 * お互いに衝突しないフレーム間隔を持つアイテムを持ちます。
 *
 * @since 2014/10/04
 */
public interface Layer extends DeepCopyable, Serializable {

    /**
     * この{@code Layer}のすべての{@link Item}を返します。
     * タイムライン上で早い時間に現れる順に並んでいます
     *
     * @return このレイヤーのすべてのアイテム
     */
    List<FrameRanged<Item>> getAllItems();

    /**
     * この{@code Layer}の{@link Item}の総数を返します。
     *
     * @return このレイヤーのアイテムの総数
     */
    @Min(0)
    int getNumberOfItems();

    /**
     * この{@code Layer}の指定されたフレームの間のすべての{@link Item}を返します。
     * フレーム間に含まれるアイテムはすべてが対象になります。
     *
     * @param frameFrom 開始フレーム
     * @param frameTo   終了フレーム
     * @return このレイヤーの指定されたフレームの間のすべてのアイテム
     */
    List<FrameRanged<Item>> getItemInFrameRange(@Min(0) int frameFrom, @Min(0) int frameTo);

    /**
     * この{@code Layer}の指定されたインデックス番号の間のすべての{@link Item}を返します。
     *
     * @param indexFrom 開始インデックス番号
     * @param indexTo   終了インデックス番号
     * @return このレイヤーの指定されたインデックス番号の間のすべてのアイテム
     * @throws IndexOutOfBoundsException 指定されたインデックス番号のどちらかが管理されている範囲を超えている場合
     */
    List<FrameRanged<Item>> getItemInIndexRange(@Min(0) int indexFrom, @Min(0) int indexTo) throws IndexOutOfBoundsException;

    /**
     * この{@code Layer}の指定されたフレームよりも終了フレームが小さい、開始フレームが大きい、一番近い{@link Item}のインデックス番号を返します。
     * 当てはまるアイテムが有る場合はどちらも同じインデックス番号が返されます。
     *
     * @param frame フレーム
     * @return このレイヤーの指定されたフレームよりも終了フレームが小さい、開始フレームが大きい、一番近いアイテムのインデックス番号、当てはまるアイテムがない場合-1、もしくは、あるアイテム内に指定フレームが存在する場合、同じインデックス番号
     */
    Pair<Integer, Integer> getItemNearestIndexFrameAt(@Min(0) int frame);

    /**
     * この{@code Layer}の指定されたフレームを含む{@link Item}のインデックス番号を返します。
     *
     * @param frame フレーム
     * @return このレイヤーの指定されたフレームを含むアイテムのインデックス番号、アイテムがない場合-1
     */
    int getItemIndexFrameAt(@Min(0) int frame);

    /**
     * この{@code Layer}の指定されたフレームの{@link Item}を返します。
     *
     * @param frame フレーム
     * @return このレイヤーの指定されたフレームのアイテム
     */
    Optional<FrameRanged<Item>> getItemFrameAt(@Min(0) int frame);

    /**
     * この{@code Layer}の指定されたインデックス番号の{@link Item}を返します。
     *
     * @param index インデックス番号
     * @return このレイヤーの指定されたインデックス番号のアイテム
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    FrameRanged<Item> getItemIndexAt(@Min(0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code Layer}に開始フレームと終了フレームを指定して{@link Item}を追加します。
     *
     * @param item      追加するアイテム
     * @param frameFrom アイテムの開始フレーム
     * @param frameTo   アイテムの終了フレーム
     * @return 追加されたアイテムのインデックス番号
     * @throws java.lang.IllegalArgumentException 開始フレームが終了フレームより小さい場合
     */
    @Min(0)
    int addItem(Item item, @Min(0) int frameFrom, @Min(0) int frameTo) throws IllegalArgumentException;

    /**
     * この{@code Layer}に開始フレームと長さを指定して{@link Item}を追加します。
     *
     * @param item          追加するアイテム
     * @param frameStart    アイテムの開始フレーム
     * @param frameDuration アイテムの長さ
     * @return 追加されたアイテムのインデックス番号
     */
    @Min(0)
    int addItemDuration(Item item, @Min(0) int frameStart, @Min(0) int frameDuration);

    /**
     * この{@code Layer}の指定されたインデックス番号の{@link Item}を削除します。
     *
     * @param index インデックス番号
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    void removeItemByIndex(@Min(0) int index) throws IndexOutOfBoundsException;


    // TODO ブレンダーについてもっと考える必要がある

    /**
     * この{@code Layer}の{@link ImageBlender}を返します。
     *
     * @return このレイヤーのブレンダー
     */
    ImageBlender getBlender();

    /**
     * この{@code Layer}の{@link ImageBlender}を設定します。
     *
     * @param blender 設定するブレンダー
     * @throws NotRegisteredImageBlenderException 設定しようとしたブレンダーがレジストリに登録されていない場合
     */
    void setBlender(ImageBlender blender) throws NotRegisteredImageBlenderException;

    @Override
    Layer copyDeeply();
}
