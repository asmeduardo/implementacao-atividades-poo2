package com.example.names;

public class LastNameFirstNameFactory extends NameFactory {
    @Override
    public Name createName(String name) {
        String[] parts = name.split(", ");
        return new Name(parts[1], parts[0]);
    }
}