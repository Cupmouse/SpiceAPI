package net.spicesoftware.api.registry;

import net.spicesoftware.api.image.blender.property.IBPropertyDither;
import net.spicesoftware.api.image.blender.property.IBPropertyOpacity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * {@link net.spicesoftware.api.image.blender.property.ImageBlenderProperty}の{@link net.spicesoftware.api.Builder}を利用することが面倒なときに使うクラスです。
 *
 * @since 2015/11/13
 */
public interface ImageBlenderPropertyCreator {

    /**
     * 新しい{@link IBPropertyOpacity}のインスタンスを指定の透明度で作成し、返します。
     *
     * @param opacity 透明度 0~1000
     * @return 新しい{@link IBPropertyOpacity}のインスタンス
     */
    IBPropertyOpacity opacity(@Min(0) @Max(1000) int opacity);

    /**
     * 新しい{@link IBPropertyDither}のインスタンスを指定の透明度とシードで作成し、返します。
     *
     * @param opacity 透明度 0~1000
     * @param seed    シード値
     * @return 新しい{@link IBPropertyDither}のインスタンス
     */
    IBPropertyDither dither(@Min(0) @Max(1000) int opacity, int seed);
}
