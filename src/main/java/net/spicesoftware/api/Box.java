package net.spicesoftware.api;

import net.spicesoftware.api.layer.Layerable;
import net.spicesoftware.api.util.decoration.fill.color.RGBA32Color;
import net.spicesoftware.api.util.time.FrameTime;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Min;

/**
 * {@code Box}は、{@link net.spicesoftware.api.layer.Layerable}であり、レイヤーを持ちます。<br>
 * そのため{@code Box}は、{@link net.spicesoftware.api.layer.Layer}を複数持ち、
 * その中に複数の{@link net.spicesoftware.api.item.Item}がフレーム範囲を指定して保持されています。<br>
 * また、{@link net.spicesoftware.api.layer.StaticField}も持っています。<br>
 * <br>
 * {@code Box}は、タイムラインを構成するために欠かせない要素です。<br>
 * デフォルトでは、{@link Layerable}を継承するインターフェイスは{@code Box}のみです。
 * よって、アイテムを保持するタイムラインを構成する最高の要素は、{@code Box}です。
 * {@code Box}を継承しているクラスは、例えば、{@link net.spicesoftware.api.project.TimelineRoot}や{@link net.spicesoftware.api.item.ItemBox}などです。
 *
 * @since 2015/01/17
 */
public interface Box extends Layerable {

    /**
     * この{@code Box}のサイズの横の長さを返します。
     *
     * @return このボックスの横の長さ
     */
    @Min(1)
    int getWidth();

    /**
     * この{@code Box}のサイズの縦の長さを返します。
     *
     * @return このボックスの縦の長さ
     */
    @Min(1)
    int getHeight();

    /**
     * この{@code Box}のサイズを{@link Vector2i}で返します。
     *
     * @return このボックスのサイズ
     */
    Vector2i getSize();

    /**
     * この{@code Box}のサイズを{@link Vector2i}を指定して設定します。
     *
     * @param size このボックスに設定するサイズ
     */
    void setSize(Vector2i size);

    /**
     * この{@code Box}のサイズを幅と高さを指定して設定します。
     *
     * @param width  幅
     * @param height 高さ
     */
    void setSize(int width, int height);

    /**
     * この{@code Box}の長さを取得します。
     *
     * @return この{@code Box}の長さ
     */
    FrameTime getDuration();

    /**
     * この{@code Box}の長さを設定します。
     *
     * @param duration 設定するこの{@code Box}の長さ
     */
    void setDuration(FrameTime duration);

    /**
     * この{@code Box}の背景を返します。
     *
     * @return このボックスの背景色
     */
    RGBA32Color getBackgroundColor();

    @Override
    Box copyDeeply();
}
