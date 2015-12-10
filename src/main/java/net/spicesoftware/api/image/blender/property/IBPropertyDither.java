package net.spicesoftware.api.image.blender.property;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.SpiceStatic;

/**
 * @since 2015/09/07
 */
public interface IBPropertyDither extends ImageBlenderProperty {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
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
        void seed(int seed);

        /**
         * ディザのランダムシードをランダム値に設定します。
         */
        void randomSeed();
    }
}
