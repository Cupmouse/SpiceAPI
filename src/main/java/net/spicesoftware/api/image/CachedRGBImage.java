package net.spicesoftware.api.image;

/**
 * 内容を変更できない読み取り専用のRGBイメージクラスです。
 *
 * @since 2015/01/17
 */
public interface CachedRGBImage extends RGBImage {

    @Override
    CachedRGBImage copyDeeply();
}
