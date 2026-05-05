package org.example.model;

public class Comida extends Producto{

    private boolean esAptaVegetariano;
    private boolean esAptaCeliaco;
    private boolean esAptaVegano;

    public Comida(String nombre, double precio, boolean esAptaVegetariano, boolean esAptaCeliaco, boolean esAptaVegano , int stock){
        super(nombre, stock, precio);
        this.esAptaVegetariano = esAptaVegetariano;
        this.esAptaCeliaco = esAptaCeliaco;
        this.esAptaVegano = esAptaVegano;
    }

    //getters
    public boolean isEsAptaVegetariano() {
        return esAptaVegetariano;
    }

    public boolean isEsAptaVegano() {
        return esAptaVegano;
    }

    public boolean isEsAptaCeliaco() {
        return esAptaCeliaco;
    }

    //setters
    public void setEsAptaVegetariano(boolean esAptaVegetariano) {
        this.esAptaVegetariano = esAptaVegetariano;
    }

    public void setEsAptaCeliaco(boolean esAptaCeliaco) {
        this.esAptaCeliaco = esAptaCeliaco;
    }

    public void setEsAptaVegano(boolean esAptaVegano) {
        this.esAptaVegano = esAptaVegano;
    }
}
