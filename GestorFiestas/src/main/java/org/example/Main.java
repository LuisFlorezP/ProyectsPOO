package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dato1;
        Scanner sc = new Scanner(System.in);

        dato1 = sc.nextInt();

        Invitado objeto = new Invitado(10, true, "Luis", 4.5);
        Invitado objeto2 = new Invitado(dato1, false, "Luis", 4.5);
        System.out.println(objeto.dato2);
        System.out.println(objeto2.dato1);
    }
}