package net.spicesoftware.api.resource;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.style.TextStyle;

/**
 * @since 2015/01/26
 */
public interface ResourceTextStyle extends Resource {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    /**
     * この{@code ResourceTextDecoration}のデコレーションを返します。
     *
     * @return このテキスト装飾リソースのデコレーション
     */
    TextStyle getTextDecoration();

    @Override
    ResourceTextStyle copyDeeply();

    /**
     * @since 2015/02/10
     */
    interface Builder extends ResourceBuilder<ResourceTextStyle> {

        @Override
        Builder copyDeeply();
    }
}
