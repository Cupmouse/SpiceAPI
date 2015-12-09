package net.spicesoftware.api.image.rgba;

import net.spicesoftware.api.decoration.fill.ColorType;
import net.spicesoftware.api.decoration.fill.RGBA32Color;
import net.spicesoftware.api.image.Image;
import net.spicesoftware.api.image.gs.CachedGrayScale8Image;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * RGBAのイメージです。
 *
 * @since 2015/01/17
 */
public interface RGBA32Image extends Image {

    /**
     * この{@code RGBA32Image}の指定されたx, yの位置にある色の{@link RGBA32Color}を返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このRGBAImageの指定されたx, yの位置にある色
     */
    RGBA32Color getColorAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code RGBA32Image}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にある色の{@link RGBA32Color}を返します。
     *
     * @param position 取得する色の位置
     * @return このRGBAImageの指定された位置にある色
     */
    RGBA32Color getColorAt(Vector2i position);

    /**
     * この{@code RGBA32Image}の指定されたx, yの位置にある色をRGBA32で{@code long}で返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このRGBAImageの指定されたx, yの位置にある色
     */
    @Min(0)
    @Max(0xFFFFFFFF)
    long getColorLongAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code RGBA32Image}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にある色をRGBA32で{@code long}で返します。
     *
     * @param position 取得する色の位置
     * @return このRGBAImageの指定された位置にある色
     */
    @Min(0)
    @Max(0xFFFFFFFF)
    long getColorLongAt(Vector2i position);

    /**
     * この{@code RGBA32Image}の指定されたx, yの位置にある色をRGBA32で符号なし整数の{@code int}で返します。
     *
     * @param x 取得する色のx位置
     * @param y 取得する色のy位置
     * @return このRGBAImageの指定されたx, yの位置にある色
     */
    @Min(-2147483648)
    @Max(2147483647)
    int getColorIntAt(@Min(0) int x, @Min(0) int y);

    /**
     * この{@code RGBA32Image}の指定された{@link net.spicesoftware.api.util.vector.Vector2i}の位置にある色をRGBA32で符号なし整数の{@code int}で返します。
     *
     * @param position 取得する色の位置
     * @return このRGBAImageの指定された位置にある色
     */
    @Min(-2147483648)
    @Max(2147483647)
    int getColorIntAt(Vector2i position);

    /**
     * この{@code RGB24Image}の画像データのコピーを返します。
     *
     * @return このイメージの画像データのコピー
     */
    int[] getData();

    /**
     * この{@code RGBA32Image}のRチャンネルの新しい{@link CachedGrayScale8Image}を返します。
     *
     * @return このRGBAイメージのRチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScale8Image extractChannelR();

    /**
     * この{@code RGBA32Image}のGチャンネルの新しい{@link CachedGrayScale8Image}を返します。
     *
     * @return このRGBAイメージのGチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScale8Image extractChannelG();

    /**
     * この{@code RGBA32Image}のBチャンネルの新しい{@link CachedGrayScale8Image}を返します。
     *
     * @return このRGBAイメージのBチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScale8Image extractChannelB();

    /**
     * この{@code RGBA32Image}のAチャンネルの新しい{@link CachedGrayScale8Image}を返します。
     *
     * @return このRGBAイメージのAチャンネルの新しいグレースケールイメージ
     */
    CachedGrayScale8Image extractChannelA();

    @Override
    RGBA32Image copyDeeply();

    /**
     * @since 2015/11/14
     */
    interface IBuilder<T extends RGBA32Image> extends Image.IBuilder<T> {

        /**
         * 作成する{@link RGBA32Image}の背景色を{@link RGBA32Color}で設定します。
         *
         * @param rgba32Color 作成する{@link RGBA32Image}の背景色
         */
        void background(RGBA32Color rgba32Color);

        /**
         * 作成する{@link RGBA32Image}の背景色を{@link ColorType#RGBA32}の{@code int}で設定します。
         *
         * @param rgba32 作成する{@link RGBA32Image}の背景色
         */
        void background(int rgba32);

        /**
         * 作成する{@link RGBA32Image}の背景色を{@link ColorType#RGBA32}の{@code long}で設定します。
         *
         * @param rgba32 作成する{@link RGBA32Image}の背景色
         * @throws IllegalArgumentException 指定された背景色が範囲外の場合
         */
        void background(@Min(0) @Max(0xFFFFFFFF) long rgba32) throws IllegalArgumentException;
    }
}
