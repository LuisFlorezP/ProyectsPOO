package org.example;

public class Shot extends Coctel {

    private String tipoLicor;

    public Shot() {
    }

    public Shot(String nombre, Long precioUnitario, String tipoLicor) {
        super(nombre, precioUnitario);
        this.tipoLicor = tipoLicor;
    }
}
