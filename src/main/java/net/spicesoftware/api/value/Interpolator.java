package net.spicesoftware.api.value;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @since 2014/12/13
 */
public interface Interpolator<T> extends Serializable {

    /**
     * 指定されたフレームでの値を求めます。
     *
     * @param frameDuration フレーム間隔
     * @param valueStart    開始フレームでの値
     * @param valueEnd      終了フレームでの値
     * @param frameAt       求めるフレーム
     * @return 指定されたフレームでの値
     * @throws java.lang.IllegalArgumentException frameAtに範囲を超える値が指定された場合
     */
    T calculate(@Min(value = 0) int frameDuration, T valueStart, T valueEnd, @Min(value = 0) int frameAt) throws IllegalArgumentException;

    /**
     * 指定されたフレームでの値を求めます。
     *
     * @param frameStart 開始フレーム
     * @param frameEnd   終了フレーム
     * @param valueStart 開始フレームでの値
     * @param valueEnd   終了フレームでの値
     * @param frameAt    求めるフレーム
     *                   frameStart <= frameAt <= frameEnd
     * @return 指定されたフレームでの値
     * @throws java.lang.IllegalArgumentException frameAtに範囲を超える値が指定された場合
     */
    T calculate(@Min(value = 0) int frameStart, @Min(value = 0) int frameEnd, T valueStart, T valueEnd, @Min(value = 0) int frameAt) throws IllegalArgumentException;

}
