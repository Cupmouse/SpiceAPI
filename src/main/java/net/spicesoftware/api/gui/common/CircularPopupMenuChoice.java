package net.spicesoftware.api.gui.common;

import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * {@link CircularPopupMenu}の選択肢を保持するイミュータブルクラスです。
 *
 * @since 2015/10/17
 */
public final class CircularPopupMenuChoice {

    @ToString
    private final String label;
    @ToString
    private final Runnable runnable;
    @ToString
    private final RGB24Color color;

    private CircularPopupMenuChoice(String label, RGB24Color color, Runnable runnable) {
        nullNot(label);
        nullNot(color);
        nullNot(runnable);
        this.label = label;
        this.color = color;
        this.runnable = runnable;
    }

    /**
     * パラメータを指定して新しい{@code CircularPopupMenuChoice}の新しいインスタンスを作成します。
     *
     * @param label    {@link CircularPopupMenu}に表示されるこの選択肢の名前
     * @param color    {@link CircularPopupMenu}に表示されるこの選択肢の色
     * @param runnable 実際に選択された後に実行される{@link Runnable}
     */
    public static CircularPopupMenuChoice choice(String label, RGB24Color color, Runnable runnable) {
        return new CircularPopupMenuChoice(label, color, runnable);
    }

    /**
     * パラメータを指定して新しい{@code CircularPopupMenuChoice}の新しいインスタンスを作成します。
     * 色はデフォルトの色が使用されます。
     *
     * @param label    {@link CircularPopupMenu}に表示されるこの選択肢の名前
     * @param runnable 実際に選択された後に実行される{@link Runnable}
     */
    public static CircularPopupMenuChoice choice(String label, Runnable runnable) {
        // TODO 設定によって変更
        return new CircularPopupMenuChoice(label, new RGB24Color(0, 0, 0), runnable);
    }

    /**
     * コンストラクタで指定された、{@link CircularPopupMenu}に表示されるこの選択肢の名前を返します。
     *
     * @return {@link CircularPopupMenu}に表示されるこの選択肢の名前
     */
    public String getLabel() {
        return label;
    }

    /**
     * コンストラクタで指定された、{@link CircularPopupMenu}に表示されるこの選択肢の色を返します。
     *
     * @return {@link CircularPopupMenu}に表示されるこの選択肢の色
     */
    public RGB24Color getColor() {
        return color;
    }

    /**
     * コンストラクタで指定された、実際に選択された後に実行される{@link Runnable}
     *
     * @return 実際に選択された後に実行される{@link Runnable}
     */
    public Runnable getRunnable() {
        return runnable;
    }

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}
