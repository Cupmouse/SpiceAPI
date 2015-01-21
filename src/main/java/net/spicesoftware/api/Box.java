package net.spicesoftware.api;

import net.spicesoftware.api.layer.Layerable;
import net.spicesoftware.api.util.color.RGB24Color;

import java.util.Optional;

/**
 * @since 2015/01/17
 */
public interface Box extends Layerable {

    /**
     * この{@code Box}の背景を返します。
     *
     * @return このボックスの背景色、透明の場合は空のOptional
     */
    Optional<RGB24Color> getBackgroundColor();

    @Override
    Box copyDeeply();
}
