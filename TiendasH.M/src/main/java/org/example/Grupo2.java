package org.example;

public class Grupo2 extends Venta{

    public Grupo2() {
    }

    public Grupo2(double precio) {
        super(precio);
        this.setDescuento(0.05);
    }

    @Override
    public double totalApagar() {
        return 0;
    }
}
