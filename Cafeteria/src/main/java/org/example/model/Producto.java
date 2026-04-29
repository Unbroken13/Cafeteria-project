package org.example.model;

public class Producto {

    private String nombre;
    private int id;
    private int stock;
    private double precio;
    private static int contadorId;

    public Producto(String nombre, int stock, double precio){
        this.nombre = nombre;
        this.id = ++Producto.contadorId;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



}
