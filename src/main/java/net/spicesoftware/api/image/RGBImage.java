package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.RGB24Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * RGBのイメージです。
 *
 * @since 2014/12/17
 */
public interface RGBImage extends Image {

    /**
     * この{@code RGBImage}の指定されたx, yの位置にある色の{@link net.spicesoftware.api.util.color.RGB24Color}を返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このRGBImageの指定されたx, yの位置にある色
     */
    RGB24Color getColorAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code RGBImage}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にある色の{@link net.spicesoftware.api.util.color.RGB24Color}を返します。
     *
     * @param position 取得する色の位置
     * @return このRGBImageの指定された位置にある色
     */
    RGB24Color getColorAt(Vector2i position);

    /**
     * この{@code RGBImage}の指定されたx, yの位置にある色をRGB24で{@code int}で返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このRGBImageの指定されたx, yの位置にある色
     */
    @Min(0)
    @Max(0xFFFFFF)
    int getColorIntAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code RGBImage}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にある色をRGB24で{@code int}で返します。
     *
     * @param position 取得する色の位置
     * @return このRGBImageの指定された位置にある色
     */
    @Min(0)
    @Max(0xFFFFFF)
    int getColorIntAt(Vector2i position);

    /**
     * この{@code RGBImage}のRチャンネルの新しい{@link net.spicesoftware.api.image.CachedGrayScaleImage}を返します。
     *
     * @return このRGBイメージのRチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScaleImage getChannelR();

    /**
     * この{@code RGBImage}のGチャンネルの新しい{@link net.spicesoftware.api.image.CachedGrayScaleImage}を返します。
     *
     * @return このRGBイメージのGチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScaleImage getChannelG();

    /**
     * この{@code RGBImage}のBチャンネルの新しい{@link net.spicesoftware.api.image.CachedGrayScaleImage}を返します。
     *
     * @return このRGBイメージのBチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScaleImage getChannelB();

    /**
     * この{@code RGBImage}を新しいイメージとして{@link net.spicesoftware.api.image.CachedRGBAImage}に変換します。
     *
     * @return 変換されたイメージ
     */
    CachedRGBAImage toRGBAImage();

    /**
     * この{@code RGBImage}を新しいイメージとして{@link net.spicesoftware.api.image.CachedGrayScaleImage}に変換します。
     *
     * @return 変換された新しいイメージ
     */
    CachedGrayScaleImage toGrayScaleImage();

    @Override
    RGBImage copyDeeply();
}
