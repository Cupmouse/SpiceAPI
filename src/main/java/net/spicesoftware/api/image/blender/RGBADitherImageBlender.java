package net.spicesoftware.api.image.blender;

import net.spicesoftware.api.util.Pair;

import javax.validation.constraints.Size;

/**
 * @since 2015/03/31
 */
public interface RGBADitherImageBlender extends RGBAImageBlender {

    void blendData(int[] result, int seed, @Size(min = 2) Pair<int[], Integer>... images);
}
