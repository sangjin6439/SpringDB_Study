package hello.jdbc.repository.ex;

public class MyDuplicationKeyException extends MyDbException{

    public MyDuplicationKeyException() {
    }

    public MyDuplicationKeyException(final String message) {
        super(message);
    }

    public MyDuplicationKeyException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public MyDuplicationKeyException(final Throwable cause) {
        super(cause);
    }
}
