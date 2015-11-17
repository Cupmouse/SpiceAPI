package net.spicesoftware.api.image.rgb;

import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.image.Image;
import net.spicesoftware.api.image.gs.CachedGrayScale8Image;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * RGBのイメージです。
 *
 * @since 2014/12/17
 */
public interface RGB24Image extends Image {

    /**
     * この{@code RGB24Image}の指定されたx, yの位置にある色の{@link RGB24Color}を返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このRGBImageの指定されたx, yの位置にある色
     */
    RGB24Color getColorAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code RGB24Image}の指定された{@link Vector2i}の位置にある色の{@link RGB24Color}を返します。
     *
     * @param position 取得する色の位置
     * @return このRGBImageの指定された位置にある色
     */
    RGB24Color getColorAt(Vector2i position);

    /**
     * この{@code RGB24Image}の指定されたx, yの位置にある色をRGB24で{@code int}で返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このRGBImageの指定されたx, yの位置にある色
     */
    @Min(0)
    @Max(0xFFFFFF)
    int getColorIntAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code RGB24Image}の指定された{@link Vector2i}の位置にある色をRGB24で{@code int}で返します。
     *
     * @param position 取得する色の位置
     * @return このRGBImageの指定された位置にある色
     */
    @Min(0)
    @Max(0xFFFFFF)
    int getColorIntAt(Vector2i position);

    /**
     * この{@code RGB24Image}の画像データのコピーを返します。
     *
     * @return このイメージの画像データのコピー
     */
    @Size(min = 1)
    int[] getData();

    /**
     * この{@code RGB24Image}のRチャンネルの新しい{@link CachedGrayScale8Image}を返します。
     *
     * @return このRGBイメージのRチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScale8Image extractChannelR();

    /**
     * この{@code RGB24Image}のGチャンネルの新しい{@link CachedGrayScale8Image}を返します。
     *
     * @return このRGBイメージのGチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScale8Image extractChannelG();

    /**
     * この{@code RGB24Image}のBチャンネルの新しい{@link CachedGrayScale8Image}を返します。
     *
     * @return このRGBイメージのBチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScale8Image extractChannelB();

    @Override
    RGB24Image copyDeeply();
}
