package com;

import com.contact.builder.CompleteContactBuilder;
import com.contact.builder.ContactBuilder;
import com.contact.builder.InternetContactBuilder;
import com.contact.builder.PhoneContactBuilder;
import com.contact.contact.Contact;
import com.contact.director.Director;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        ContactBuilder internetBuilder = new InternetContactBuilder();
        ContactBuilder phoneBuilder = new PhoneContactBuilder();
        ContactBuilder completeBuilder = new CompleteContactBuilder();

        // Build internet contact
        director.setBuilder(internetBuilder);
        director.buildInternetContact("Carlos", "carlos@gmail.com");
        Contact internetContact = director.getContact();
        System.out.println(internetContact);

        // Build phone contact
        director.setBuilder(phoneBuilder);
        director.buildPhoneContact("Eduardo", "(31) 3830-0218");
        Contact phoneContact = director.getContact();
        System.out.println(phoneContact);

        // Build complete contact
        director.setBuilder(completeBuilder);
        director.buildContact("Bruno", "222 Rua das Flores", "(31) 3765-1399", "bruno@hotmail.com");
        Contact completeContact = director.getContact();
        System.out.println(completeContact);
    }
}

