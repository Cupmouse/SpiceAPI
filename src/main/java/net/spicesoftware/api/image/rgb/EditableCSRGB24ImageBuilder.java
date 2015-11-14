package net.spicesoftware.api.image.rgb;

import net.spicesoftware.api.image.ImageBuilder;
import net.spicesoftware.api.image.gs.EditableGrayScale8Image;

/**
 * @since 2015/11/14
 */
public interface EditableCSRGB24ImageBuilder extends RGB24ImageBuilder<EditableCSRGB24Image> {

    /**
     * 作成する{@link EditableCSRGB24Image}のRチャンネルの{@link EditableGrayScale8Image}を設定します。
     *
     * @param r 作成する{@link EditableCSRGB24Image}のRチャンネルの{@link EditableGrayScale8Image}
     */
    void channelR(EditableGrayScale8Image r);

    /**
     * 作成する{@link EditableCSRGB24Image}のGチャンネルの{@link EditableGrayScale8Image}を設定します。
     *
     * @param g 作成する{@link EditableCSRGB24Image}のGチャンネルの{@link EditableGrayScale8Image}
     */
    void channelG(EditableGrayScale8Image g);

    /**
     * 作成する{@link EditableCSRGB24Image}のBチャンネルの{@link EditableGrayScale8Image}を設定します。
     *
     * @param b 作成する{@link EditableCSRGB24Image}のBチャンネルの{@link EditableGrayScale8Image}
     */
    void channelB(EditableGrayScale8Image b);
}
