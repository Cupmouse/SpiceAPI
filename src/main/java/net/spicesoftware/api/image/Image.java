package net.spicesoftware.api.image;

import net.spicesoftware.api.ParameterEssentialBuilder;
import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Min;

/**
 * {@code Image}クラスは画像を保持するクラスです。
 * 内容が変更できない画像は{@link CachedImage}、変更できる画像は{@link ImageEditable}です。<br>
 * <br>
 * {@code Image}同士を変換する場合は{@link ImageConverter}を使用します。<br>
 * {@code Image}を合成する場合は{@link net.spicesoftware.api.image.blender.ImageBlender}を使用します。<br>
 * どちらも{@link net.spicesoftware.api.registry.Registry}からインスタンスの登録と取得ができます。
 *
 * @since 2015/01/17
 */
public interface Image extends DeepCopyable {

    /**
     * この{@code Image}のサイズを{@link net.spicesoftware.api.util.vector.Vector2i}で返します。
     *
     * @return このイメージのサイズ
     */
    Vector2i getSize();

    /**
     * この{@code Image}の横の長さを返します。
     *
     * @return このイメージの横の長さを返します。
     */
    @Min(1)
    int getWidth();

    /**
     * この{@code Image}の縦の長さを返します。
     *
     * @return このイメージの縦の長さ
     */
    @Min(1)
    int getHeight();

    @Override
    Image copyDeeply();

    /**
     * @since 2015/11/14
     */
    interface IBuilder<T extends Image> extends ParameterEssentialBuilder<T> {

        /**
         * 作成する{@link Image}のサイズを幅と高さの{@code int}で設定します。
         *
         * @param width  幅
         * @param height 高さ
         * @throws IllegalArgumentException 指定されたサイズが負の値の場合
         */
        void size(@Min(0) int width, @Min(0) int height) throws IllegalArgumentException;

        /**
         * 作成する{@link Image}のサイズの{@link Vector2i}で設定します。
         *
         * @param size 作成する{@link Image}のサイズの{@link Vector2i}
         * @throws IllegalArgumentException 指定されたサイズが負の値の場合
         */
        void size(Vector2i size) throws IllegalArgumentException;
    }
}
