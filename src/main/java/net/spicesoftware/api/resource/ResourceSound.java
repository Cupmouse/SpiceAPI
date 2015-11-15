package net.spicesoftware.api.resource;

/**
 * 音のリソースです。
 *
 * @since 2014/12/06
 */
public interface ResourceSound extends ResourceFromFile {

    @Override
    ResourceSound copyDeeply();
}
