package org.example.model;

public abstract class Persona {

    private String dni;
    private String nombre;
    private String mail;

    public Persona(String dni, String nombre, String mail){
        this.dni = dni;
        this.nombre = nombre;
        this.mail = mail;
    }

    public Persona(){};

    //getter

    public String getDni() {
        return dni;
    }

    public String getnombre() {
        return nombre;
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

    public void setnombre(String celular) {
        this.nombre = celular;
    }
}
