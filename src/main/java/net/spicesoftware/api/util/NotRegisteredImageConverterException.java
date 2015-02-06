package net.spicesoftware.api.util;

/**
 * @since 2015/02/03
 */
public class NotRegisteredImageConverterException extends NotRegisteredInRegistryException {

    public NotRegisteredImageConverterException() {
    }

    public NotRegisteredImageConverterException(String message) {
        super(message);
    }

    public NotRegisteredImageConverterException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotRegisteredImageConverterException(Throwable cause) {
        super(cause);
    }

    public NotRegisteredImageConverterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
