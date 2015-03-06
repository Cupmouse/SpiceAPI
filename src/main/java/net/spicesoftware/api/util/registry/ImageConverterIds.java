package net.spicesoftware.api.util.registry;

/**
 * @since 2015/02/09
 */
public final class ImageConverterIds {

    /**
     * デフォルトの変換をするコンバーターのIdです。
     */
    public static final String DEFAULT = "spice:default";

    public final static class RGBA2GS {

        /**
         * {@link net.spicesoftware.api.image.rgba.RGBAImage}から{@link net.spicesoftware.api.image.gs.GrayScaleImage}にLuminosity変換をするコンバーターのIdです。
         */
        public static final String LUMINOSITY = "spice:luminosity";

        /**
         * {@link net.spicesoftware.api.image.rgba.RGBAImage}から{@link net.spicesoftware.api.image.gs.GrayScaleImage}にLightness（光度）変換をするコンバーターのIdです。
         */
        public static final String COLORED_TO_GRAYSCALE_LIGHTNESS = "spice:lightness";

        /**
         * {@link net.spicesoftware.api.image.rgba.RGBAImage}から{@link net.spicesoftware.api.image.gs.GrayScaleImage}にAverage（平均）変換をするコンバーターのIdです。
         */
        public static final String COLORED_TO_GRAYSCALE_AVERAGE = "spice:average";
    }

    public final static class RGB2GS {

        /**
         * {@link net.spicesoftware.api.image.rgb.RGBImage}から{@link net.spicesoftware.api.image.gs.GrayScaleImage}にLuminosity変換をするコンバーターのIdです。
         */
        public static final String LUMINOSITY = "spice:luminosity";

        /**
         * {@link net.spicesoftware.api.image.rgb.RGBImage}から{@link net.spicesoftware.api.image.gs.GrayScaleImage}にLightness（光度）変換をするコンバーターのIdです。
         */
        public static final String COLORED_TO_GRAYSCALE_LIGHTNESS = "spice:lightness";

        /**
         * {@link net.spicesoftware.api.image.rgb.RGBImage}から{@link net.spicesoftware.api.image.gs.GrayScaleImage}にAverage（平均）変換をするコンバーターのIdです。
         */
        public static final String COLORED_TO_GRAYSCALE_AVERAGE = "spice:average";
    }
}
