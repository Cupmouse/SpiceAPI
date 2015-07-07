package net.spicesoftware.api.gui.common.colorpicker;

/**
 * @since 2015/07/07
 */
public interface DialogColorSelector {

    // TODO 選択モードクラスを作ってレジスタ登録しないとそのクラスを取得できないようにする
    RGB24ColorSelector getSelector();

//    void setSelector(String selectorName);
}
