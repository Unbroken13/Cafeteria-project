package org.example.model;

public enum PuestoTrabajo {

    BARISTA("Barista"),
    CAJERO("Cajero"),
    MESERO("Mesero"),
    SUPERVISOR("Supervisor");

    private String descripcion;

    PuestoTrabajo(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

}
