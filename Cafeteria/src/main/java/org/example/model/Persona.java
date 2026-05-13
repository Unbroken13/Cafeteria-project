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

    public String getNombre() {
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

    @Override
    public String toString() {
        return String.format("Nombre: %-15s | DNI: %-10s | Mail: %-20s",
                            nombre, dni, mail);
    }
}
