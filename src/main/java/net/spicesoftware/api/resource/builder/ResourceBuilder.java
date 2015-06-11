package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.Resource;
import net.spicesoftware.api.util.DeepCopyable;

/**
 * リソースを作成するビルダーです。
 *
 * @since 2014/12/23
 */
public interface ResourceBuilder<T extends Resource> extends DeepCopyable {

    /**
     * ビルドし、{@link Resource}を返します。
     *
     * @return 作成されたリソース
     * @throws IllegalStateException ビルドする条件を満たしていない場合
     */
    T build() throws IllegalStateException;

    @Override
    ResourceBuilder copyDeeply();
}
