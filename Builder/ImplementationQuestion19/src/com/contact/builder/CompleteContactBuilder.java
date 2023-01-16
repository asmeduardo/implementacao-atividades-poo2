package com.contact.builder;

import com.contact.complete.CompleteContact;

public class CompleteContactBuilder extends ContactBuilder {
    public CompleteContactBuilder() {
        contact = new CompleteContact();
    }

    public void setAddress(String address) {
        contact.address = address;
    }

    public void setPhone(String phone) {
        contact.phone = phone;
    }

    public void setEmail(String email) {
        contact.email = email;
    }
}
