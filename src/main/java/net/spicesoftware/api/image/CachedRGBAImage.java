package net.spicesoftware.api.image;

/**
 * 内容を変更できない読み取り専用のRGBAイメージです。
 *
 * @since 2015/01/17
 */
public interface CachedRGBAImage extends RGBAImage, CachedImage {

    @Override
    CachedRGBAImage copyDeeply();
}
