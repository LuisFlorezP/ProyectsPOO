package org.example;

public class PlanetaSayayin {
    public static void main(String[] args) {
        ClaseAlta guerrero1 = new ClaseAlta("Vegget", 52, 100, "Negro");
        ClaseBaja guerrero2 = new ClaseBaja("Goku", 77, 80, "Negro");

        System.out.println(guerrero1);
        guerrero1.pelea();
        System.out.println(guerrero2);
        guerrero2.pelea();
    }
}
