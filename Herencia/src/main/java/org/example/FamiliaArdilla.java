package org.example;

public class FamiliaArdilla {
    public static void main(String[] args) {
        Padre padre = new Padre();
        padre.setNombre("Chape");
        padre.setFortuna(150L);

        Hijo hijo = new Hijo();
        hijo.setNombre("Andres");
        hijo.setFortuna(300L);

        System.out.println("El nombre del papa es " +
                padre.getNombre() + " " + padre.getApellido() +
                    " y su fortuna es de $" + padre.getFortuna());
        System.out.println("El nombre del hijo es " +
                hijo.getNombre() + " " + hijo.getApellido() +
                    " y su fortuna es de $" + hijo.getFortuna());
    }
}
