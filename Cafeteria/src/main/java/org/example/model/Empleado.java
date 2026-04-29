package org.example.model;

public  class Empleado extends Persona{

    private String idEmpleado;
    private int antiguedad;
    private String puestoTrabajo;

    public Empleado(String dni, String celular, String mail, String idEmpleado, int antiguedad, String puestoTrabajo){
        super(dni, celular,mail);
        this.idEmpleado = idEmpleado;
    }

}
