package net.spicesoftware.api.image;

/**
 * 内容を変更できない読み取り専用のイメージです。
 *
 * @since 2015/02/05
 */
public interface CachedImage extends Image {

    @Override
    CachedImage copyDeeply();
}
