package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.RGBA32Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/01/17
 */
public interface RGBAImage extends Image {

    RGBA32Color getColorAt(@Min(0) int x, @Min(0) int y);

    RGBA32Color getColorAt(Vector2i vector2i);

    @Min(0)
    @Max(0xFFFFFFFF)
    long getColorLongAt(@Min(0) int x, @Min(0) int y);

    @Min(0)
    @Max(0xFFFFFFFF)
    long getColorLongAt(Vector2i vector2i);

    @Override
    RGBAImage copyDeeply();
}
