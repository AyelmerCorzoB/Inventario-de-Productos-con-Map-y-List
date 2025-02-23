package com.ejercicio3;

public class ValidacionException extends Exception {
    public ValidacionException(String mensaje) {
        super(mensaje);
    }
    public ValidacionException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}