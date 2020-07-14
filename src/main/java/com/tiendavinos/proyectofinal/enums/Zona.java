package com.tiendavinos.proyectofinal.enums;

public enum Zona {

    VALLE_DE_UCO("Valle de Uco"), LUJAN_DE_CUYO("Luján de Cuyo"), ZONA_ESTE("Zona este");

    private final String nombre;

    private Zona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
