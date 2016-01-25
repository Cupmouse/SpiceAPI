package net.spicesoftware.api.gui.window;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.gui.window.location.WindowLocation;
import net.spicesoftware.api.gui.window.title.WindowTitle;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * {@link WindowSystem}に依存せず{@link Window}の状態を保持します。<br>
 * 後で編集できないイミュータブルクラスです。
 *
 * @since 2015/12/10
 */
public interface WindowStateImmutable extends WindowState {

    static Builder state() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    interface Builder extends WindowStateBuilder<WindowStateImmutable> {

        @Override
        Builder title(WindowTitle title);

        @Override
        Builder location(WindowLocation location);

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

        @Override
        default Builder from(WindowStateImmutable copy) {
            WindowStateBuilder.super.from(copy);
            return this;
        }

        @Override
        default Builder fromWindowState(WindowState copy) {
            WindowStateBuilder.super.fromWindowState(copy);
            return this;
        }
    }
}
