package net.spicesoftware.api.project;

import net.spicesoftware.api.Box;

/**
 * @since 2015/01/17
 */
public interface TimelineRoot extends Box {

    /**
     * この{@code TimelineRoot}のプロジェクトを返します。
     *
     * @return このタイムラインのプロジェクト
     */
    Project getProject();

    @Override
    TimelineRoot copyDeeply();
}
