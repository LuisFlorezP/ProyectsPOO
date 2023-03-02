package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lefrontend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* System.out.print("Digite la cantidad de productos: ");
        Integer cantidadProductos = sc.nextInt();
        System.out.println("La cantidad fue: " + cantidadProductos);

        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        LocalDate fecha2 = LocalDate.of(2023, 2, 24);
        System.out.println(fecha2);

        Long diferenciaEntreFechas = ChronoUnit.DAYS.between(fecha2, fecha);
        System.out.println("Diferencia de fechas: " + diferenciaEntreFechas); */

        JuiceCoctel coctel1 = new JuiceCoctel("Bebesitaaa", 250000L, LocalDate.of(2023, 3, 5));

        /* System.out.println(coctel1.getFechaVencimiento());
        System.out.println(coctel1.getFechaCreacion());
        System.out.println(ChronoUnit.DAYS.between(coctel1.getFechaVencimiento(), coctel1.getFechaCreacion())); */

        System.out.println("Total a pagar por el producto " + coctel1.getNombre() + ": $" + coctel1.calcularCosto(5));
    }
}
