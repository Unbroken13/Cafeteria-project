package org.example.model;

public enum TamanioBebida {

     CHICO("Chico"),
     MEDIANO("Mediano"),
     GRANDE("Grande");

    private String descripcion;

    TamanioBebida(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
