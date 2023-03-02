package org.example;

import java.time.LocalDate;

public class JuiceCoctel extends Coctel {

    private LocalDate fechaVencimiento;
    private LocalDate fechaCreacion;

    public JuiceCoctel() {
        this.fechaCreacion = LocalDate.now();
    }

    public JuiceCoctel(String nombre, Long precioUnitario, LocalDate fechaVencimiento) {
        super(nombre, precioUnitario);
        this.fechaVencimiento = fechaVencimiento;
        this.fechaCreacion = LocalDate.now();
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
