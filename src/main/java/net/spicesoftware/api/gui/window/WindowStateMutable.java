package net.spicesoftware.api.gui.window;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.gui.window.location.WindowLocation;
import net.spicesoftware.api.gui.window.title.WindowTitle;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * 各固有の{@link WindowSystem}で使われる{@link WindowState}です。<br>
 * 値の変更ができます。
 *
 * @since 2015/12/10
 */
public interface WindowStateMutable extends WindowState {

//    static Builder mutable() {
//        return SpiceStatic.getRegistry().createBuilder(Builder.class);
//    }
//
//    /**
//     * 指定された{@link WindowState}のステートを元に、新しい{@code Builder}を作成します。<br>
//     * 元の{@link WindowState}は変更されません。
//     *
//     * @param windowState 元になる{@link WindowState}
//     * @return 新しい{@code Builder
//     */
//    static Builder mutable(WindowState windowState) {
//        return mutable().fromState(windowState);
//    }

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

    /**
     * 指定された{@link WindowState}からコピーできるすべてのステートを、この{@code WindowStateMutable}にコピーします。<br>
     * {@link WindowState}にあるステートしかコピーされません。よって、{@link WindowState}を拡張したクラスにあるステートはコピーされません。
     *
     * @param windowState コピー元の{@link WindowState}
     */
    default void copyFrom(WindowState windowState) {
        setVisible(windowState.isVisible());
        setLocation(windowState.getLocation());
        setMaximumSize(windowState.getMaximumSize());
        setMinimumSize(windowState.getMinimumSize());
        setSize(windowState.getSize());
        setSizeFixed(windowState.isSizeFixed());
        setTitle(windowState.getTitle());
    }

    // FIXME
//    interface Builder extends WindowStateBuilder<WindowStateMutable> {
//
//        @Override
//        Builder title(WindowTitle windowTitle);
//
//        @Override
//        Builder location(WindowLocation windowLocation);
//
//        @Override
//        Builder maxSize(Vector2i maxSize);
//
//        @Override
//        Builder minSize(Vector2i minSize);
//
//        @Override
//        Builder size(Vector2i size);
//
//        @Override
//        Builder sizeFixed();
//
//        @Override
//        Builder sizeFixed(boolean sizeFixed);
//
//        @Override
//        Builder invisible();
//
//        @Override
//        Builder visibility(boolean visibility);
//
//        @Override
//        default Builder from(WindowStateMutable copy) {
//            fromState(copy);
//            return this;
//        }
//
//        default Builder fromState(WindowState copy) {
//            title(copy.getTitle().copyDeeply());
//            location(copy.getLocation());
//            maxSize(copy.getMaximumSize());
//            minSize(copy.getMinimumSize());
//            size(copy.getSize());
//            sizeFixed(copy.isSizeFixed());
//            visibility(copy.isVisible());
//            return this;
//        }
//    }
}
