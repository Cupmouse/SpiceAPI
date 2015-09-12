package net.spicesoftware.api.value;

import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.NotRegisteredInRegistryException;
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
     * 指定されたフレームに{@link KeyFrame}を追加します。
     * 指定されたフレーム位置にすでに{@link KeyFrame}が存在する場合は、上書きされます。
     *
     * @param frame        {@link KeyFrame}が挿入されるフレーム
     * @param interpolator 追加される{@link KeyFrame}の{@link Interpolator}
     * @param value        追加される{@link KeyFrame}の値
     * @return 追加されたキーフレームのインデックス番号と、キーフレームインスタンスのペア
     * @throws NotRegisteredInRegistryException 指定された補間法が{@link net.spicesoftware.api.registry.Registry}に登録されていない場合
     */
    Pair<Integer, ? extends KeyFrame<T>> addKeyFrameAt(@Min(0) int frame, Interpolator<T> interpolator, T value) throws NotRegisteredInRegistryException;

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
