package net.spicesoftware.api.image;

/**
 * 内容を変更できない読み取り専用のグレースケールイメージです。
 *
 * @since 2015/01/17
 */
public interface CachedGrayScaleImage extends GrayScaleImage, CachedImage {

    @Override
    CachedGrayScaleImage copyDeeply();
}
