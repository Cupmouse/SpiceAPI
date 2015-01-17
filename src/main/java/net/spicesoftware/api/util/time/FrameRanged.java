package net.spicesoftware.api.util.time;

import net.spicesoftware.api.util.ShallowCopyable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @since 2014/10/06
 */
public final class FrameRanged<T> implements ShallowCopyable, Serializable {

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

    /**
     * 範囲をシャローコピーします。
     * rangedはコピーされず、全く同じインスタンスが格納されます。
     *
     * @return 範囲のシャローコピー
     */
    @Override
    public FrameRanged<T> copyShallowly() {
        return new FrameRanged<>(ranged, start, end);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            FrameRanged frameRanged = (FrameRanged) obj;
            return frameRanged.start == start && frameRanged.end == end && frameRanged.ranged.equals(ranged);
        }
        return false;
    }

    @Override
    public String toString() {
        return "FrameRanged{start=" + start + ",end=" + end + ",ranged" + ranged + "}";
    }
}
