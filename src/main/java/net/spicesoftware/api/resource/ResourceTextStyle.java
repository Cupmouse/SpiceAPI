package net.spicesoftware.api.resource;

import net.spicesoftware.api.util.style.TextStyle;

/**
 * @since 2015/01/26
 */
public interface ResourceTextStyle extends Resource {

    /**
     * この{@code ResourceTextDecoration}のデコレーションを返します。
     *
     * @return このテキスト装飾リソースのデコレーション
     */
    TextStyle getTextDecoration();

    @Override
    ResourceTextStyle copyDeeply();
}
