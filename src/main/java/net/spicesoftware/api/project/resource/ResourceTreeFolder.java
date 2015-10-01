package net.spicesoftware.api.project.resource;

import net.spicesoftware.api.resource.Resource;
import net.spicesoftware.api.util.ResourceAlreadyExistInTreeException;

import java.util.Map;
import java.util.Optional;

/**
 * リソースツリーの要素です。
 *
 * @since 2014/12/19
 */
public interface ResourceTreeFolder {

    /**
     * この{@code ResourceTreeFolder}上の{@link Resource}の名前とそれのマップを返します。
     *
     * @return リソースの名前とそのリソースのマップ
     */
    Map<String, Resource> getResourceMap();

    /**
     * 名前からこの{@code ResourceTreeFolder}上の{@link Resource}を取得します。
     *
     * @param name 名前
     * @return リソース
     */
    Optional<Resource> getResource(String name);

    /**
     * この{@code ResourceTreeFolder}を起点とするパスから{@link Resource}を取得します。
     *
     * @param path {@link Resource}までのパス
     * @return 指定されたパスにあるリソース
     */
    Optional<Resource> getResource(String... path);

    /**
     * この{@code ResourceTreeFolder}上にすでに存在する{@link Resource}をコピーしてツリーに追加します。
     *
     * @param resource コピー元のリソース
     * @param name     コピーして追加するリソースの名前
     * @return コピーして追加したリソース
     */
    Resource addResourceCopyOf(Resource resource, String name);

    /**
     * 指定した{@link Resource}をこの{@code ResourceTreeFolder}上に追加します。
     *
     * @param resource 追加するリソース
     * @param name     名前
     * @return 追加したリソース
     * @throws ResourceAlreadyExistInTreeException 追加しようとしたリソースがすでにツリーに登録されている場合
     */
    Resource addResource(Resource resource, String name) throws ResourceAlreadyExistInTreeException;

    /**
     * この{@code ResourceTreeFolder}上の{@link Resource}の名前を指定して削除します。
     *
     * @param name 削除するリソースの名前
     */
    void removeResource(String name);

    /**
     * この{@code ResourceTreeFolder}上の{@link Resource}の名前を変更します。
     *
     * @param beforeName 変更前の名前
     * @param afterName  変更後の名前
     * @return 名前が変更されたリソース
     */
    Resource renameResourceTo(String beforeName, String afterName);

    /**
     * この{@code ResourceTreeFolder}上のすべての{@code ResourceTreeFolder}を返します。
     * 編集できません。
     *
     * @return この{@code ResourceTreeFolder}上のすべての{@code ResourceTreeFolder}
     */
    Map<String, ResourceTreeFolder> getFolderMap();

    /**
     * この{@code ResourceTreeFolder}上の指定された名前の{@code ResourceTreeFolder}を返します
     *
     * @param name 取得する子{@code ResourceTreeFolder}の名前
     * @return この{@code ResourceTreeFolder}上の指定された名前の{@code ResourceTreeFolder}
     */
    Optional<ResourceTreeFolder> getFolder(String name);

    /**
     * 指定されたこの{@code ResourceTreeFolder}を起点とするパスの{@code ResourceTreeFolder}を返します。
     *
     * @param path 取得したい子{@code ResourceTreeFolder}のこの{@code ResourceTreeFolder}を起点とするパス
     * @return 指定されたこの{@code ResourceTreeFolder}を起点とするパスの{@code ResourceTreeFolder}
     */
    Optional<ResourceTreeFolder> getFolder(String... path);

    /**
     * 指定された名前の新しい{@code ResourceTreeFolder}をこの{@code ResourceTreeFolder}上のフォルダーとして作成し、追加します。
     *
     * @param name 新しく作成するフォルダーの名前
     * @return 作成された{@code ResourceTreeFolder}
     */
    ResourceTreeFolder createNewFolder(String name);
}
