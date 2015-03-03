package net.spicesoftware.api.item;

import net.spicesoftware.api.resource.ResourceVideo;

/**
 * 映像のアイテムです。
 *
 * @since 2014/12/06
 */
public interface ItemVideo extends ItemRenderable {

    ResourceVideo getResourceVideo();

    @Override
    ItemVideo copyDeeply();
}
