package net.spicesoftware.api.registry;

import net.spicesoftware.api.image.*;
import net.spicesoftware.api.image.blender.ImageBlender;
import net.spicesoftware.api.image.converter.ImageConverter;
import net.spicesoftware.api.render.Renderable;
import net.spicesoftware.api.render.Renderer;
import net.spicesoftware.api.resource.builder.ResourceImageBuilder;
import net.spicesoftware.api.resource.builder.ResourceShapeBuilder;
import net.spicesoftware.api.resource.builder.ResourceSoundBuilder;
import net.spicesoftware.api.resource.builder.ResourceVideoBuilder;
import net.spicesoftware.api.util.AlreadyRegisteredException;
import net.spicesoftware.api.util.NotRegisteredImageBlenderException;
import net.spicesoftware.api.util.NotRegisteredInterpolatorException;
import net.spicesoftware.api.util.vector.Vector2i;
import net.spicesoftware.api.value.Interpolator;

import javax.validation.constraints.Size;
import java.util.Optional;

/**
 * レジストリです。
 * 画像の作成、ビルダーの取得等ができます。
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


    void addIntepolator(Interpolator interpolator) throws AlreadyRegisteredException;

    <A> Optional<Interpolator<A>> getInterpolatorOf(Class<A> clazz, @Size(min = 1) String id);

    @Size(min = 1)
    String getInterpolatorsId(Interpolator interpolator) throws NotRegisteredInterpolatorException;

    boolean isRegisteredIntepolator(Interpolator interpolator);


    void addImageBlender(ImageBlender imageBlender) throws AlreadyRegisteredException;

    ImageBlender getImageBlender(@Size(min = 1) String id);

    @Size(min = 1)
    String getImageBlendersId(ImageBlender imageBlender) throws NotRegisteredImageBlenderException;

    boolean isRegisteredImageBlender(ImageBlender imageBlender);


    void addImageConverter(ImageConverter imageConverter) throws AlreadyRegisteredException;

    <I extends Image, O extends CachedImage> Optional<ImageConverter<I, O>> getImageConverter(Class<I> inputImageClass, Class<O> outputImageClass);

    boolean isRegisteredImageConverter(ImageConverter imageConverter);


    <T extends Renderable, I extends Image> Renderer<T, I> getRendererOf(Class<T> renderableClass, Class<I> imageClass);

    void setRenderer(Renderer renderer);
}
