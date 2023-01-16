package com.contact.director;

import com.contact.builder.ContactBuilder;
import com.contact.contact.Contact;

public class Director {
    private ContactBuilder builder;

    public void setBuilder(ContactBuilder builder) {
        this.builder = builder;
    }

    public void buildInternetContact(String name, String email) {
        builder.setName(name);
        builder.setEmail(email);
    }

    public void buildPhoneContact(String name, String phone) {
        builder.setName(name);
        builder.setPhone(phone);
    }

    public void buildContact(String name, String address, String phone, String email) {
        builder.setName(name);
        builder.setAddress(address);
        builder.setPhone(phone);
        builder.setEmail(email);
    }

    public Contact getContact() {
        return builder.getContact();
    }
}
