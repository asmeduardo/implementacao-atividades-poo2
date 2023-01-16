package com.patternburgers;
public class Client {
    public static void main(String[] args) {
        RequestBuilder requestBuilder = new RequestBuilder();
        Request request = requestBuilder.addInsideBox("Hamburger")
                .addInsideBox("Batatinha")
                .addInsideBox("Carrinho")
                .addOutOfBox("Coca")
                .build();
        System.out.println(request);
    }

}
