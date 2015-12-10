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

    /**
     * 新しい{@link IBPropertyOpacity}のインスタンスを指定の透明度で作成し、返します。
     *
     * @param opacity 透明度 0~1000
     * @return 新しい{@link IBPropertyOpacity}のインスタンス
     */
    static IBPropertyOpacity opacity(@Min(0) @Max(1000) int opacity) throws IllegalArgumentException {
        return builder().opacity(opacity).build();
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
        Builder opacity(@Min(0) @Max(1000) int opacity) throws IllegalArgumentException;
    }
}
