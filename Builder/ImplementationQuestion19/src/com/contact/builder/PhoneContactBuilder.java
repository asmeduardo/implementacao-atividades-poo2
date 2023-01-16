package com.contact.builder;

import com.contact.contact.phone.PhoneContact;

public class PhoneContactBuilder extends ContactBuilder {
    public PhoneContactBuilder() {
        contact = new PhoneContact();
    }

    public void setAddress(String address) {
        // Phone contact does not have address
    }

    public void setPhone(String phone) {
        contact.phone = phone;
    }

    public void setEmail(String email) {
        // Phone contact does not have email
    }
}
