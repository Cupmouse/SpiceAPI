package net.spicesoftware.api.resource;

import net.spicesoftware.api.item.ItemSound;

/**
 * 音のリソースです。
 *
 * @since 2014/12/06
 */
public interface ResourceSound extends ResourceFromFile<ItemSound> {

    @Override
    ResourceSound copyDeeply();
}
