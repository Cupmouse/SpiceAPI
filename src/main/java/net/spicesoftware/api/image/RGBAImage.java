package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.RGBA32Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * RGBAのイメージです。
 *
 * @since 2015/01/17
 */
public interface RGBAImage extends Image {

    /**
     * この{@code RGBAImage}の指定されたx, yの位置にある色の{@link net.spicesoftware.api.util.color.RGBA32Color}を返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このRGBAImageの指定されたx, yの位置にある色
     */
    RGBA32Color getColorAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code RGBAImage}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にある色の{@link net.spicesoftware.api.util.color.RGBA32Color}を返します。
     *
     * @param position 取得する色の位置
     * @return このRGBAImageの指定された位置にある色
     */
    RGBA32Color getColorAt(Vector2i position);

    /**
     * この{@code RGBAImage}の指定されたx, yの位置にある色をRGBA32で{@code long}で返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このRGBAImageの指定されたx, yの位置にある色
     */
    @Min(0)
    @Max(0xFFFFFFFF)
    long getColorLongAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code RGBAImage}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にある色をRGBA32で{@code long}で返します。
     *
     * @param position 取得する色の位置
     * @return このRGBAImageの指定された位置にある色
     */
    @Min(0)
    @Max(0xFFFFFFFF)
    long getColorLongAt(Vector2i position);

    /**
     * この{@code RGBAImage}のRチャンネルの新しい{@link net.spicesoftware.api.image.CachedGrayScaleImage}を返します。
     *
     * @return このRGBAイメージのRチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScaleImage getChannelR();

    /**
     * この{@code RGBAImage}のGチャンネルの新しい{@link net.spicesoftware.api.image.CachedGrayScaleImage}を返します。
     *
     * @return このRGBAイメージのGチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScaleImage getChannelG();

    /**
     * この{@code RGBAImage}のBチャンネルの新しい{@link net.spicesoftware.api.image.CachedGrayScaleImage}を返します。
     *
     * @return このRGBAイメージのBチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScaleImage getChannelB();

    /**
     * この{@code RGBAImage}のAチャンネルの新しい{@link net.spicesoftware.api.image.CachedGrayScaleImage}を返します。
     *
     * @return このRGBAイメージのAチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScaleImage getChannelA();

    /**
     * この{@code RGBAImage}を新しいイメージとして{@link net.spicesoftware.api.image.CachedRGBImage}に変換します。
     *
     * @return 変換された新しいイメージ
     */
    CachedRGBImage toRGBImage();

    /**
     * この{@code RGBAImage}を新しいイメージとして{@link net.spicesoftware.api.image.CachedGrayScaleImage}に変換します。
     *
     * @return 変換された新しいイメージ
     */
    CachedGrayScaleImage toGrayScaleImage();

    @Override
    RGBAImage copyDeeply();
}
