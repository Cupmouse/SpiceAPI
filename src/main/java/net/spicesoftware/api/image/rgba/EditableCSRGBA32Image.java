package net.spicesoftware.api.image.rgba;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.image.gs.EditableGrayScale8Image;

/**
 * 置き換え可能なRGBAの4チャンネルを{@link EditableGrayScale8Image}で保持するイメージです。
 * CS = ChannelSeparated
 *
 * @since 2015/03/02
 */
public interface EditableCSRGBA32Image extends EditableRGBA32Image {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

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

    /**
     * @since 2015/11/14
     */
    interface Builder extends IBuilder<EditableCSRGBA32Image> {

        /**
         * 作成する{@link EditableCSRGBA32Image}のRチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param r 作成する{@link EditableCSRGBA32Image}のRチャンネルの{@link EditableGrayScale8Image}
         */
        void channelR(EditableGrayScale8Image r);

        /**
         * 作成する{@link EditableCSRGBA32Image}のGチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param g 作成する{@link EditableCSRGBA32Image}のGチャンネルの{@link EditableGrayScale8Image}
         */
        void channelG(EditableGrayScale8Image g);

        /**
         * 作成する{@link EditableCSRGBA32Image}のBチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param b 作成する{@link EditableCSRGBA32Image}のBチャンネルの{@link EditableGrayScale8Image}
         */
        void channelB(EditableGrayScale8Image b);

        /**
         * 作成する{@link EditableCSRGBA32Image}のBチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param a 作成する{@link EditableCSRGBA32Image}のBチャンネルの{@link EditableGrayScale8Image}
         */
        void channelA(EditableGrayScale8Image a);
    }
}
