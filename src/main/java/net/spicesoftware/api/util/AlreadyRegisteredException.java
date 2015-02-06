package net.spicesoftware.api.util;

/**
 * @since 2015/02/02
 */
public class AlreadyRegisteredException extends RuntimeException {

    public AlreadyRegisteredException() {
    }

    public AlreadyRegisteredException(String message) {
        super(message);
    }

    public AlreadyRegisteredException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlreadyRegisteredException(Throwable cause) {
        super(cause);
    }

    public AlreadyRegisteredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
