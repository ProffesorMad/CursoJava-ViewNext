package com.cursojava.utilidades;

public class Pesetas {
    private static final double CAMBIO_EURO_PESETA = 166.386;

    public static double eurosAPesetas(double euros) {
        return euros * CAMBIO_EURO_PESETA;
    }

    public static double pesetasAEuros(double pesetas) {
        return pesetas / CAMBIO_EURO_PESETA;
    }
}


