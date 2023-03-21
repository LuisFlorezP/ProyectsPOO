package org.example;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        Grupo1 venta1 = new Grupo1(2000000);
        Grupo2 venta2 = new Grupo2(700000);
        Grupo3 venta3 = new Grupo3(250000);
        Grupo4 venta4 = new Grupo4(100000);

        System.out.println(MessageFormat.format("Total a pagar en la primer venta: ${0}.", venta1.totalApagar()));
        System.out.println(MessageFormat.format("Total a pagar en la segunda venta: ${0}.", venta2.totalApagar()));
        System.out.println(MessageFormat.format("Total a pagar en la tercer venta: ${0}.", venta3.totalApagar()));
        System.out.println(MessageFormat.format("Total a pagar en la cuarta venta: ${0}.", venta4.totalApagar()));
    }
}