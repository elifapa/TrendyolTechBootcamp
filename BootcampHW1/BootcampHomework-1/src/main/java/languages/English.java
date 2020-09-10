package languages;

import interfaces.Language;

public class English implements Language {
    @Override
    public String getEmailQuotaExceededExceptionMessage() {
        return "You exceeded the assigned e-mail quota for the package you have.";
    }

    @Override
    public String getSmsQuotaExceededExceptionMessage() {
        return "You exceeded the assigned SMS quota for the package you have.";
    }

    @Override
    public String getBlackListedExceptionMessage() {
        return "Notification cannot be sent. You have been blacklisted since you have not been paying your receipts for 2 months.";
    }
}
