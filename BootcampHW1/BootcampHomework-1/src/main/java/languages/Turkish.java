package languages;

import interfaces.Language;

public class Turkish implements Language {
    @Override
    public String getEmailQuotaExceededExceptionMessage() {
        return "Size tanınan e-mail kotasının limitine ulaştınız.";
    }

    @Override
    public String getSmsQuotaExceededExceptionMessage() {
        return "Size tanınan SMS kotasının limitine ulaştınız.";
    }

    @Override
    public String getBlackListedExceptionMessage() {
        return "Bildirim gönderilemedi. 2 aylık faturanızı ödemediğiniz için kara listeye alındınız.";
    }
}

