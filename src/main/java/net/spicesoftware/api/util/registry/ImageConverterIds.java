package net.spicesoftware.api.util.registry;

import net.spicesoftware.api.image.gs.GrayScale8Image;
import net.spicesoftware.api.image.rgb.RGB24Image;
import net.spicesoftware.api.image.rgba.RGBA32Image;

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
         * {@link RGBA32Image}から{@link GrayScale8Image}にLuminosity変換をするコンバーターのIdです。
         */
        public static final String LUMINOSITY = "spice:luminosity";

        /**
         * {@link RGBA32Image}から{@link GrayScale8Image}にLightness（光度）変換をするコンバーターのIdです。
         */
        public static final String COLORED_TO_GRAYSCALE_LIGHTNESS = "spice:lightness";

        /**
         * {@link RGBA32Image}から{@link GrayScale8Image}にAverage（平均）変換をするコンバーターのIdです。
         */
        public static final String COLORED_TO_GRAYSCALE_AVERAGE = "spice:average";
    }

    public final static class RGB2GS {

        /**
         * {@link RGB24Image}から{@link GrayScale8Image}にLuminosity変換をするコンバーターのIdです。
         */
        public static final String LUMINOSITY = "spice:luminosity";

        /**
         * {@link RGB24Image}から{@link GrayScale8Image}にLightness（光度）変換をするコンバーターのIdです。
         */
        public static final String COLORED_TO_GRAYSCALE_LIGHTNESS = "spice:lightness";

        /**
         * {@link RGB24Image}から{@link GrayScale8Image}にAverage（平均）変換をするコンバーターのIdです。
         */
        public static final String COLORED_TO_GRAYSCALE_AVERAGE = "spice:average";
    }
}
