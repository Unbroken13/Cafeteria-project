package org.example.model;

public abstract class Persona {

    private String dni;
    private String celular;
    private String mail;

    public Persona(String dni, String celular, String mail){
        this.dni = dni;
        this.celular = celular;
        this.mail = mail;
    }

    //getter

    public String getDni() {
        return dni;
    }

    public String getCelular() {
        return celular;
    }

    public String getMail() {
        return mail;
    }

    //setter


    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
