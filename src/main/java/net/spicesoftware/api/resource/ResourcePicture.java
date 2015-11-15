package net.spicesoftware.api.resource;

/**
 * 画像のリソースです。
 *
 * @since 2014/10/06
 */
public interface ResourcePicture extends ResourceFromFile {

    @Override
    ResourcePicture copyDeeply();
}
