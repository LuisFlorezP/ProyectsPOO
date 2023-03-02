package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    public Long calcularCosto(int cantidad) {
        Long diferenciaDias = ChronoUnit.DAYS.between(this.getFechaCreacion(), this.getFechaVencimiento());
        Long costoNormal = this.getPrecioUnitario() * cantidad;
        Long costoDefinitivo = 0L;
        if (diferenciaDias == 1L) {
            System.out.println("El producto " + getNombre() + " lleva 1 día de creado.");
            costoDefinitivo = (long) (costoNormal - (0.5 * costoNormal));
        } else if (diferenciaDias == 2L) {
            System.out.println("El producto " + getNombre() + " lleva 2 día de creado.");
        } else if (diferenciaDias == 3L) {
            System.out.println("El producto " + getNombre() + " lleva 3 día de creado.");
            costoDefinitivo = costoNormal - 2 * costoNormal;
        } else {
            System.out.println("El producto " + getNombre() + " lleva no se puede vender.");
        }

        return costoDefinitivo;
    }
}
