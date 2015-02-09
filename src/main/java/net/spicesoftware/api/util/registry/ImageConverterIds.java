package net.spicesoftware.api.util.registry;

/**
 * @since 2015/02/09
 */
public final class ImageConverterIds {

    /**
     * デフォルトのコンバーターのIdです。
     * {@link net.spicesoftware.api.image.GrayScaleImage}への変換ならLuminosityコンバーターになります。
     */
    public static final String NORMAL = "spice:default";
    /**
     * 色付き画像（{@link net.spicesoftware.api.image.RGBAImage}や{@link net.spicesoftware.api.image.RGBImage}）から{@link net.spicesoftware.api.image.GrayScaleImage}にLuminosity変換をするコンバーターのIdです。
     */
    public static final String COLORED_TO_GRAYSCALE_LUMINOSITY = "spice:luminosity";
    /**
     * 色付き画像（{@link net.spicesoftware.api.image.RGBAImage}や{@link net.spicesoftware.api.image.RGBImage}）から{@link net.spicesoftware.api.image.GrayScaleImage}にLightness（光度）変換をするコンバーターのIdです。
     */
    public static final String COLORED_TO_GRAYSCALE_LIGHTNESS = "spice:lightness";
    /**
     * 色付き画像（{@link net.spicesoftware.api.image.RGBAImage}や{@link net.spicesoftware.api.image.RGBImage}）から{@link net.spicesoftware.api.image.GrayScaleImage}にAverage（平均）変換をするコンバーターのIdです。
     */
    public static final String COLORED_TO_GRAYSCALE_AVERAGE = "spice:average";
}
