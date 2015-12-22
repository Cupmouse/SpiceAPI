package net.spicesoftware.api.gui.window;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.gui.window.location.WindowLocation;
import net.spicesoftware.api.gui.window.title.WindowTitle;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/12/10
 */
public interface WindowStateMutable extends WindowState {

    static Builder mutable() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    /**
     * {@link Window}の{@link WindowTitle}を設定します。
     *
     * @param title {@link Window}の{@link WindowTitle}
     */
    void setTitle(WindowTitle title);


    /**
     * {@link Window}の位置の{@link WindowLocation}を設定します。
     *
     * @param windowLocation {@link Window}に設定する位置の{@link Vector2i}
     */
    void setLocation(WindowLocation windowLocation);


    /**
     * {@link Window}の最大サイズの{@link Vector2i}を設定します。<br>
     * <br>
     * 設定した時点で現在のサイズ（{@link #getSize()}）がこの指定されたサイズより大きい場合、クロップされます。<br>
     * つまり、横方向のみが大きい場合、縦方向は変わらず、横方向のみ最小サイズに合うように縮小されます。
     *
     * @param maximumSize {@link Window}に設定する最大サイズの{@link Vector2i}
     */
    void setMaximumSize(Vector2i maximumSize);

    /**
     * {@link Window}の最小サイズの{@link Vector2i}を設定します。<br>
     * <br>
     * 設定した時点で現在のサイズ（{@link #getSize()}）がこの指定されたサイズより小さい場合、小さい方向のみ拡大されます。<br>
     * つまり、横方向のみが小さい場合、縦方向は変わらず、横方向のみ最小サイズに合うように拡大されます。
     *
     * @param minimumSize {@link Window}に設定する最大サイズの{@link Vector2i}
     */
    void setMinimumSize(Vector2i minimumSize);

    /**
     * {@link Window}のサイズの{@link Vector2i}を設定します。
     *
     * @param size {@link Window}に設定するサイズの{@link Vector2i}
     */
    void setSize(Vector2i size);

    /**
     * サイズを固定するかどうか{@code boolean}で設定します。<br>
     * {@code sizeFixed}を{@code true}で呼んだ場合、呼ばれた時点のサイズで固定されます。
     *
     * @param sizeFixed サイズを固定するかどうか
     */
    void setSizeFixed(boolean sizeFixed);


    /**
     * {@link Window}が見えるかどうかを設定します。
     *
     * @param visible 見えるなら{@code true}、見えないなら{@code false}
     */
    void setVisible(boolean visible);

    interface Builder extends WindowStateBuilder<WindowStateMutable> {

        @Override
        Builder title(WindowTitle windowTitle);

        @Override
        Builder location(WindowLocation windowLocation);

        @Override
        Builder maxSize(Vector2i maxSize);

        @Override
        Builder minSize(Vector2i minSize);

        @Override
        Builder size(Vector2i size);

        @Override
        Builder sizeFixed();

        @Override
        Builder sizeFixed(boolean sizeFixed);

        @Override
        Builder invisible();

        @Override
        Builder visibility(boolean visibility);
    }
}
