package net.spicesoftware.api.image.blender.property.builder;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.image.blender.property.IBPropertyDither;

/**
 * ランダムシードを設定しないとビルドできません。
 *
 * @since 2015/11/14
 */
public interface IBPropertyDitherBuilder extends ParameterEssentialBuilder<IBPropertyDither> {

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
