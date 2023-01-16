package com.example.names;

public abstract class NameFactory {
    public abstract Name createName(String name);

    public static NameFactory getNameFactory(String name) {
        if (name.contains(",")) {
            return new LastNameFirstNameFactory();
        } else {
            return new FirstNameLastNameFactory();
        }
    }
}