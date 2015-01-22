package net.spicesoftware.api.image;

/**
 * 内容を変更できない読み取り専用のRGBAイメージクラスです。
 *
 * @since 2015/01/17
 */
public interface CachedRGBAImage extends RGBAImage {

    @Override
    CachedRGBAImage copyDeeply();
}
