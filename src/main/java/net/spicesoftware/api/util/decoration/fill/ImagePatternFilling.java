package net.spicesoftware.api.util.decoration.fill;

import net.spicesoftware.api.decoration.fill.PatternFilling;
import net.spicesoftware.api.image.Image;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * 画像の繰り返しのパターンです。
 *
 * @since 2015/01/26
 */
public final class ImagePatternFilling implements PatternFilling {

    private Image image;
    private int offsetX;
    private int offsetY;

    public ImagePatternFilling(Image image, int offsetX, int offsetY) {
        this.image = image;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    public ImagePatternFilling(Image image, Vector2i offset) {
        this.image = image;
        this.offsetX = offset.x;
        this.offsetY = offset.y;
    }

    /**
     * この{@code ImagePatternFilling}のパターンの{@link Image}を返します。
     *
     * @return この画像パターンのパターンとなるイメージ
     */
    public Image getImage() {
        return image;
    }

    /**
     * 描画開始位置のズレを{@link net.spicesoftware.api.util.vector.Vector2i}で返します。
     *
     * @return 描画開始位置のズレ
     */
    public Vector2i getOffset() {
        return new Vector2i(offsetX, offsetY);
    }

    /**
     * 描画開始位置の横のズレを返します。
     *
     * @return 描画開始位置の横のズレ
     */
    public int getOffsetX() {
        return offsetX;
    }

    /**
     * 描画開始位置の縦のズレを返します。
     *
     * @return 描画開始位置の縦のズレ
     */
    public int getOffsetY() {
        return offsetY;
    }

    @Override
    public ImagePatternFilling copyDeeply() {
        return new ImagePatternFilling(image.copyDeeply(), offsetX, offsetY);
    }
}
