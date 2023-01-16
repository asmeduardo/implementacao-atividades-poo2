package com.contact.contact.phone;

import com.contact.contact.Contact;

public class PhoneContact extends Contact {
    protected String phone;

    @Override
    public String toString() {
        return super.toString() + ", Phone: " + phone;
    }
}

