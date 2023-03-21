package org.example;

public class Grupo3 extends Venta{

    public Grupo3() {
        this.setDescuento(0.025);
    }

    public Grupo3(double precio) {
        super(precio);
        this.setDescuento(0.025);
    }

    @Override
    public double totalApagar() {
        double total = this.getPrecio();
        int cantidadDescuentos = 0;

        while (total >= 200000) {
            total -= 200000;
            cantidadDescuentos++;
        }

        return (this.getPrecio() - (this.getPrecio() * cantidadDescuentos * this.getDescuento()));
    }
}
