package net.spicesoftware.api.util.time;

import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ShallowCopyable;
import net.spicesoftware.api.util.ToString;

import javax.validation.constraints.Min;

import static net.spicesoftware.api.util.Validate.nullNot;
import static net.spicesoftware.api.util.Validate.smaller;

/**
 * フレーム間隔とそれが適用されるオブジェクトのインスタンスを保持するクラスです。
 * イミュータブルです。
 *
 * @since 2014/10/06
 */
public final class FrameRanged<T extends DeepCopyable> implements ShallowCopyable, DeepCopyable {

    @ToString
    public final T ranged;
    @ToString
    public final int start;
    @ToString
    public final int end;

    /**
     * 範囲と範囲が適用されるインスタンス
     *
     * @param ranged 範囲が適用されるインスタンス
     * @param start  範囲の開始
     * @param end    範囲の終了
     * @throws NullPointerException     rangedにnullが指定された時
     * @throws IllegalArgumentException startがendより大きい時
     */
    public FrameRanged(T ranged, @Min(0) int start, @Min(0) int end) throws NullPointerException, IllegalArgumentException {
        nullNot(ranged);
        smaller(start, end);
        this.ranged = ranged;
        this.start = start;
        this.end = end;
    }

    /**
     * 指定された範囲同士が衝突している（範囲を共有している部分がある）かどうかを検証し、真偽値で返します。
     *
     * @param ranged1 衝突の検証をする範囲
     * @param ranged2 衝突の検証をする範囲
     * @return 指定された範囲同士が衝突している場合trueを、していない場合false
     */
    public static boolean doesCollision(FrameRanged ranged1, FrameRanged ranged2) {
        return ranged1.start < ranged2.start ? ranged1.end > ranged2.start : ranged2.end > ranged1.start;
    }

    /**
     * 新しい範囲を指定して同じインスタンスを持つ{@code FrameRanged}を作成します。
     *
     * @param start 新しい範囲の開始
     * @param end   新しい範囲の終了
     * @return 新しい範囲で同じオブジェクトのインスタンスを持つ{@code FrameRanged}
     */
    public FrameRanged<T> range(@Min(0) int start, @Min(0) int end) throws IllegalArgumentException {
        return new FrameRanged<>(ranged, start, end);
    }

    /**
     * 指定された範囲とこの範囲が衝突している（範囲を共有している部分がある）かどうかを検証し、真偽値で返します。
     *
     * @param frameRanged 衝突の検証をする範囲
     * @return 指定された範囲と衝突している場合trueを、していない場合false
     */
    public boolean isCollisionWith(FrameRanged frameRanged) {
        nullNot(frameRanged);
        return doesCollision(this, frameRanged);
    }

    /**
     * 範囲をシャローコピーします。
     * rangedはコピーされず、全く同じインスタンスが格納された新しい{@code FrameRanged}のインスタンスが返されます。
     *
     * @return 範囲のシャローコピー
     */
    @Override
    public FrameRanged<T> copyShallowly() {
        return new FrameRanged<>(ranged, start, end);
    }

    @Override
    public FrameRanged<T> copyDeeply() {
        return new FrameRanged<>((T) ranged.copyDeeply(), start, end);
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
        return ReflectionToString.rts(this);
    }
}
