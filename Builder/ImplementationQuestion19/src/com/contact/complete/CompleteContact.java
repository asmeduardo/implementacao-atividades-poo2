package com.contact.complete;

import com.contact.contact.Contact;

public class CompleteContact extends Contact {
    protected String address;
    protected String phone;
    protected String email;

    @Override
    public String toString() {
        return super.toString() + ", Endereço: " + address + ", Telefone: " + phone + ", Email: " + email;
    }
}
