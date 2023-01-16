package com.contact.builder;

import com.contact.contact.internet.InternetContact;

public class InternetContactBuilder extends ContactBuilder {
    public InternetContactBuilder() {
        contact = new InternetContact();
    }

    public void setAddress(String address) {
        // Internet contact does not have address
    }

    public void setPhone(String phone) {
        // Internet contact does not have phone
    }

    public void setEmail(String email) {
        contact.email = email;
    }
}
