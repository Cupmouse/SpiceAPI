package net.spicesoftware.api.image.gs;

import net.spicesoftware.api.decoration.fill.ColorType;
import net.spicesoftware.api.decoration.fill.GrayScale8Color;
import net.spicesoftware.api.image.Image;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * グレースケールのイメージです。
 *
 * @since 2015/01/17
 */
public interface GrayScale8Image extends Image {

    /**
     * この{@code GrayScale8Image}の指定されたx, yの位置にある色の{@link GrayScale8Color}を返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このGrayScaleImageの指定されたx, yの位置にある色
     */
    GrayScale8Color getColorAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code GrayScale8Image}の指定された{@link Vector2i}の位置にある色の{@link GrayScale8Color}を返します。
     *
     * @param position 取得する色の位置
     * @return このGrayScaleImageの指定された位置にある色
     */
    GrayScale8Color getColorAt(Vector2i position);

    /**
     * この{@code GrayScale8Image}の指定されたx, yの位置にある色を0～0xFFで{@code int}で返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このGrayScaleImageの指定されたx, yの位置にある色
     */
    @Min(0)
    @Max(0xFF)
    int getColorIntAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code GrayScale8Image}の指定された{@link Vector2i}の位置にある色を0～0xFFで{@code int}で返します。
     *
     * @param position 取得する色の位置
     * @return このGrayScaleImageの指定された位置にある色
     */
    @Min(0)
    @Max(0xFF)
    int getColorIntAt(Vector2i position);

    /**
     * この{@code GrayScale8Image}の指定されたx, yの位置にある色を符号なし整数（-128～127）の{@code byte}で返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このGrayScaleImageの指定されたx, yの位置にある色
     */
    @Min(-128)
    @Max(127)
    int getColorByteAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code GrayScale8Image}の指定された{@link Vector2i}の位置にある色を符号なし整数（-128～127）の{@code byte}で返します。
     *
     * @param position 取得する色の位置
     * @return このGrayScaleImageの指定された位置にある色
     */
    @Min(-128)
    @Max(127)
    int getColorByteAt(Vector2i position);

    /**
     * この{@code RGB24Image}の画像データのコピーを返します。
     *
     * @return このイメージの画像データのコピー
     */
    byte[] getData();

    @Override
    GrayScale8Image copyDeeply();

    /**
     * @since 2015/11/14
     */
    interface IBuilder<T extends GrayScale8Image> extends Image.IBuilder<T> {

        /**
         * 作成する{@link EditableGrayScale8Image}の背景色を{@link GrayScale8Color}で設定します。
         *
         * @param grayScale8Color 作成する{@link EditableGrayScale8Image}の背景色
         */
        void background(GrayScale8Color grayScale8Color);

        /**
         * 作成する{@link EditableGrayScale8Image}の背景色を{@link ColorType#GRAYSCALE8}の{@code byte}で設定します。
         *
         * @param background 作成する{@link EditableGrayScale8Image}の背景色
         */
        void background(byte background);
    }
}
