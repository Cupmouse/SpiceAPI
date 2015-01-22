package net.spicesoftware.api.util;

/**
 * 指定されたリソースのインスタンスがすでにツリー上に登録されている場合に発生する例外です。
 *
 * @since 2014/12/23
 */
public final class ResourceAlreadyExistException extends RuntimeException {

    public ResourceAlreadyExistException() {
    }

    public ResourceAlreadyExistException(String message) {
        super(message);
    }

    public ResourceAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceAlreadyExistException(Throwable cause) {
        super(cause);
    }

    public ResourceAlreadyExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
