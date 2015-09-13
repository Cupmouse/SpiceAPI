package net.spicesoftware.api.image.blender.property.builder;

import net.spicesoftware.api.image.blender.property.ImageBlenderProperty;

/**
 * @since 2015/09/13
 */
public interface ImageBlenderPropertyBuilder<T extends ImageBlenderProperty> {

    /**
     * この{@code ImageBlenderPropertyBuilder}をビルドし、新しい{@link ImageBlenderProperty}のインスタンスを返します。
     *
     * @return ビルドされた新しい{@link ImageBlenderProperty}のインスタンス
     */
    T build();
}
