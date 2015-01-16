package net.spicesoftware.api.util.time;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @since 2014/10/06
 */
public class FrameRanged<T> {

    public final T ranged;
    public final int start;
    public final int end;

    public FrameRanged(@NotNull T ranged, @Min(value = 0) int start, @Min(value = 0) int end) throws IllegalArgumentException {
        if (start > end)
            throw new IllegalArgumentException("start > end");
        this.ranged = ranged;
        this.start = start;
        this.end = end;
    }

    public static boolean doesCollision(FrameRanged ranged1, FrameRanged ranged2) {
        return ranged1.start < ranged2.start ? ranged1.end > ranged2.start : ranged2.end > ranged1.start;
    }

    public boolean isCollisionWith(FrameRanged another) {
        return doesCollision(this, another);
    }

}
