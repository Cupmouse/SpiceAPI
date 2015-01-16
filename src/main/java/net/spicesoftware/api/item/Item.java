package net.spicesoftware.api.item;

/**
 * @since 2014/10/05
 */
public interface Item extends StaticItem {

    @Override
    Item copyDeeply();
}
