package net.spicesoftware.api.image.blender.property;

import net.spicesoftware.api.SpiceStatic;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @since 2015/09/07
 */
public interface IBPropertyOpacity extends ImageBlenderProperty {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    @Min(0)
    @Max(1000)
    int getOpacity();

    /**
     * デフォルトで{@code opacity}の値は1000になります。
     *
     * @since 2015/11/14
     */
    interface Builder extends net.spicesoftware.api.Builder<IBPropertyOpacity> {

        /**
         * 透明度を0~1000で設定します。<br>
         * 0で完全な透明、1000で不透明になります。
         *
         * @param opacity 透明度
         */
        void opacity(@Min(0) @Max(1000) int opacity);
    }
}
