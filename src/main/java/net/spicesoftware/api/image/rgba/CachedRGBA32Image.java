package net.spicesoftware.api.image.rgba;

import net.spicesoftware.api.image.CachedImage;

/**
 * 内容を変更できない読み取り専用のRGBAイメージです。
 *
 * @since 2015/01/17
 */
public interface CachedRGBA32Image extends RGBA32Image, CachedImage {

    @Override
    CachedRGBA32Image copyDeeply();
}
