package com.patternburgers;
import java.util.Set;

public class Request {
    private Set<String> insideOfBox;
    private Set<String> outOfBox;

    public Request(Set<String> insideOfBox, Set<String> outOfBox) {
        this.insideOfBox = insideOfBox;
        this.outOfBox = outOfBox;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Seu pedido : \n");
        sb.append("Dentro da caixa: \n");
        for (String item : insideOfBox)
            sb.append(item + "\n");
        sb.append("\nFora da caixa:\n");
        for (String item : outOfBox)
            sb.append(item + "\n");
        sb.append("\nTenha um bom dia!\n");
        return sb.toString();
    }

}