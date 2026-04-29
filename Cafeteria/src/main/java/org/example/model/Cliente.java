package org.example.model;

public class Cliente extends Persona{

    private String idCliente;

    public Cliente(String dni, String celular, String mail, String idCliente){
        super(dni, celular,mail);
        this.idCliente = idCliente;
    }


}
