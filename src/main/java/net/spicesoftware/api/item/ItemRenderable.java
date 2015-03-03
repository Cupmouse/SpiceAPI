package net.spicesoftware.api.item;

/**
 * @since 2015/02/05
 */
public interface ItemRenderable extends Item {

    /**
     * レンダーの更新をマークします。
     */
    void markUpdateRender();
}
