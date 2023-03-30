package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0] = 3;
        System.out.println(numeros[0]);

        ArrayList<Integer> numeritos = new ArrayList<Integer>();
        numeritos.add(20);
        System.out.println(numeritos.get(0));
    }
}