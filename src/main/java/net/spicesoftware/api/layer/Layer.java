package net.spicesoftware.api.layer;

import net.spicesoftware.api.image.blender.ImageBlender;
import net.spicesoftware.api.item.Item;
import net.spicesoftware.api.item.builder.ItemBuilder;
import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.NotRegisteredInRegistryException;
import net.spicesoftware.api.util.Pair;
import net.spicesoftware.api.util.time.FrameRanged;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

/**
 * {@link Layerable}の一つのレイヤーです。<br>
 * お互いにフレーム範囲が衝突しないアイテムを持ちます。
 *
 * @see net.spicesoftware.api.Box よく利用されるクラス
 * @since 2014/10/04
 */
public interface Layer extends DeepCopyable {

    /**
     * この{@code Layer}のすべての{@link Item}を返します。<br>
     * 上からフレーム範囲の開始フレーム位置が小さい順にソートされています。<br>
     * 範囲の衝突はありません。
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
     * この{@code Layer}の指定されたフレームの間のすべての{@link Item}を返します。<br>
     * アイテムのフレーム範囲の一部が含まれる場合も、指定範囲内に入っていると処理されます。
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
     * この{@code Layer}の指定されたフレーム位置を含むアイテムのインデックス、または、そのフレーム番号に一番近い両端のアイテムのインデックスを{@link Pair}で返します。<br>
     * {@link Pair}のaを左側のアイテムのインデックス番号、bを右側のアイテムのインデックス番号として返します。<br>
     * 該当するアイテムがない場合は-1が返ります。<br>
     * また、{@code null}が返ることはありません。<br>
     * <br>
     * 例えば、このような配置がレイヤーになされていたとします。<br>
     * --------[ITEM]-------[ITEM]--------<br>
     * ここで、FRAMEをメソッドのパラメータ、{@code frame}であったとして、<br>
     * FRAME---[ITEM]-------[ITEM]--------<br>
     * のような位置であったとすると、このメソッドは、{@link Pair}で、a=-1, b=0を返します。<br>
     * --------[ITEM]-FRAME-[ITEM]--------<br>
     * の場合は、a=0, b=1が返ります。<br>
     * --------[ITEM]-------[ITEM]---FRAME<br>
     * の場合は、a=1, b=-1が返ります。<br>
     * そして、指定フレーム位置があるアイテム上にある場合、<br>
     * --------[ITEM]--[IT|FRAME|EM]------<br>
     * の時は、a=1, b=1、つまり、a=bの{@link Pair}が返されます。<br>
     * <br>
     * また、返される{@link Pair}のa, bは常にa &lt;= bになります。
     *
     * @param frame 両端、または、その上のアイテムを求めるフレーム位置
     * @return 指定されたフレーム位置の両端、または、その上のアイテムのインデックス番号
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
     * @param itemBuilder 追加するアイテムの{@link ItemBuilder}
     * @param frameFrom   {@link Item}の開始フレーム
     * @param frameTo     {@link Item}の終了フレーム
     * @return 追加された{@link Item}のインデックス番号
     * @throws NullPointerException               {@code item}が{@code null}の場合
     * @throws java.lang.IllegalArgumentException {@code frameFrom}が{@code frameTo}より小さい場合、どちらかが範囲外の場合
     */
    // TODO ItemBuilderで追加をする？
    @Min(0)
    int addItem(ItemBuilder itemBuilder, @Min(0) int frameFrom, @Min(0) int frameTo) throws IllegalArgumentException;

    /**
     * この{@code Layer}に開始フレームと長さを指定して{@link Item}を追加します。
     *
     * @param itemBuilder   追加するアイテムの{@link ItemBuilder}
     * @param frameStart    {@link Item}の開始フレーム
     * @param frameDuration {@link Item}の長さ
     * @return 追加された{@link Item}のインデックス番号
     * @throws NullPointerException               {@code item}が{@code null}の場合
     * @throws java.lang.IllegalArgumentException {@code frameStart}か{@code frameDuration}のどちらかが範囲外の場合
     */
    @Min(0)
    int addItemDuration(ItemBuilder itemBuilder, @Min(0) int frameStart, @Min(0) int frameDuration) throws NullPointerException, IllegalArgumentException;

    /**
     * この{@code Layer}の指定されたインデックス番号の{@link Item}を削除します。
     *
     * @param index インデックス番号
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    void removeItemIndex(@Min(0) int index) throws IndexOutOfBoundsException;


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
     * @throws NotRegisteredInRegistryException 設定しようとしたブレンダーがレジストリに登録されていない場合
     */
    void setBlender(ImageBlender blender) throws NotRegisteredInRegistryException;

    @Override
    Layer copyDeeply();
}
