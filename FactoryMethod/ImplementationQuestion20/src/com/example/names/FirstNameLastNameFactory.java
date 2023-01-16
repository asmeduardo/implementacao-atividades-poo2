package com.example.names;

public class FirstNameLastNameFactory extends NameFactory {
    @Override
    public Name createName(String name) {
        String[] parts = name.split(" ");
        return new Name(parts[0], parts[1]);
    }
}
