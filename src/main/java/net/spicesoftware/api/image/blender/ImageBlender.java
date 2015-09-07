package net.spicesoftware.api.image.blender;

import net.spicesoftware.api.image.CachedImage;
import net.spicesoftware.api.util.Pair;

import javax.validation.constraints.Size;

/**
 * 複数イメージを新しい１つのイメージに合成します。
 *
 * @since 2015/02/01
 */
public interface ImageBlender<I extends CachedImage> {

    // TODO
//    /**
//     * 複数の画像を配列のインデックスが小さい方から前面として合成します。
//     *
//     * @param images 合成する画像、配列のインデックスが小さい方から前面
//     * @return 合成した画像
//     */
//    D blendData(@Size(min = 2) Pair<D, Integer>... images);
//
//    /**
//     * 複数の画像を配列のインデックスが小さい方から前面として合成します。
//     *
//     * @param result 合成された画像を保存する配列
//     * @param images 合成する画像、配列のインデックスが小さい方から前面
//     * @return 合成した画像
//     */
//    void blendData(D result, @Size(min = 2) Pair<D, Integer>... images);

    /**
     * 複数の画像を配列のインデックスが小さい方から前面として合成します。
     *
     * @param images 合成する画像、配列のインデックスが小さい方から前面
     * @return 合成した画像
     */
    I blendImage(@Size(min = 2) Pair<I, Integer>... images);
}
