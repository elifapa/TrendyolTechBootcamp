package channel.email;

import exception.BlackListedException;
import interfaces.Email;
import model.Company;

public class EmailFlexiblePackage implements Email {
    private Company company;
    private double initialFee = 7.5;
    private final int maxLimit = 2000;
    private double perSmsFee = 0.03;

    private int numberOfEmailsSent = 0;

    public void calculate(){
        incrementEmailCountByOne();
    }

    private void incrementEmailCountByOne() {
        numberOfEmailsSent++;
    }

    public double getInitialFee() {
        return initialFee;
    }

    public void setInitialFee(double initialFee) {
        this.initialFee = initialFee;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public double getPerSmsFee() {
        return perSmsFee;
    }

    public void setPerSmsFee(double perSmsFee) {
        this.perSmsFee = perSmsFee;
    }

    public int getNumberOfEmailsSent() {
        return numberOfEmailsSent;
    }

    public void setNumberOfEmailsSent(int numberOfEmailsSent) {
        this.numberOfEmailsSent = numberOfEmailsSent;
    }
}
