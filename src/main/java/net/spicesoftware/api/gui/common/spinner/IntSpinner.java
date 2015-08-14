package net.spicesoftware.api.gui.common.spinner;

/**
 * {@link Integer}の値を持つ{@link Spinner}です。
 *
 * @since 2015/07/04
 */
public interface IntSpinner extends Spinner<Integer> {

    /**
     * 細かい値の操作をするときのモディファイア(倍率)を{@code float}で返します。
     *
     * @return 細かい値の操作をするときの倍率
     * @see #setSmallModifier(float) モディファイアの設定
     */
    float getSmallModifier();

    /**
     * 細かい値の操作をするときのモディファイア(倍率)を{@code float}で設定します。
     * 例えば、マウスの移動した距離に掛け合わされ、マウス移動による値の変位が変化し、値を細かく調整できるようになります。
     * このモディファイアは通常の値の操作/大きい値の操作のモディファイアよりも大きくすることができます。
     *
     * @param smallModifier 細かい値の操作をするときの{@code float}型の倍率
     */
    void setSmallModifier(float smallModifier);

    /**
     * 通常の値の操作をするときのモディファイア(倍率)を{@code float}で返します。
     *
     * @return 通常の値の操作をするときの倍率
     * @see #setDefaultModifier(float) モディファイアの設定
     */
    float getDefaultModifier();

    /**
     * 通常の値の操作をするときのモディファイア(倍率)を{@code float}で設定します。
     * 例えば、マウスの移動した距離に掛け合わされ、マウス移動による値の変位が変化します。
     * このモディファイアは細かい値の操作よりも小さく、もしくは、大きい値の操作のモディファイアよりも大きくすることができます。
     *
     * @param defaultModifier 通常の値の操作をするときの{@code float}型の倍率
     */
    void setDefaultModifier(float defaultModifier);

    /**
     * 大きい値の操作をするときのモディファイア(倍率)を{@code float}で返します。
     *
     * @return 大きい値の操作をするときの倍率
     * @see #setBigModifier(float) モディファイアの設定
     */
    float getBigModifier();

    /**
     * 大きい値の操作をするときのモディファイア(倍率)を{@code float}で設定します。
     * 例えば、マウスの移動した距離に掛け合わされ、マウス移動による値の変位が変化し、値を大きく調整できるようになります。
     * このモディファイアは細かい値の操作/通常の値の操よりも小さくすることができます。
     *
     * @param bigModifier 大きい値の操作をするときの{@code float}型の倍率
     */
    void setBigModifier(float bigModifier);
}
