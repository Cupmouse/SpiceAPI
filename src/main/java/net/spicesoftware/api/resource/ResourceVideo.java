package net.spicesoftware.api.resource;

/**
 * 映像のリソースです。
 *
 * @since 2014/10/05
 */
public interface ResourceVideo extends ResourceFromFile {

    @Override
    ResourceVideo copyDeeply();
}
