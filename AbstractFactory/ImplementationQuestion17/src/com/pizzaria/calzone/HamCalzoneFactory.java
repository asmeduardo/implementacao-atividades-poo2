package com.pizzaria.calzone;

public class HamCalzoneFactory implements CalzoneFactory {
    public Calzone createCalzone() {
        return new HamCalzone();
    }
}