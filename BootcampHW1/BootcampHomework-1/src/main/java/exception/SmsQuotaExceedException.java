package exception;

public class SmsQuotaExceedException extends RuntimeException {
    public SmsQuotaExceedException(String message){
        super(message);
    }
}
