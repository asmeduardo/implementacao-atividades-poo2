package com.example.information;

public class InformationProviderFactory {
    public static InformationProvider getProvider(String password) {
        if (password.equals("designpatterns")) {
            return new ConfidentialInformationProvider();
        } else {
            return new PublicInformationProvider();
        }
    }
}