package model;

import interfaces.Channel;

import java.util.ArrayList;

public class EmailDTO implements Channel {
    private Company emailFrom;
    private ArrayList<Receiver> emailTo;

    private String subject;
    private String message;

    //calls calculate method for each receiver for the company in question.
    @Override
    public void send() throws Exception {
        for (int i = 0; i < emailTo.size(); i++) {
            try {
                emailFrom.getUserPreferences().getEmailpackage().calculate();
            } catch (Exception e) {
                throw e;
            }
            System.out.printf("Mail sent to %, from %s with subject of %s: %s",
                    emailTo.get(i).getName(),
                    emailFrom,
                    subject,
                    message);
        }
    }

    public Company getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(Company emailFrom) {
        this.emailFrom = emailFrom;
    }

    public ArrayList<Receiver> getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(ArrayList<Receiver> emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
