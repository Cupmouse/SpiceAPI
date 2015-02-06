package net.spicesoftware.api.image.converter;

import net.spicesoftware.api.image.CachedRGBImage;
import net.spicesoftware.api.image.RGBAImage;
import net.spicesoftware.api.util.color.RGB24Color;

/**
 * {@link net.spicesoftware.api.image.RGBAImage}を{@link net.spicesoftware.api.image.CachedRGBImage}に変換します。
 *
 * @since 2015/02/05
 */
public interface RGBAToRGBImageConverter extends ImageConverter<RGBAImage, CachedRGBImage> {

    /**
     * {@link net.spicesoftware.api.image.RGBAImage}を{@link net.spicesoftware.api.image.CachedRGBImage}に変換します。
     *
     * @param image 変換する{@link net.spicesoftware.api.image.RGBAImage}
     * @param backgroundColor 変換する際の背景色
     * @return 変換された新しいCachedRGBImage
     */
    CachedRGBImage convert(RGBAImage image, RGB24Color backgroundColor);
}
