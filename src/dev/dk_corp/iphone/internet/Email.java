package dev.dk_corp.iphone.internet;

public class Email {
    private String emailAdress;

    public Email(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void sendEmail() {
        System.out.println("Sending email");
    }

    public void deleteEmail() {
        System.out.println("Deleting email");
    }
}
