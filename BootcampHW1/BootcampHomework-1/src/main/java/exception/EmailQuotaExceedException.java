package exception;

public class EmailQuotaExceedException extends RuntimeException {
    public EmailQuotaExceedException(String message){
        super(message);
    }
}
