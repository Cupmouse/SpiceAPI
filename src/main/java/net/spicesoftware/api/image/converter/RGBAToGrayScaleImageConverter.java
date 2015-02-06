package net.spicesoftware.api.image.converter;

import net.spicesoftware.api.image.CachedGrayScaleImage;
import net.spicesoftware.api.image.RGBAImage;

/**
 * {@link net.spicesoftware.api.image.RGBAImage}を{@link net.spicesoftware.api.image.CachedGrayScaleImage}に変換します。
 *
 * @since 2015/02/05
 */
public interface RGBAToGrayScaleImageConverter extends ImageConverter<RGBAImage, CachedGrayScaleImage> {

    /**
     * {@link net.spicesoftware.api.image.RGBAImage}を{@link net.spicesoftware.api.image.CachedGrayScaleImage}に変換します。
     * {@link #convertLuminosity(net.spicesoftware.api.image.RGBAImage)}と同じ結果が返されます。
     *
     * @param image 変換する{@link net.spicesoftware.api.image.RGBAImage}
     * @return 変換された新しいCachedGrayScaleImage
     */
    @Override
    CachedGrayScaleImage convert(RGBAImage image);

    CachedGrayScaleImage convertLuminosity(RGBAImage image);

    CachedGrayScaleImage convertLightness(RGBAImage image);

    CachedGrayScaleImage convertAverage(RGBAImage image);
}
