package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.RGB24Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2014/12/17
 */
public interface RGBImage extends Image {

    RGB24Color getColorAt(@Min(0) int x, @Min(0) int y);

    RGB24Color getColorAt(Vector2i vector2i);

    @Min(value = 0)
    @Max(value = 0xFFFFFF)
    int getColorIntAt(@Min(0) int x, @Min(0) int y);

    @Min(value = 0)
    @Max(value = 0xFFFFFF)
    int getColorIntAt(Vector2i vector2i);

    @Override
    RGBImage copyDeeply();
}
