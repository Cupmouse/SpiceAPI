package net.spicesoftware.api;

import net.spicesoftware.api.color.Color;
import net.spicesoftware.api.color.palette.Palette;
import net.spicesoftware.api.layer.Layerable;

import java.util.Optional;

/**
 * @since 2015/01/17
 */
public interface Box extends Layerable {

    /**
     * この{@code Box}の{@link net.spicesoftware.api.color.palette.Palette}を返します。
     *
     * @return このボックスの色の表現
     */
    Palette getPalette();

    /**
     * この{@code Box}の背景を返します。
     *
     * @return このボックスの背景色、透明の場合はnull
     */
    Optional<Color> getBackgroundColor();
}
