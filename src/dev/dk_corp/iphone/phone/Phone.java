package dev.dk_corp.iphone.phone;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public void call() {
        System.out.println("Calling...");
    }

    public void answer() {
        System.out.println("Answering...");
    }

    public void playVoiceMail() {
        System.out.println("Playing voice mail");
    }
}
