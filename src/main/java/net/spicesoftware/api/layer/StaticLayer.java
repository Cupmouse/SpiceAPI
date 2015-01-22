package net.spicesoftware.api.layer;

import net.spicesoftware.api.item.StaticItem;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

/**
 * スタティックアイテムを持つレイヤーです。
 *
 * @since 2014/11/22
 */
public interface StaticLayer extends Serializable {

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
     * この{@code StaticLayer}の最初に指定された{@link net.spicesoftware.api.item.StaticItem}を追加します。
     *
     * @param staticItem 追加するスタティックアイテム
     * @return 追加されたスタティックアイテムのインデックス番号
     */
    @Min(0)
    int addStaticItemFirst(StaticItem staticItem);

    /**
     * この{@code StaticLayer}の最後に指定された{@link net.spicesoftware.api.item.StaticItem}を追加します。
     *
     * @param staticItem 追加するスタティックアイテム
     * @return 追加されたスタティックアイテムのインデックス番号
     */
    @Min(0)
    int addStaticItemLast(StaticItem staticItem);

    /**
     * この{@code StaticLayer}の最後に指定された{@link net.spicesoftware.api.item.StaticItem}を追加します。
     *
     * @param staticItem 追加するスタティックアイテム
     */
    @Min(0)
    void insertStaticItem(StaticItem staticItem, @Min(0) int index);

    /**
     * この{@code StaticLayer}の指定されたインデックス番号のスタティックアイテムを削除します。
     *
     * @param index このスタティックレイヤーの削除するアイテムのインデックス番号
     * @throws IndexOutOfBoundsException 指定されたインデックス番号が管理されている範囲を超えている場合
     */
    void removeStaticItem(@Min(0) int index) throws IndexOutOfBoundsException;

}
