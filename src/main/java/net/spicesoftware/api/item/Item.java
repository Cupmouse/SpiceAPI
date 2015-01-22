package net.spicesoftware.api.item;

/**
 * アイテムです。
 * {@link net.spicesoftware.api.layer.Layer}上に配置できます。
 * また、{@link net.spicesoftware.api.item.StaticItem}を継承しているので、
 * {@link net.spicesoftware.api.layer.StaticLayer}上にも配置できます。
 *
 * @since 2014/10/05
 */
public interface Item extends StaticItem {

    @Override
    Item copyDeeply();
}
