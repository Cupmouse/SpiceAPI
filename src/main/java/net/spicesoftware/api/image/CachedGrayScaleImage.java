package net.spicesoftware.api.image;

/**
 * 内容を変更できない読み取り専用のグレースケールイメージクラスです。
 *
 * @since 2015/01/17
 */
public interface CachedGrayScaleImage extends GrayScaleImage {

    @Override
    CachedGrayScaleImage copyDeeply();
}
