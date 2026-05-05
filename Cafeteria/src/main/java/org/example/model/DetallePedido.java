package org.example.model;

public class DetallePedido {

    private Producto producto;
    private int cantidad;
    private double precioVenta;

    public DetallePedido(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;

        //capturamos el precio actual de ese producto, utilizando el metodo propio de Prudcto.
        this.precioVenta = producto.getPrecio();
    }

    //métodos

    public double calcularSubtotal(){
        double subtotal = 0;
        if (cantidad > 0){
            subtotal = this.precioVenta * cantidad;
        }
        return subtotal;
    }




    //getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
    //setters
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
