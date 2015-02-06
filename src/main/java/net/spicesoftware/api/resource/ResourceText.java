package net.spicesoftware.api.resource;

import net.spicesoftware.api.decoration.TextStyle;
import net.spicesoftware.api.item.ItemText;

/**
 * @since 2015/01/26
 */
public interface ResourceText extends Resource {

    /**
     * この{@code ResourceText}のデコレーションを返します。
     *
     * @return このテキストリソースのデコレーション
     */
    TextStyle getTextDecoration();

    @Override
    ItemText createNewItem();

    @Override
    ResourceText copyDeeply();
}
