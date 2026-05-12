package org.example.model;

public class Cliente extends Persona{

    private int idCliente;

    private static int contadorIdCliente;

    public Cliente(String dni, String celular, String mail){
        super(dni, celular,mail);
        this.idCliente = ++Cliente.contadorIdCliente;
    }


    //getters

    public int getIdCliente() {
        return idCliente;
    }

    //setters

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
