package net.spicesoftware.api.image.blender.property;

/**
 * @since 2015/09/07
 */
public interface IBPropertyDither extends ImageBlenderProperty {

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
}
