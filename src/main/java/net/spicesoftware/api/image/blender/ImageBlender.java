package net.spicesoftware.api.image.blender;

import net.spicesoftware.api.image.Image;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * 複数イメージを新しい１つのイメージに合成します。
 *
 * @since 2015/02/01
 */
public interface ImageBlender<T extends Image> {

    /**
     * 前面と背面の{@link net.spicesoftware.api.image.Image}を指定して合成します。
     *
     * @param images 合成する画像、
     * @return 合成した画像
     */
    T blend(@Size(min = 2) T... images);
}
