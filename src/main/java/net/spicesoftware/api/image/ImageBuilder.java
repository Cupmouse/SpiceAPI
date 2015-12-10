package net.spicesoftware.api.image;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Min;

/**
 * @since 2015/11/14
 */
public interface ImageBuilder<T extends Image> extends ParameterEssentialBuilder<T> {

    /**
     * 作成する{@link Image}のサイズを幅と高さの{@code int}で設定します。
     *
     * @param width  幅
     * @param height 高さ
     * @throws IllegalArgumentException 指定されたサイズが負の値の場合
     */
    ImageBuilder<T> size(@Min(0) int width, @Min(0) int height) throws IllegalArgumentException;

    /**
     * 作成する{@link Image}のサイズの{@link Vector2i}で設定します。
     *
     * @param size 作成する{@link Image}のサイズの{@link Vector2i}
     * @throws IllegalArgumentException 指定されたサイズが負の値の場合
     */
    ImageBuilder<T> size(Vector2i size) throws IllegalArgumentException;
}