package net.spicesoftware.api.project.resource;

import javax.validation.constraints.Size;

/**
 * リソースツリーのフォルダです。
 *
 * @since 2014/12/23
 */
public interface ResourceTreeFolder extends ResourceTreeElement {

    /**
     * この{@code ResourceTreeFolder}の名前を返します。
     *
     * @return このリソースフォルダの名前を返します。
     */
    String getFolderName();

    /**
     * この{@code ResourceTreeFolder}の名前を設定します。
     *
     * @param name この{@code ResourceTreeFolder}に設定する名前
     */
    void setFolderName(@Size(min = 1) String name);
}
