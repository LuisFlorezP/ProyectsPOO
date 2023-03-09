package org.example;

public class ClaseAlta extends Sayayin {

    public ClaseAlta() {
    }

    public ClaseAlta(String nombre, Integer poderPelea, Integer edad, String colorPelo) {
        super(nombre, poderPelea, edad, colorPelo);
    }

    @Override
    public void pelea() {
        System.out.println(String.format("%s pelea con elegancia", this.getNombre()));
    }
}
