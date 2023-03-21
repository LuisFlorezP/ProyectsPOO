package org.example;

public class Grupo4 extends Venta{

    public Grupo4() {
    }

    public Grupo4(double precio) {
        super(precio);
        this.setDescuento(0);
    }

    @Override
    public double totalApagar() {
        return (this.getPrecio());
    }
}
