package net.spicesoftware.api.resource;

/**
 * シェイプリソースです。
 *
 * @since 2014/12/11
 */
public interface ResourceShape extends Resource {

    @Override
    ResourceShape copyDeeply();
}
