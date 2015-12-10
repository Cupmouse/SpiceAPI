package net.spicesoftware.api.project.resource;

import net.spicesoftware.api.resource.Resource;

import java.util.Set;

/**
 * {@link net.spicesoftware.api.project.Project}のリソースを管理します。
 * <p>
 * 同期する際は、ルートの{@link ResourceTreeFolder}({@link #getRootOfResourceTree()})をロックします。
 *
 * @since 2014/12/19
 */
public interface ResourceManager {

    /**
     * リソースツリーのルートの{@link ResourceTreeFolder}を返します。
     *
     * @return リソースツリーのルート
     */
    ResourceTreeFolder getRootOfResourceTree();

    /**
     * ツリーに含まれているすべての{@link Resource}を返します。
     *
     * @return ツリーに含まれているすべてのリソース
     */
    Set<Resource> getAllResourcesInTree();

}
