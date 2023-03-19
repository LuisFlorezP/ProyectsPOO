package org.example;

public class Grupo3 extends Venta{

    public Grupo3() {
    }

    public Grupo3(double precio) {
        super(precio);
        this.setDescuento(0.025);
    }

    @Override
    public double totalApagar() {
        return 0;
    }
}
