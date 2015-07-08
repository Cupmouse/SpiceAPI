package net.spicesoftware.api.project.resource;

import net.spicesoftware.api.resource.Resource;

import java.util.Set;

/**
 * {@link net.spicesoftware.api.project.Project}のリソースを管理します。
 *
 * @since 2014/12/19
 */
public interface ResourceManager {

    /**
     * リソースツリーのルートの{@link ResourceTreeElement}を返します。
     *
     * @return リソースツリーのルート
     */
    ResourceTreeElement getRootResourceTree();

    /**
     * ツリーに含まれているすべての{@link Resource}を返します。
     *
     * @return ツリーに含まれているすべてのリソース
     */
    Set<Resource> getAllResourceInTree();

}
