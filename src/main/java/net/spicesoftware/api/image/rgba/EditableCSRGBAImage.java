package net.spicesoftware.api.image.rgba;

import net.spicesoftware.api.image.gs.EditableGrayScaleImage;

/**
 * 置き換え可能なRGBAの4チャンネルを{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}で保持するイメージです。
 * CS = ChannelSeparated
 *
 * @since 2015/03/02
 */
public interface EditableCSRGBAImage extends EditableRGBAImage {

    /**
     * この{@code EditableGrayScaleImage}のRチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を返します。
     *
     * @return このイメージのRチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScaleImage getChannelR();

    /**
     * この{@code EditableGrayScaleImage}のGチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を返します。
     *
     * @return このイメージのGチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScaleImage getChannelG();

    /**
     * この{@code EditableGrayScaleImage}のBチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を返します。
     *
     * @return このイメージのBチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScaleImage getChannelB();

    /**
     * この{@code EditableGrayScaleImage}のAチャンネルの{@link net.spicesoftware.api.image.gs.EditableGrayScaleImage}を返します。
     *
     * @return このイメージのAチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScaleImage getChannelA();

    @Override
    EditableCSRGBAImage copyDeeply();
}
