package net.spicesoftware.api.image.blender.property;

/**
 * @since 2015/09/07
 */
public interface IBPropertyDither extends IBPropertyOpacity {

    /**
     * ディザのランダムシードを返します。
     *
     * @return ディザのランダムシード
     */
    int getSeed();
}
