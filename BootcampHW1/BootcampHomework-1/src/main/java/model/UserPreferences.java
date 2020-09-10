package model;

import interfaces.Email;
import interfaces.Language;
import interfaces.Sms;

public class UserPreferences {
    private Language language;
    private Sms smspackage;
    private Email emailpackage;

    public Sms getSmspackage() {
        return smspackage;
    }

    public void setSmspackage(Sms smspackage) {
        this.smspackage = smspackage;
    }

    public Email getEmailpackage() {
        return emailpackage;
    }

    public void setEmailpackage(Email emailpackage) {
        this.emailpackage = emailpackage;
    }

    private int id;
    private Language language;
    public UserPreferences(Language language){
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
