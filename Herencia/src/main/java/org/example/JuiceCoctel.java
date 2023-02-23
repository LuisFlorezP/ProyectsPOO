package org.example;

import java.time.LocalDate;

public class JuiceCoctel extends Coctel {

    private LocalDate fechaVencimiento;

    public JuiceCoctel() {
    }

    public JuiceCoctel(String nombre, Long precioUnitario, LocalDate fechaVencimiento) {
        super(nombre, precioUnitario);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
