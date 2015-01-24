package net.spicesoftware.api.util;

/**
 * 指定されたリソースのインスタンスがすでにツリー上に登録されている場合に発生する例外です。
 *
 * @since 2014/12/23
 */
public final class ResourceAlreadyExistInTreeException extends RuntimeException {

    public ResourceAlreadyExistInTreeException() {
    }

    public ResourceAlreadyExistInTreeException(String message) {
        super(message);
    }

    public ResourceAlreadyExistInTreeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceAlreadyExistInTreeException(Throwable cause) {
        super(cause);
    }

    public ResourceAlreadyExistInTreeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
