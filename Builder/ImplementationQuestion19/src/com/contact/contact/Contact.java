package com.contact.contact;

public abstract class Contact {
    public String name;
    public String address;
    public String phone;
    public String email;

    @Override
    public String toString() {
        return "Name: " + name + " Endereço: " + address + " Telefone: " + phone + " Email: " + email;
    }
}
