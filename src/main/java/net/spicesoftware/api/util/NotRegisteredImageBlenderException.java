package net.spicesoftware.api.util;

/**
 * @since 2015/02/02
 */
public final class NotRegisteredImageBlenderException extends NotRegisteredInRegistryException {

    public NotRegisteredImageBlenderException() {
    }

    public NotRegisteredImageBlenderException(String message) {
        super(message);
    }

    public NotRegisteredImageBlenderException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotRegisteredImageBlenderException(Throwable cause) {
        super(cause);
    }

    public NotRegisteredImageBlenderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
