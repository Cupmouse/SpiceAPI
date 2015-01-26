package net.spicesoftware.api;

import net.spicesoftware.api.image.GrayScaleImageEditable;
import net.spicesoftware.api.image.RGBAImageEditable;
import net.spicesoftware.api.image.RGBImageEditable;
import net.spicesoftware.api.resource.ResourceShape;
import net.spicesoftware.api.resource.builder.ResourceImageBuilder;
import net.spicesoftware.api.resource.builder.ResourceShapeBuilder;
import net.spicesoftware.api.resource.builder.ResourceSoundBuilder;
import net.spicesoftware.api.resource.builder.ResourceVideoBuilder;
import net.spicesoftware.api.util.vector.Vector2i;
import net.spicesoftware.api.value.Interpolator;

/**
 * レジストリです。
 * 画像の作成、ビルダーの取得ができます。
 *
 * @since 2014/10/06
 */
public interface Registry {

    GrayScaleImageEditable newGrayScaleImage(int x, int y);

    GrayScaleImageEditable newGrayScaleImage(Vector2i vector2i);

    RGBImageEditable newRGBImage(int x, int y);

    RGBImageEditable newRGBImage(Vector2i size);

    RGBAImageEditable newRGBAImage(int x, int y);

    RGBAImageEditable newRGBAImage(Vector2i size);

    ResourceImageBuilder getResourceImageBuilder();

    ResourceShapeBuilder getResourceShapeBuilder();

    ResourceSoundBuilder getResourceSoundBuilder();

    ResourceVideoBuilder getResourceVideoBuilder();

    <A> void addIntepolatorOf(Class<A> clazz, Interpolator<A> interpolator);

    <A> Interpolator<A> getInterpolatorOf(Class<A> clazz, String id);

    <A> boolean isRegisteredIntepolator(Class<A> clazz, Interpolator<A> interpolator);
}
