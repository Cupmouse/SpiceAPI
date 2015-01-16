package net.spicesoftware.api.event;

/**
 * @since 2014/12/17
 */
public interface EventCancelable extends Event {

    /**
     * この{@code Event}をキャンセルします。
     */
    void cancel();

    /**
     * この{@code Event}がキャンセルされているかを真偽値で返します。
     *
     * @return このイベントがキャンセルされているか
     */
    boolean isCanceled();

    /**
     * この{@code Event}がキャンセルされるかを設定します。
     *
     * @param canceled このイベントをキャンセルするか
     */
    void setCanceled(boolean canceled);

}
