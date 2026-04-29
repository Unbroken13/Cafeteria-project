package org.example.model;

public  class Empleado extends Persona{

    private String idEmpleado;
    private int antiguedad;
    private PuestoTrabajo puestoTrabajo;

    public Empleado(String dni, String celular, String mail, String idEmpleado, int antiguedad, PuestoTrabajo puestoTrabajo){
        super(dni, celular,mail);
        this.idEmpleado = idEmpleado;
    }



}
