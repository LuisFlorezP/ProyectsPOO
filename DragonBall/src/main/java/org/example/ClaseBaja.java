package org.example;

import java.text.MessageFormat;

public class ClaseBaja extends Sayayin {

    public ClaseBaja() {
    }

    public ClaseBaja(String nombre, Integer poderPelea, Integer edad, String colorPelo) {
        super(nombre, poderPelea, edad, colorPelo);
    }

    @Override
    public void pelea() {
        System.out.println(MessageFormat.format("{0} pelea con el corazón.", this.getNombre()));
    }
}
