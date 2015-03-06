package net.spicesoftware.api.image.rgb;

import net.spicesoftware.api.image.gs.EditableGrayScaleImage;

/**
 * 置き換え可能なRGBの3チャンネルを{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}で保持するイメージです。
 * CS = ChannelSeparated
 *
 * @since 2015/03/02
 */
public interface EditableCSRGBImage extends EditableRGBImage {

    /**
     * この{@code EditableCSRGBImage}のRチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を返します。
     *
     * @return このイメージのRチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScaleImage getChannelR();

    /**
     * この{@code EditableCSRGBImage}のGチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を返します。
     *
     * @return このイメージのGチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScaleImage getChannelG();

    /**
     * この{@code EditableCSRGBImage}のBチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を返します。
     *
     * @return このイメージのBチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScaleImage getChannelB();

    @Override
    EditableCSRGBImage copyDeeply();
}
