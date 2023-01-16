package com.pizzaria.calzone;

public class PepperoniCalzoneFactory implements CalzoneFactory {
    public Calzone createCalzone() {
        return new PepperoniCalzone();
    }
}