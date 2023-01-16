package com.example.information;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a senha: ");
        String password = sc.next();

        InformationProvider provider = InformationProviderFactory.getProvider(password);
        String information = provider.getInformation();
        System.out.println(information);

        sc.close();
    }

}