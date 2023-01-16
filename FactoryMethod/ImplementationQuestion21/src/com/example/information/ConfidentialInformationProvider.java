package com.example.information;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ConfidentialInformationProvider implements InformationProvider {
    @Override
    public String getInformation() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("FactoryMethod\\ImplementationQuestion21\\src\\confidencial.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo confidencial.txt");
        }
        return sb.toString();
    }
}