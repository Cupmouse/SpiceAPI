package net.spicesoftware.api.decoration.fill;

import net.spicesoftware.api.Builder;
import net.spicesoftware.api.image.CachedImage;
import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/11/15
 */
public interface ImagePatternFillingBuilder extends Builder<ImagePatternFilling> {

    /**
     * パターンの{@link CachedImage}を設定します。
     *
     * @param image パターンの{@link CachedImage}
     * @return このインスタンス
     */
    ImagePatternFillingBuilder image(CachedImage image);

    /**
     * パターンの位置ずれを設定します。
     *
     * @param offsetX パターンのXオフセット
     * @param offsetX パターンのYオフセット
     * @return このインスタンス
     */
    ImagePatternFillingBuilder offset(int offsetX, int offsetY);

    /**
     * パターンの位置ずれを{@link Vector2i}で設定します。
     *
     * @param offset パターンのオフセット
     * @return このインスタンス
     */
    ImagePatternFillingBuilder offset(Vector2i offset);
}
