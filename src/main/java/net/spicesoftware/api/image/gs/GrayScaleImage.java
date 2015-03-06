package net.spicesoftware.api.image.gs;

import net.spicesoftware.api.image.Image;
import net.spicesoftware.api.image.rgb.CachedRGBImage;
import net.spicesoftware.api.image.rgba.CachedRGBAImage;
import net.spicesoftware.api.util.color.GrayScaleColor;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * グレースケールのイメージです。
 *
 * @since 2015/01/17
 */
public interface GrayScaleImage extends Image {

    /**
     * この{@code GrayScaleImage}の指定されたx, yの位置にある色の{@link net.spicesoftware.api.util.color.GrayScaleColor}を返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このGrayScaleImageの指定されたx, yの位置にある色
     */
    GrayScaleColor getColorAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code GrayScaleImage}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にある色の{@link net.spicesoftware.api.util.color.GrayScaleColor}を返します。
     *
     * @param position 取得する色の位置
     * @return このGrayScaleImageの指定された位置にある色
     */
    GrayScaleColor getColorAt(Vector2i position);

    /**
     * この{@code GrayScaleImage}の指定されたx, yの位置にある色を0～0xFFで{@code int}で返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このGrayScaleImageの指定されたx, yの位置にある色
     */
    @Min(0)
    @Max(0xFF)
    int getColorIntAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code GrayScaleImage}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にある色を0～0xFFで{@code int}で返します。
     *
     * @param position 取得する色の位置
     * @return このGrayScaleImageの指定された位置にある色
     */
    @Min(0)
    @Max(0xFF)
    int getColorIntAt(Vector2i position);

    /**
     * この{@code GrayScaleImage}を新しいイメージとして{@link net.spicesoftware.api.image.rgb.CachedRGBImage}に変換します。
     *
     * @return 変換されたイメージ
     */
    CachedRGBImage toRGBImage();

    /**
     * この{@code GrayScaleImage}を新しいイメージとして{@link net.spicesoftware.api.image.rgba.CachedRGBAImage}に変換します。
     *
     * @return 変換されたイメージ
     */
    CachedRGBAImage toRGBAImage();

    @Override
    GrayScaleImage copyDeeply();
}
