package net.spicesoftware.api.value;

import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.NotRegisteredInterpolatorException;
import net.spicesoftware.api.util.Pair;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Map;
import java.util.Optional;

/**
 * キーフレームを持ち、キーフレームでフレームごとに値が変化する{@link Value}です。
 *
 * @since 2014/12/13
 */
public interface KeyFramedValue<T extends DeepCopyable> extends Value<T> {

    /**
     * この{@code KeyFramedValue}のフレームとキーフレームのマッピングを返します。
     *
     * @return フレームとキーフレームのマッピング
     */
    @Size(min = 1)
    Map<Integer, ? extends KeyFrame<T>> getKeyFrameMap();

    /**
     * キーフレームの総数を返します
     *
     * @return キーフレームの総数
     */
    @Min(0)
    int getNumberOfKeyFrames();

    // TODO
//    /**
//     * 指定されたフレームにあるキーフレームのインデックス番号を返します。
//     *
//     * @param frame フレーム
//     * @return 指定されたフレームにあるキーフレームのインデックス番号
//     */
//    @Min(0)
//    int getKeyFrameIndexByFrame(@Min(0) int frame);

    /**
     * 指定されたフレームにキーフレームを追加します。
     *
     * @param frame フレーム
     * @return 追加されたキーフレームのインデックス番号
     */
    Pair<Integer, ? extends KeyFrame<T>> addKeyFrameAt(@Min(0) int frame, Interpolator<T> interpolator, T value) throws NotRegisteredInterpolatorException;

    /**
     * 指定されたフレームのキーフレームを返します。
     *
     * @param frame フレーム
     * @return 指定されたフレームに存在するキーフレーム
     */
    Optional<? extends KeyFrame<T>> getKeyFrameAt(@Min(0) int frame);

    /**
     * 指定されたフレームにあるキーフレームを削除します。
     *
     * @param frame 削除するキーフレームのフレーム
     */
    void removeKeyFrameAt(@Min(0) int frame);

    @Override
    KeyFramedValue<T> copyDeeply();
}
