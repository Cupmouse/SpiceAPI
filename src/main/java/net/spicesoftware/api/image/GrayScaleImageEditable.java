package net.spicesoftware.api.image;

import net.spicesoftware.api.util.color.GrayScaleColor;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/01/17
 */
public interface GrayScaleImageEditable extends GrayScaleImage {

    void setColor(@Min(0) int x, @Min(0) int y, @Min(0) @Max(0xFF) int color);

    void setColor(Vector2i position, @Min(0) @Max(0xFF) int color);

    void setColor(@Min(0) int x, @Min(0) int y, GrayScaleColor color);

    void setColor(Vector2i position, GrayScaleColor color);

    CachedGrayScaleImage finalizeImage();

    @Override
    GrayScaleImageEditable copyDeeply();
}
