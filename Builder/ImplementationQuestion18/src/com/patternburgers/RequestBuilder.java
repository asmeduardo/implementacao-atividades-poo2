package com.patternburgers;
import java.util.HashSet;
import java.util.Set;

public class RequestBuilder {
    private Set<String> insideOfBox = new HashSet<String>();
    private Set<String> outOfBox = new HashSet<String>();

    public RequestBuilder addInsideBox(String item) {
        insideOfBox.add(item);
        return this;
    }

    public RequestBuilder addOutOfBox(String item) {
        outOfBox.add(item);
        return this;
    }

    public Request build() {
        return new Request(insideOfBox, outOfBox);
    }
    
}