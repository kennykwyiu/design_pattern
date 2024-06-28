package org.kenny.design.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setContent("initial template");

        for (int i = 0; i < 10; i++) {
            mail.setName("name" + i);
            mail.setEmailAddress("name"+i+"@gmail.com");
            mail.setContent("Congratulation! You got a gift from Google");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
