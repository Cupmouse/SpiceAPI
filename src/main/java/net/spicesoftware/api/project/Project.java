package net.spicesoftware.api.project;

import net.spicesoftware.api.Spice;
import net.spicesoftware.api.project.resource.ResourceManager;

import javax.validation.constraints.Size;
import java.time.ZonedDateTime;

/**
 * プロジェクトです。
 * ルートの{@link net.spicesoftware.api.Box}である{@link TimelineRoot}を持っています。
 *
 * @since 2014/10/04
 */
public interface Project {

    /**
     * この{@code Project}の{@link Spice}を返します。
     *
     * @return このプロジェクトのSpiceインスタンス
     */
    Spice getSpice();

    /**
     * この{@code Project}の名前を返します。
     *
     * @return このプロジェクトの名前
     */
    @Size(min = 1)
    String getName();

    /**
     * この{@code Project}の名前を設定します。
     *
     * @param name 名前
     */
    void setName(@Size(min = 1) String name);

    /**
     * この{@code Project}の作成された日時の{@link ZonedDateTime}を返します。
     *
     * @return このプロジェクトの作成された日時
     */
    ZonedDateTime getCreatedDate();

    /**
     * この{@code Project}の作成された日時の{@link ZonedDateTime}を設定します。
     *
     * @param createdDate 設定する日時
     */
    void setCreatedDate(ZonedDateTime createdDate);

    /**
     * この{@code Project}のルートの{@link TimelineRoot}を返します。
     *
     * @return このプロジェクトのタイムライン
     */
    TimelineRoot getTimeline();

    /**
     * この{@code Project}のタイムラインをリセットします。
     */
    void resetTimeline();

    /**
     * この{@code Project}の{@link ResourceManager}を返します。
     *
     * @return このプロジェクトのリソースマネージャ
     */
    ResourceManager getResourceManager();

}
