package org.example;

public class Grupo1 extends Venta{

    public Grupo1() {
    }

    public Grupo1(double precio) {
        super(precio);
        this.setDescuento(0.1);
    }

    @Override
    public double totalApagar() {
        return 0;
    }
}
