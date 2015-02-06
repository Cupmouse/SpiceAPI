package net.spicesoftware.api.image;

/**
 * @since 2015/02/02
 */
public interface ImageEditable extends Image {

    /**
     * 現在のこの{@code ImageEditable}の内容をコピーした{@link net.spicesoftware.api.image.Image}を返します。
     * この関数を実行した後でも編集は継続できますが、以降の変更は{@code ImageEditable}には反映されません。
     *
     * @return この内容をコピーしたイメージ
     */
    Image makeImage();
}
