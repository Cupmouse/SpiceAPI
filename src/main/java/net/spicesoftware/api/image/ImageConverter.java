package net.spicesoftware.api.image;

/**
 * {@link Image}を他の{@code Image}に変換します。
 *
 * @since 2015/02/02
 */
public interface ImageConverter<I extends Image, O extends CachedImage> {

    /**
     * {@link Image}を他の{@link CachedImage}に変換します。
     *
     * @param image 変換するイメージ
     * @return 変換された新しい不変イメージ
     */
    O convert(I image);
}
