package net.spicesoftware.api.util;

/**
 * @since 2015/02/02
 */
public final class AlreadyRegisteredInRegistryException extends RuntimeException {

    public AlreadyRegisteredInRegistryException() {
    }

    public AlreadyRegisteredInRegistryException(String message) {
        super(message);
    }

    public AlreadyRegisteredInRegistryException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlreadyRegisteredInRegistryException(Throwable cause) {
        super(cause);
    }

    public AlreadyRegisteredInRegistryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
