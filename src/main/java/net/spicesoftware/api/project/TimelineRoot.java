package net.spicesoftware.api.project;

import net.spicesoftware.api.Box;

/**
 * ルートの{@link net.spicesoftware.api.Box}です。
 *
 * @since 2015/01/17
 */
public interface TimelineRoot extends Box {

    @Override
    TimelineRoot copyDeeply();
}
