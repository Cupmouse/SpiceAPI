package net.spicesoftware.api.util;

/**
 * @since 2015/02/02
 */
public class NotRegisteredInRegistryException extends RuntimeException {

    public NotRegisteredInRegistryException() {
    }

    public NotRegisteredInRegistryException(String message) {
        super(message);
    }

    public NotRegisteredInRegistryException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotRegisteredInRegistryException(Throwable cause) {
        super(cause);
    }

    public NotRegisteredInRegistryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
