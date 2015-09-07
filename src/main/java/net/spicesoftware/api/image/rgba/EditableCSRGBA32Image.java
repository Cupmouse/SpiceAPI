package net.spicesoftware.api.image.rgba;

import net.spicesoftware.api.image.gs.EditableGrayScale8Image;

/**
 * 置き換え可能なRGBAの4チャンネルを{@link EditableGrayScale8Image}で保持するイメージです。
 * CS = ChannelSeparated
 *
 * @since 2015/03/02
 */
public interface EditableCSRGBA32Image extends EditableRGBA32Image {

    /**
     * この{@code EditableGrayScale8Image}のRチャンネルの{@link EditableGrayScale8Image}を返します。
     *
     * @return このイメージのRチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScale8Image getChannelR();

    /**
     * この{@code EditableGrayScale8Image}のGチャンネルの{@link EditableGrayScale8Image}を返します。
     *
     * @return このイメージのGチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScale8Image getChannelG();

    /**
     * この{@code EditableGrayScale8Image}のBチャンネルの{@link EditableGrayScale8Image}を返します。
     *
     * @return このイメージのBチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScale8Image getChannelB();

    /**
     * この{@code EditableGrayScale8Image}のAチャンネルの{@link EditableGrayScale8Image}を返します。
     *
     * @return このイメージのAチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScale8Image getChannelA();

    @Override
    EditableCSRGBA32Image copyDeeply();
}
