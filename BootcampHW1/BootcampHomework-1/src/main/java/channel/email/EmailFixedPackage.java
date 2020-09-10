package channel.email;

import exception.BlackListedException;
import exception.EmailQuotaExceedException;
import interfaces.Email;
import model.Company;

public class EmailFixedPackage implements Email {
    private Company company;
    private final int maxLimit = 1000;
    private int numberOfEmailsSent = 0;

    public void calculate(){
        if(numberOfEmailsSent>maxLimit) {
            throw new EmailQuotaExceedException(company.getUserPreferences().getLanguage().getEmailQuotaExceededExceptionMessage());
        }
        incrementEmailCountByOne();
    }
    private void incrementEmailCountByOne() {
        numberOfEmailsSent++;
    }
}
