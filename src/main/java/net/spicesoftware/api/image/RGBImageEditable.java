package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.RGB24Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/01/17
 */
public interface RGBImageEditable extends RGBImage {

    void setColor(@Min(0) int x, @Min(0) int y, @Min(0) @Max(0xFFFFFF) int color);

    void setColor(Vector2i position, @Min(0) @Max(0xFFFFFF) int color);

    void setColor(@Min(0) int x, @Min(0) int y, RGB24Color color);

    void setColor(Vector2i position, RGB24Color color);

    CachedRGBImage finalizeImage();

    @Override
    RGBImageEditable copyDeeply();
}
