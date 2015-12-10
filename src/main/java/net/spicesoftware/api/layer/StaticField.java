package net.spicesoftware.api.layer;

import net.spicesoftware.api.item.StaticItem;
import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.value.HasValues;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * スタティックに値を持つクラスです。
 *
 * @since 2014/11/22
 */
public interface StaticField extends HasValues, DeepCopyable {

    /**
     * この{@code StaticLayer}のすべてのスタティックアイテムを返します。
     *
     * @return このスタティックレイヤーのすべてのスタティックアイテム
     */
    List<StaticItem> getAllStaticItems();

    /**
     * この{@code StaticLayer}のスタティックレイヤーの数を返します。
     *
     * @return このスタティックレイヤーのスタティックレイヤーの数
     */
    @Min(0)
    int getNumberOfStaticItems();

    /**
     * この{@code StaticLayer}の指定されたインデックス番号のスタティックアイテムを返します。
     *
     * @param index インデックス番号
     * @return このスタティックレイヤーの指定されたインデックス番号のスタティックアイテム
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    StaticItem getStaticItem(@Min(0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code StaticLayer}の最初に指定された{@link StaticItem}を追加します。
     *
     * @param staticItem 追加するスタティックアイテム
     */
    @Min(0)
    void addStaticItemFirst(StaticItem staticItem);

    /**
     * この{@code StaticLayer}の最後に指定された{@link StaticItem}を追加します。
     *
     * @param staticItem 追加するスタティックアイテム
     * @return 追加されたスタティックアイテムのインデックス番号
     */
    @Min(0)
    int addStaticItemLast(StaticItem staticItem);

    /**
     * この{@code StaticLayer}の最後に指定された{@link StaticItem}を追加します。
     *
     * @param staticItem 追加するスタティックアイテム
     * @param index      スタティックアイテムを追加するインデックス番号
     */
    @Min(0)
    void insertStaticItem(StaticItem staticItem, @Min(0) int index) throws IndexOutOfBoundsException;

    /**
     * この{@code StaticLayer}の最初のスタティックアイテムを削除します。
     */
    void removeFirstStaticItem() throws NoSuchElementException;

    /**
     * この{@code StaticLayer}の最後のスタティックアイテムを削除します。
     */
    void removeLastStaticItem() throws NoSuchElementException;

    /**
     * この{@code StaticLayer}の指定されたインデックス番号のスタティックアイテムを削除します。
     *
     * @param index このスタティックレイヤーの削除するアイテムのインデックス番号
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    void removeStaticItem(@Min(0) int index) throws IndexOutOfBoundsException;

    @Override
    StaticField copyDeeply();
}
