package org.example;

public class Shot extends Coctel {

    private String tipoLicor;

    public Shot() {
    }

    public Shot(String nombre, Long precioUnitario, String tipoLicor) {
        super(nombre, precioUnitario);
        this.tipoLicor = tipoLicor;
    }

    public Long calcularCosto(Long precioUnitario, int cantidad) {
        return precioUnitario * cantidad;
    }

    public Long calcularCosto2(int cantidad) {
        return this.getPrecioUnitario() * cantidad;
    }
}
