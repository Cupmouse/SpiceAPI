package net.spicesoftware.api.image.blender.property;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.SpiceStatic;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/09/07
 */
public interface IBPropertyDither extends ImageBlenderProperty {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    /**
     * 新しい{@link IBPropertyDither}のインスタンスを指定の透明度とシードで作成し、返します。
     *
     * @param propertyOpacity 透明度{@link IBPropertyOpacity}
     * @param seed            シード値
     * @return 新しい{@link IBPropertyDither}のインスタンス
     */
    static IBPropertyDither dither(IBPropertyOpacity propertyOpacity, int seed) throws NullPointerException {
        return builder().opacity(propertyOpacity).seed(seed).build();
    }

    /**
     * 新しい{@link IBPropertyDither}のインスタンスを指定の透明度とシードで作成し、返します。
     *
     * @param opacity 透明度 0~1000
     * @param seed    シード値
     * @return 新しい{@link IBPropertyDither}のインスタンス
     */
    static IBPropertyDither dither(@Min(0) @Max(1000) int opacity, int seed) throws NullPointerException {
        return builder().opacity(IBPropertyOpacity.opacity(opacity)).seed(seed).build();
    }

    /**
     * ディザの透明度の{@link IBPropertyOpacity}を返します。
     *
     * @return ディザの透明度の{@link IBPropertyOpacity}
     */
    IBPropertyOpacity getOpacityProperty();

    /**
     * ディザのランダムシードを返します。
     *
     * @return ディザのランダムシード
     */
    int getSeed();

    /**
     * ランダムシードを設定しないとビルドできません。
     *
     * @since 2015/11/14
     */
    interface Builder extends ParameterEssentialBuilder<IBPropertyDither> {

        /**
         * ディザのランダムシードを設定します。
         *
         * @param seed ディザのランダムシード
         */
        Builder seed(int seed);

        /**
         * ディザの透明度を{@link IBPropertyOpacity}で設定します。
         *
         * @return ディザの透明度の{@link IBPropertyOpacity}
         */
        Builder opacity(IBPropertyOpacity opacity) throws NullPointerException;

        /**
         * ディザのランダムシードをランダム値に設定します。
         */
        Builder randomSeed();
    }
}
