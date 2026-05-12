package org.example.model;

public  class Empleado extends Persona{

    //clase sin implementación. Unicamente está para proyectar en un futuro, roles que se le pueden
    //dar a los empledos.

    private String idEmpleado;
    private int antiguedad;
    private PuestoTrabajo puestoTrabajo;

    public Empleado(String dni, String celular, String mail, String idEmpleado, int antiguedad, PuestoTrabajo puestoTrabajo){
        super(dni, celular,mail);
        this.idEmpleado = idEmpleado;
    }

    //getters

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public PuestoTrabajo getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    //setters

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setPuestoTrabajo(PuestoTrabajo puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return String.format("EMPLEADO | %s | Puesto: %-10s",
                super.toString(), puestoTrabajo);
    }


}
