package org.kenny.design.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("initial template");
        System.out.println("initial mail: " + mail);

        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("name" + i);
            mailTemp.setEmailAddress("name"+i+"@gmail.com");
            mailTemp.setContent("Congratulation! You got a gift from Google");
            MailUtil.sendMail(mailTemp);
            System.out.println("cloned mailTemp: " + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
        System.out.println(mail);
    }
}
