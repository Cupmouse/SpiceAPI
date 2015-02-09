package net.spicesoftware.api.resource;

import net.spicesoftware.api.decoration.TextStyle;
import net.spicesoftware.api.item.ItemText;

/**
 * @since 2015/01/26
 */
public interface ResourceText extends Resource<ItemText> {

    /**
     * この{@code ResourceText}のデコレーションを返します。
     *
     * @return このテキストリソースのデコレーション
     */
    TextStyle getTextDecoration();

    @Override
    ResourceText copyDeeply();
}
