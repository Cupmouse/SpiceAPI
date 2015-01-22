package net.spicesoftware.api.value;

import net.spicesoftware.api.util.Pair;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Map;

/**
 * @since 2014/12/13
 */
public interface KeyFramedValue<T> extends Value<T> {

    /**
     * この{@code KeyFramedValue}のフレームとキーフレームのマッピングを返します。
     *
     * @return フレームとキーフレームのマッピング
     */
    @Size(min = 1)
    Map<Integer, KeyFrame<T>> getKeyFrameMap();

    /**
     * キーフレームの総数を返します
     *
     * @return キーフレームの総数
     */
    @Min(0)
    int getNumberOfKeyFrames();

    /**
     * 指定されたフレームにあるキーフレームのインデックス番号を返します。
     *
     * @param frame フレーム
     * @return 指定されたフレームにあるキーフレームのインデックス番号
     */
    @Min(0)
    int getKeyFrameIndexByFrame(@Min(0) int frame);

    /**
     * 指定されたフレームにキーフレームを追加します。
     *
     * @param frame フレーム
     * @return 追加されたキーフレームのインデックス番号
     */
    @Min(0)
    Pair<Integer, KeyFrame<T>> addKeyFrameTo(@Min(0) int frame);

    /**
     * 指定されたインデックス番号のキーフレームを削除します。
     *
     * @param index 削除するキーフレームのインデックス番号
     */
    void removeKeyFrameAt(@Min(0) int index);

    @Override
    KeyFramedValue<T> copyDeeply();
}
