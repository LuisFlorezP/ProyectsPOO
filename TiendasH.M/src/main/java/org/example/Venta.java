package org.example;

public abstract class Venta {

    private double precio;
    private double descuento;

    public Venta() {
    }

    public Venta(double precio, double descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }

    public Venta(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public abstract double totalApagar();
}
