package net.spicesoftware.api.decoration.fill;

import net.spicesoftware.api.resource.ResourceImage;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * 画像の繰り返しのパターンです。
 *
 * @since 2015/01/26
 */
public interface ImagePatternFilling extends PatternFilling {

    /**
     * この{@code ImagePattern}のパターンの{@link net.spicesoftware.api.resource.ResourceImage}を返します。
     *
     * @return この画像パターンのパターンとなる画像リソース
     */
    ResourceImage getImage();

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
}