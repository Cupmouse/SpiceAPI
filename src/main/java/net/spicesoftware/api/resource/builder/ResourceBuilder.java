package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.util.DeepCopyable;
import net.spicesoftware.api.resource.Resource;

/**
 * @since 2014/12/23
 */
public interface ResourceBuilder extends DeepCopyable {

    /**
     * ビルドし、{@link net.spicesoftware.api.resource.Resource}を返します。
     *
     * @return 作成されたリソース
     * @throws java.lang.IllegalStateException ビルドする条件を満たしていない場合
     */
    Resource build() throws IllegalStateException;

    @Override
    ResourceBuilder copyDeeply();
}
