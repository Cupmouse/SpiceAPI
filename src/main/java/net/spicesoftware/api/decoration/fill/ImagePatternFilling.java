package net.spicesoftware.api.decoration.fill;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.image.CachedImage;
import net.spicesoftware.api.image.Image;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * 画像の繰り返しのパターンです。
 *
 * @since 2015/01/26
 */
public interface ImagePatternFilling extends PatternFilling {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    /**
     * この{@code ImagePatternFilling}のパターンの{@link Image}を返します。
     *
     * @return この画像パターンのパターンとなるイメージ
     */
    Image getImage();

    /**
     * 描画開始位置のズレを{@link net.spicesoftware.api.util.vector.Vector2i}で返します。
     *
     * @return 描画開始位置のズレ
     */
    Vector2i getOffset();

    /**
     * 描画開始位置の横のズレを返します。
     *
     * @return 描画開始位置の横のズレ
     */
    int getOffsetX();

    /**
     * 描画開始位置の縦のズレを返します。
     *
     * @return 描画開始位置の縦のズレ
     */
    int getOffsetY();

    @Override
    ImagePatternFilling copyDeeply();

    /**
     * @since 2015/11/15
     */
    interface Builder extends net.spicesoftware.api.Builder {

        /**
         * パターンの{@link CachedImage}を設定します。
         *
         * @param image パターンの{@link CachedImage}
         * @return このインスタンス
         */
        Builder image(CachedImage image);

        /**
         * パターンの位置ずれを設定します。
         *
         * @param offsetX パターンのXオフセット
         * @param offsetX パターンのYオフセット
         * @return このインスタンス
         */
        Builder offset(int offsetX, int offsetY);

        /**
         * パターンの位置ずれを{@link Vector2i}で設定します。
         *
         * @param offset パターンのオフセット
         * @return このインスタンス
         */
        Builder offset(Vector2i offset);
    }
}
