import channel.email.EmailFixedPackage;
import channel.sms.SmsFlexiblePackage;
import interfaces.Channel;
import languages.English;
import model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //sender
        Company sender = new Company();
        sender.setCompanyname("Trendyol");
        sender.getUserPreferences().setLanguage(new English());
        sender.getUserPreferences().setEmailpackage(new EmailFixedPackage());
        sender.getUserPreferences().setSmspackage(new SmsFlexiblePackage());
        sender.setEmail("from-trendyol@gmail.com");
        sender.setPhone("1234567890");
        //receiver1
        Receiver userTo1 = new Receiver();
        userTo1.setName("gittigidiyor-mehmet");
        userTo1.setEmail("mehmet-gittigidiyor@gmail.com");
        userTo1.setPhone("1234567890");

        //receiver2
        Receiver userTo2 = new Receiver();
        userTo2.setName("gittigidiyor-necet");
        userTo2.setEmail("necet-gittigidiyor@gmail.com");
        userTo2.setPhone("1234567890");

        ArrayList<Receiver> receivers = new ArrayList<Receiver>();
        receivers.add(userTo1);
        receivers.add(userTo2);

        //email notification
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setEmailFrom(sender);
        emailDTO.setEmailTo(receivers);
        emailDTO.setMessage("wassup hahahaha");
        emailDTO.setSubject("haha");

        //sms notification
        SMSDTO smsDTO = new SMSDTO();
        SMSDTO.setSmsFrom(sender);
        SMSDTO.setSmsTo(receivers);
        SMSDTO.setMessage("Whats up mate?");

        for (int i = 0; i < 3000; i++) {
            try {
                sender.send(emailDTO);
                sender.send(smsDTO);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();

        LocalDate date;
        date = LocalDate.of(2020, 1, 4);
        sender.setLastPaymentDate(date);
        try {
            sender.send(smsDTO, emailDTO);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

}
