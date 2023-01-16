package com.example.incremental;

public class Incremental {
    private static int count = 0;
    private static Incremental singleton;

    private Incremental() {
    }

    public static Incremental getInstancia() {
        ++count;
        if (singleton == null) {
            singleton = new Incremental();
        }
        return singleton;
    }

    public String toString() {
        return "Incremental " + count;
    }

}