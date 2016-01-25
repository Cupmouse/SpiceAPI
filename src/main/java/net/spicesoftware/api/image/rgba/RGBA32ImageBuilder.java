package net.spicesoftware.api.image.rgba;

import net.spicesoftware.api.decoration.fill.RGBA32Color;
import net.spicesoftware.api.image.ImageBuilder;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/11/14
 */
public interface RGBA32ImageBuilder<T extends RGBA32Image> extends ImageBuilder<T> {

    @Override
    RGBA32ImageBuilder<T> size(@Min(0) int width, @Min(0) int height) throws IllegalArgumentException;

    @Override
    RGBA32ImageBuilder<T> size(Vector2i size) throws IllegalArgumentException;

    /**
     * 作成する{@link RGBA32Image}の背景色を{@link RGBA32Color}で設定します。
     *
     * @param backgroundColor 作成する{@link RGBA32Image}の背景色
     */
    RGBA32ImageBuilder<T> background(RGBA32Color backgroundColor);

    /**
     * 作成する{@link RGBA32Image}の背景色を{@link net.spicesoftware.api.decoration.fill.ColorType#RGBA32}の{@code int}で設定します。
     *
     * @param backgroundColor 作成する{@link RGBA32Image}の背景色
     */
    RGBA32ImageBuilder<T> background(int backgroundColor);

    /**
     * 作成する{@link RGBA32Image}の背景色を{@link net.spicesoftware.api.decoration.fill.ColorType#RGBA32}の{@code long}で設定します。
     *
     * @param backgroundColor 作成する{@link RGBA32Image}の背景色
     * @throws IllegalArgumentException 指定された背景色が範囲外の場合
     */
    RGBA32ImageBuilder<T> background(@Min(0) @Max(0xFFFFFFFF) long backgroundColor) throws IllegalArgumentException;

    // TODO javadoc
    /**
     * 背景情報は更新されません。
     *
     * @param copy
     * @return
     */
    @Override
    default RGBA32ImageBuilder<T> from(T copy) {
        ImageBuilder.super.from(copy);
        return this;
    }
}