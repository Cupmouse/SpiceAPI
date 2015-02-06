package net.spicesoftware.api.image;

/**
 * 内容を変更できない読み取り専用のRGBイメージです。
 *
 * @since 2015/01/17
 */
public interface CachedRGBImage extends RGBImage, CachedImage {

    @Override
    CachedRGBImage copyDeeply();
}
