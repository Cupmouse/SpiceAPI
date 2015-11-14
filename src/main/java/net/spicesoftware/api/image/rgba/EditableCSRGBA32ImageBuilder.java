package net.spicesoftware.api.image.rgba;

import net.spicesoftware.api.image.gs.EditableGrayScale8Image;
import net.spicesoftware.api.image.rgb.EditableCSRGB24Image;
import net.spicesoftware.api.image.rgb.RGB24ImageBuilder;

/**
 * @since 2015/11/14
 */
public interface EditableCSRGBA32ImageBuilder extends RGBA32ImageBuilder<EditableCSRGBA32Image> {

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
