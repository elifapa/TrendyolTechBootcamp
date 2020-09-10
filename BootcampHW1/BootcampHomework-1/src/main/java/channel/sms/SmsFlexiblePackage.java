package channel.sms;

import interfaces.Sms;
import model.Company;

public class SmsFlexiblePackage implements Sms {
    private Company company;
    private double initialFee = 30;
    private final int maxLimit = 2000;
    private double perSmsFee = 0.1;

    private int numberOfEmailsSent = 0;


    public void calculate(){
        incrementEmailCountByOne();
    }

    private void incrementEmailCountByOne() {
        numberOfEmailsSent++;
    }

}
