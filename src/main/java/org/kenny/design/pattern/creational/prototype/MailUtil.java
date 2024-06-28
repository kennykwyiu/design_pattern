package org.kenny.design.pattern.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "send email to {0}, email address: {1}, email content: {2}\nemail sent successfully";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("save originMail record, originMail: " + mail.getContent());
    }
}
