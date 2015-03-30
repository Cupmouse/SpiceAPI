package net.spicesoftware.api.item;

import net.spicesoftware.api.text.Text;

/**
 * @since 2015/01/26
 */
public interface ItemText extends ItemRenderable {

    /**
     * この{@code ItemText}のテキストを取得します。
     *
     * @return このテキストアイテムのテキスト
     */
    Text getText();

    /**
     * この{@code ItemText}のテキストを設定します。
     *
     * @param text このテキストアイテムに設定するテキスト
     */
    void setText(Text text);

    @Override
    ItemText copyDeeply();
}
