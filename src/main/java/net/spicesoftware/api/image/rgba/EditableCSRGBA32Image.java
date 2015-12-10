package net.spicesoftware.api.image.rgba;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.decoration.fill.RGBA32Color;
import net.spicesoftware.api.image.gs.EditableGrayScale8Image;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

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
    interface Builder extends RGBA32ImageBuilder<EditableCSRGBA32Image> {

        @Override
        Builder size(@Min(0) int width, @Min(0) int height) throws IllegalArgumentException;

        @Override
        Builder size(Vector2i size) throws IllegalArgumentException;

        @Override
        Builder background(RGBA32Color rgba32Color);

        @Override
        Builder background(int rgba32);

        @Override
        Builder background(@Min(0) @Max(0xFFFFFFFF) long rgba32) throws IllegalArgumentException;

        /**
         * 作成する{@link EditableCSRGBA32Image}のRチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param r 作成する{@link EditableCSRGBA32Image}のRチャンネルの{@link EditableGrayScale8Image}
         */
        Builder channelR(EditableGrayScale8Image r);

        /**
         * 作成する{@link EditableCSRGBA32Image}のGチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param g 作成する{@link EditableCSRGBA32Image}のGチャンネルの{@link EditableGrayScale8Image}
         */
        Builder channelG(EditableGrayScale8Image g);

        /**
         * 作成する{@link EditableCSRGBA32Image}のBチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param b 作成する{@link EditableCSRGBA32Image}のBチャンネルの{@link EditableGrayScale8Image}
         */
        Builder channelB(EditableGrayScale8Image b);

        /**
         * 作成する{@link EditableCSRGBA32Image}のBチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param a 作成する{@link EditableCSRGBA32Image}のBチャンネルの{@link EditableGrayScale8Image}
         */
        Builder channelA(EditableGrayScale8Image a);
    }
}
