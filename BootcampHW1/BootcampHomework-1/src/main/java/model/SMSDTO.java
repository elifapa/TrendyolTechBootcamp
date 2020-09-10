package model;

import interfaces.Channel;

import java.util.ArrayList;

public class SMSDTO implements Channel {
    private Company smsFrom;
    private ArrayList<Receiver> smsTo;
    private String message;

    @Override
    public void send() throws Exception {
        for (int i = 0; i < smsTo.size(); i++) {
            try {
                smsFrom.getUserPreferences().getEmailpackage().calculate();
            } catch (Exception e) {
                throw e;
            }
            System.out.printf("Mail sent to %, from %s: %s",
                    smsTo.get(i).getName(),
                    smsFrom,
                    message);
        }
    }

    public Company getSmsFrom() {
        return smsFrom;
    }

    public void setSmsFrom(Company smsFrom) {
        this.smsFrom = smsFrom;
    }

    public ArrayList<Receiver> getSmsTo() {
        return smsTo;
    }

    public void setSmsTo(ArrayList<Receiver> smsTo) {
        this.smsTo = smsTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
