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
        double total = this.getPrecio();
        int cantidadDescuentos = 0;

        while (total >= 500000) {
            total -= 500000;
            cantidadDescuentos++;
        }

        return (this.getPrecio() - (this.getPrecio() * cantidadDescuentos * this.getDescuento()));
    }
}
