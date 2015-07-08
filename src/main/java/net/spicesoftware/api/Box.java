package net.spicesoftware.api;

import net.spicesoftware.api.layer.Layerable;
import net.spicesoftware.api.util.decoration.fill.color.RGBA32Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Min;

/**
 * {@link net.spicesoftware.api.layer.Layerable}であり、レイヤーを持ちます。
 *
 * @since 2015/01/17
 */
public interface Box extends Layerable {

    /**
     * この{@code Box}のサイズの横の長さを返します。
     *
     * @return このボックスの横の長さ
     */
    @Min(1)
    int getWidth();

    /**
     * この{@code Box}のサイズの縦の長さを返します。
     *
     * @return このボックスの縦の長さ
     */
    @Min(1)
    int getHeight();

    /**
     * この{@code Box}のサイズを{@link Vector2i}で返します。
     *
     * @return このボックスのサイズ
     */
    Vector2i getSize();

    /**
     * この{@code Box}のサイズを{@link Vector2i}を指定して設定します。
     *
     * @param size このボックスに設定するサイズ
     */
    void setSize(Vector2i size);

    /**
     * この{@code Box}のサイズを幅と高さを指定して設定します。
     *
     * @param width  幅
     * @param height 高さ
     */
    void setSize(int width, int height);

    /**
     * この{@code Box}の背景を返します。
     *
     * @return このボックスの背景色
     */
    RGBA32Color getBackgroundColor();

    @Override
    Box copyDeeply();
}
