package net.spicesoftware.api.image.blender.property.builder;

import net.spicesoftware.api.Builder;
import net.spicesoftware.api.image.blender.property.IBPropertyOpacity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * デフォルトで{@code opacity}の値は1000になります。
 *
 * @since 2015/11/14
 */
public interface IBPropertyOpacityBuilder extends Builder<IBPropertyOpacity> {

    /**
     * 透明度を0~1000で設定します。<br>
     * 0で完全な透明、1000で不透明になります。
     *
     * @param opacity 透明度
     */
    void opacity(@Min(0) @Max(1000) int opacity);
}
