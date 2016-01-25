package net.spicesoftware.api.image.rgb;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.image.gs.EditableGrayScale8Image;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 置き換え可能なRGBの3チャンネルを{@link EditableGrayScale8Image}で保持するイメージです。
 * CS = ChannelSeparated
 *
 * @since 2015/03/02
 */
public interface EditableCSRGB24Image extends EditableRGB24Image {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    /**
     * この{@code EditableCSRGB24Image}のRチャンネルの{@link EditableGrayScale8Image}を返します。
     *
     * @return このイメージのRチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScale8Image getChannelR();

    /**
     * この{@code EditableCSRGB24Image}のGチャンネルの{@link EditableGrayScale8Image}を返します。
     *
     * @return このイメージのGチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScale8Image getChannelG();

    /**
     * この{@code EditableCSRGB24Image}のBチャンネルの{@link EditableGrayScale8Image}を返します。
     *
     * @return このイメージのBチャンネルの編集可能なグレースケールイメージ
     */
    EditableGrayScale8Image getChannelB();

    @Override
    EditableCSRGB24Image copyDeeply();

    /**
     * @since 2015/11/14
     */
    interface Builder extends RGB24ImageBuilder<EditableCSRGB24Image> {

        @Override
        Builder background(RGB24Color backgroundColor);

        @Override
        Builder background(@Min(0) @Max(0xFFFFFF) int backgroundColor) throws IllegalArgumentException;

        @Override
        Builder size(@Min(0) int width, @Min(0) int height) throws IllegalArgumentException;

        @Override
        Builder size(Vector2i size) throws IllegalArgumentException;

        /**
         * 作成する{@link EditableCSRGB24Image}のRチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param r 作成する{@link EditableCSRGB24Image}のRチャンネルの{@link EditableGrayScale8Image}
         */
        Builder channelR(EditableGrayScale8Image r);

        /**
         * 作成する{@link EditableCSRGB24Image}のGチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param g 作成する{@link EditableCSRGB24Image}のGチャンネルの{@link EditableGrayScale8Image}
         */
        Builder channelG(EditableGrayScale8Image g);

        /**
         * 作成する{@link EditableCSRGB24Image}のBチャンネルの{@link EditableGrayScale8Image}を設定します。
         *
         * @param b 作成する{@link EditableCSRGB24Image}のBチャンネルの{@link EditableGrayScale8Image}
         */
        Builder channelB(EditableGrayScale8Image b);
    }
}
