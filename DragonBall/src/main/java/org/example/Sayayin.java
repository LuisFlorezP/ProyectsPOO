package org.example;

public abstract class Sayayin {

    private String nombre;
    private Integer poderPelea;
    protected Integer edad;
    private String colorPelo;

    public Sayayin() {
    }

    public Sayayin(String nombre, Integer poderPelea, Integer edad, String colorPelo) {
        this.nombre = nombre;
        this.poderPelea = poderPelea;
        this.edad = edad;
        this.colorPelo = colorPelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoderPelea() {
        return poderPelea;
    }

    public void setPoderPelea(Integer poderPelea) {
        this.poderPelea = poderPelea;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void comer() {
        System.out.println("Hola soy sayayin y como mucho.");
    }

    public abstract void pelea();

    @Override
    public String toString() {
        return "Sayayin{" +
                "nombre='" + nombre + '\'' +
                ", poderPelea=" + poderPelea +
                ", edad=" + edad +
                ", colorPelo='" + colorPelo + '\'' +
                '}';
    }
}
