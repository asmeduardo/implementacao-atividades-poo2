package com.contact.builder;

import com.contact.contact.Contact;

public abstract class ContactBuilder {
    protected Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setName(String name) {
        contact.name = name;
    }

    public abstract void setAddress(String address);
    public abstract void setPhone(String phone);
    public abstract void setEmail(String email);
}

