package channel.sms;

import exception.BlackListedException;
import exception.SmsQuotaExceedException;
import interfaces.Sms;
import model.Company;

public class SmsFixedPackage implements Sms {
    private Company company;
    private final int maxLimit = 1000;
    private int numberOfEmailsSent = 0;

    public void calculate(){
        if(numberOfEmailsSent>maxLimit) {
            throw new SmsQuotaExceedException(company.getUserPreferences().getLanguage().getSmsQuotaExceededExceptionMessage());
        }
        incrementEmailCountByOne();
    }
    private void incrementEmailCountByOne() {
        numberOfEmailsSent++;
    }
}
