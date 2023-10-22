package dev.dk_corp.iphone.phone;

import dev.dk_corp.iphone.internet.Email;

public class Contact {
    private String name;
    private String surname;
    private Phone phone;
    private Email email;

    public Contact(String name, String surname, Phone phone, Email email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public Contact(String name, String surname, Phone phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public void createContact() {
        System.out.println("Contact created");
    }
}
