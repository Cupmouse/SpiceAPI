package net.spicesoftware.api.image.blender;

import net.spicesoftware.api.image.rgba.CachedRGBAImage;
import net.spicesoftware.api.util.Pair;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/03/30
 */
public interface RGBAImageBlender extends ImageBlender<int[], CachedRGBAImage> {
}
