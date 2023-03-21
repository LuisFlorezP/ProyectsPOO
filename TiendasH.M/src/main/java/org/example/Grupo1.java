package org.example;

public class Grupo1 extends Venta{

    public Grupo1() {
        this.setDescuento(0.1);
    }

    public Grupo1(double precio) {
        super(precio);
        this.setDescuento(0.1);
    }

    @Override
    public double totalApagar() {
        double total = this.getPrecio();
        int cantidadDescuentos = 0;

        while (total >= 1000000) {
            total -= 1000000;
            cantidadDescuentos++;
        }

        return (this.getPrecio() - (this.getPrecio() * cantidadDescuentos * this.getDescuento()));
    }
}
