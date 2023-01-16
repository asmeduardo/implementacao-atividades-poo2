package com.contact.contact.internet;

import com.contact.contact.Contact;

public class InternetContact extends Contact {
    protected String email;

    @Override
    public String toString() {
        return super.toString() + ", Email: " + email;
    }
}
