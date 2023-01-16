package com.example.information;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class PublicInformationProvider implements InformationProvider {
    @Override
    public String getInformation() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("FactoryMethod\\ImplementationQuestion21\\src\\publico.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo publico.txt");
        }
        return sb.toString();
    }
}