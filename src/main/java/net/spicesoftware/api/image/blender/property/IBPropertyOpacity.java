package net.spicesoftware.api.image.blender.property;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/09/07
 */
public interface IBPropertyOpacity extends ImageBlenderProperty {

    @Min(0) @Max(0xFF) int getOpacity();
}
