package net.spicesoftware.api.image.blender;

import net.spicesoftware.api.image.Image;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * ２つのイメージを新しい１つのイメージに合成します。
 *
 * @since 2015/02/01
 */
public interface ImageBlender<T extends Image> {

    /**
     * 前面と背面の{@link net.spicesoftware.api.image.Image}を指定して合成します。
     *
     * @param front 前面の画像
     * @param back  背面の画像
     * @return 合成した画像
     */
    T blend(T front, T back, @Min(0) @Max(100) int frontOpacity, @Min(0) @Max(100) int backOpacity);
}
