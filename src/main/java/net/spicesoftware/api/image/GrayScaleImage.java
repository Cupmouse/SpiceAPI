package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.GrayScaleColor;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/01/17
 */
public interface GrayScaleImage extends Image {

    GrayScaleColor getColorAt(@Min(0) int x, @Min(0) int y);

    GrayScaleColor getColorAt(Vector2i vector2i);

    @Min(0)
    @Max(0xFF)
    int getColorIntAt(@Min(0) int x, @Min(0) int y);

    @Min(0)
    @Max(0xFF)
    int getColorIntAt(Vector2i vector2i);

    @Override
    GrayScaleImage copyDeeply();
}
