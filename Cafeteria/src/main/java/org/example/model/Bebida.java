package org.example.model;

public class Bebida extends Producto{

    private TamanioBebida tamanio;
    private boolean esCaliente;

    public Bebida(String nombre,TamanioBebida tamanio, double precio,boolean esCaliente, int stock){
        super(nombre, stock, precio);
        this.tamanio = tamanio;
        this.esCaliente = esCaliente;
    }

    //getters

    public TamanioBebida getTamanio() {
        return tamanio;
    }

    public boolean isEsCaliente() {
        return esCaliente;
    }


    //setters
    public void setTamanio(TamanioBebida tamanio) {
        this.tamanio = tamanio;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }


    @Override
    public String toString() {
        return  super.toString() +
                "Bebida{" +
                "tamanio=" + tamanio +
                ", esCaliente=" + esCaliente +
                '}';
    }
}
