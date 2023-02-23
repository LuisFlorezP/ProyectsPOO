package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lefrontend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite la cantidad de productos: ");
        Integer cantidadProductos = sc.nextInt();
        System.out.println("La cantidad fue: " + cantidadProductos);

        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        LocalDate fecha2 = LocalDate.of(2023, 2, 24);
        System.out.println(fecha2);

        Long diferenciaEntreFechas = ChronoUnit.DAYS.between(fecha, fecha2);
        System.out.println("Diferencia de fechas: " + diferenciaEntreFechas);
    }
}
