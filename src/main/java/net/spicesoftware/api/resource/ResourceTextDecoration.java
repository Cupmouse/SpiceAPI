package net.spicesoftware.api.resource;

import net.spicesoftware.api.decoration.TextStyle;
import net.spicesoftware.api.item.ItemText;
import net.spicesoftware.api.item.builder.ItemBuilder;

/**
 * @since 2015/01/26
 */
public interface ResourceTextDecoration extends Resource {

    /**
     * この{@code ResourceTextDecoration}のデコレーションを返します。
     *
     * @return このテキスト装飾リソースのデコレーション
     */
    TextStyle getTextDecoration();

    @Override
    ResourceTextDecoration copyDeeply();
}
