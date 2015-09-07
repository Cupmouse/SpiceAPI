package net.spicesoftware.api.image.rgb;

import net.spicesoftware.api.image.CachedImage;

/**
 * 内容を変更できない読み取り専用のRGBイメージです。
 *
 * @since 2015/01/17
 */
public interface CachedRGB24Image extends RGB24Image, CachedImage {

    @Override
    CachedRGB24Image copyDeeply();
}
