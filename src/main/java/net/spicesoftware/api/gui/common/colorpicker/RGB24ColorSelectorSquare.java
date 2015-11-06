package net.spicesoftware.api.gui.common.colorpicker;

/**
 * @since 2015/07/07
 */
public interface RGB24ColorSelectorSquare extends RGB24ColorSelector {

    /**
     * このスクエアセレクタでロックされている要素を返します。<br>
     * <br>
     * 例えば、一次元の選択がHue(色相)でロックされている場合、<br>
     * {@link LockedElement#H}を返し、<br>
     * 一次元の選択がSaturation(彩度)でロックされている場合、<br>
     * {@link LockedElement#S}を返します。
     *
     * @return このスクエアセレクタでロックされている要素
     */
    LockedElement getLockedElement();

    /**
     * このスクエアセレクタでロックする要素を設定します。<br>
     * <br>
     * 例えば、{@link LockedElement#H}でロックする場合、<br>
     * 一次元の選択がHue(色相)になります。<br>
     * {@link LockedElement#S}でロックする場合、<br>
     * 一次元の選択がSaturation(彩度)になります。
     *
     * @param element このスクエアセレクタでロックする要素
     */
    void setLockedElement(LockedElement element);

    /**
     * このスクエアセレクタでロックする要素の列挙です。
     *
     * @see #setLockedElement(LockedElement)
     */
    enum LockedElement {
        H, S, V, R, G, B
    }
}
