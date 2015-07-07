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
public interface ResourceTreeElement {

    /**
     * ツリーの{@link Resource}の名前とそれのマップを返します。
     *
     * @return リソースの名前とそのリソースのマップ
     */
    Map<String, Resource> getResourceMap();

    /**
     * 名前から{@link Resource}を取得します。
     *
     * @param name 名前
     * @return リソース
     */
    Optional<Resource> getResource(String name);

    /**
     * すでに存在する{@link Resource}をコピーしてツリーに追加します。
     *
     * @param resource コピー元のリソース
     * @param name     コピーして追加するリソースの名前
     * @return コピーして追加したリソース
     */
    Resource addResourceCopyOf(Resource resource, String name);

    /**
     * 指定した{@link Resource}をツリーに追加します。
     *
     * @param resource 追加するリソース
     * @param name     名前
     * @return 追加したリソース
     * @throws ResourceAlreadyExistInTreeException 追加しようとしたリソースがすでにツリーに登録されている場合
     */
    Resource addResource(Resource resource, String name) throws ResourceAlreadyExistInTreeException;

    /**
     * ツリー上の{@link Resource}の名前を指定して削除します。
     *
     * @param name 削除するリソースの名前
     */
    void removeResource(String name);

    /**
     * ツリー上の{@link Resource}の名前を変更します。
     *
     * @param beforeName 変更前の名前
     * @param afterName  変更後の名前
     * @return 名前が変更されたリソース
     */
    Resource renameResourceTo(String beforeName, String afterName);

    Map<String, ResourceTreeElement> getChildElementMap();

    Optional<ResourceTreeElement> getChildElement(String name);

    ResourceTreeElement createChildElement(String name);
}
