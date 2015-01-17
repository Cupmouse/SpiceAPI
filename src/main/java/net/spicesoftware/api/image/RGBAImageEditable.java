package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.RGBA32Color;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/01/17
 */
public interface RGBAImageEditable extends RGBAImage {

    void setColor(@Min(0) int x, @Min(0) int y, @Min(value = 0) @Max(value = 0xFFFFFF) int color, @Min(value = 0) @Max(value = 0xFF) int transparent);

    void setColor(Vector2i vector2i, @Min(value = 0) @Max(value = 0xFFFFFF) int color, @Min(value = 0) @Max(value = 0xFF) int transparent);

    void setColor(@Min(0) int x, @Min(0) int y, @Min(value = 0) @Max(value = 0xFFFFFFFF) long color);

    void setColor(Vector2i vector2i, @Min(value = 0) @Max(value = 0xFFFFFFFF) long color);

    void setColor(@Min(0) int x, @Min(0) int y, RGBA32Color color);

    void setColor(Vector2i vector2i, RGBA32Color color);

    CachedRGBAImage finalizeImage();

    @Override
    RGBAImageEditable copyDeeply();
}
