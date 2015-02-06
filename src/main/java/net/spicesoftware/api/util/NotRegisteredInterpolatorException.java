package net.spicesoftware.api.util;

/**
 * @since 2015/02/01
 */
public final class NotRegisteredInterpolatorException extends NotRegisteredInRegistryException {

    public NotRegisteredInterpolatorException() {
    }

    public NotRegisteredInterpolatorException(String message) {
        super(message);
    }

    public NotRegisteredInterpolatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotRegisteredInterpolatorException(Throwable cause) {
        super(cause);
    }

    public NotRegisteredInterpolatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
