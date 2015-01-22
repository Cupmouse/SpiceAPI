package net.spicesoftware.api;

import net.spicesoftware.api.layer.Layerable;
import net.spicesoftware.api.util.color.RGB24Color;
import net.spicesoftware.api.util.vector.Vector3i;

import java.util.Optional;

/**
 * @since 2015/01/17
 */
public interface Box extends Layerable {

    /**
     * この{@code Box}のサイズを{@link net.spicesoftware.api.util.vector.Vector3i}で返します。
     *
     * @return このボックスのサイズ
     */
    Vector3i getSize();

    /**
     * この{@code Box}のサイズの横の長さを返します。
     *
     * @return このボックスの横の長さ
     */
    int getSizeX();

    /**
     * この{@code Box}のサイズの縦の長さを返します。
     *
     * @return このボックスの縦の長さ
     */
    int getSizeY();

    /**
     * この{@code Box}のサイズを{@link net.spicesoftware.api.util.vector.Vector3i}を指定して設定します。
     *
     * @param size このボックスに設定するサイズ
     */
    void setSize(Vector3i size);

    /**
     * この{@code Box}のサイズをx, yを指定して設定します。
     *
     * @param x 横の長さ
     * @param y 縦の長さ
     */
    void setSize(int x, int y);

    /**
     * この{@code Box}の背景を返します。
     *
     * @return このボックスの背景色、透明の場合は空のOptional
     */
    Optional<RGB24Color> getBackgroundColor();

    @Override
    Box copyDeeply();
}
