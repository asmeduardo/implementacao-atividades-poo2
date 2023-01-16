package com.example.names;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Name> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um nome (digite 'q' para sair): ");
            String input = sc.nextLine();
            if (input.equals("q")) {
                break;
            }
            NameFactory factory = NameFactory.getNameFactory(input);
            Name name = factory.createName(input);
            names.add(name);
        }

        for (Name name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}