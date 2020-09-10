package model;

import exception.BlackListedException;
import interfaces.Channel;

import java.time.LocalDate;

public class Company implements Channel {
    private int id;
    private String companyname;
    private String email;
    private String phone;

    private UserPreferences userPreferences;

    private int allowanceDays = 60;
    private LocalDate lastPaymentDate = LocalDate.now();
    private double monthlyreceipt;


    //checks if company's last payment was more than 60 days ago.
    @Override
    public void send(Channel channel) {
        if(this.getLastPaymentDate().plusDays(this.getAllowanceDays()).compareTo(LocalDate.now())<0){
            throw new BlackListedException(this.getUserPreferences().getLanguage().getBlackListedExceptionMessage());
        }
        channel.send();

    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getAllowanceDays() {
        return allowanceDays;
    }

    public void setAllowanceDays(int allowanceDays) {
        this.allowanceDays = allowanceDays;
    }

    public LocalDate getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(LocalDate lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public double getMonthlyreceipt() {
        return monthlyreceipt;
    }

    public void setMonthlyreceipt(double monthlyreceipt) {
        this.monthlyreceipt = monthlyreceipt;
    }

    public UserPreferences getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(UserPreferences userPreferences) {
        this.userPreferences = userPreferences;
    }

    public String getName() {
        return companyname;
    }

    public void setName(String name) {
        this.companyname = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
