package net.spicesoftware.api.image;

import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Min;

/**
 * イメージのクラスです。
 * 画像を保持します。
 *
 * @since 2015/01/17
 */
public interface Image extends DeepCopyable {

    /**
     * この{@code Image}のサイズを{@link net.spicesoftware.api.util.vector.Vector2i}で返します。
     *
     * @return このイメージのサイズ
     */
    Vector2i getSize();

    /**
     * この{@code Image}の横の長さを返します。
     *
     * @return このイメージの横の長さを返します。
     */
    @Min(1)
    int getWidth();

    /**
     * この{@code Image}の縦の長さを返します。
     *
     * @return このイメージの縦の長さ
     */
    @Min(1)
    int getHeight();

    @Override
    Image copyDeeply();
}
