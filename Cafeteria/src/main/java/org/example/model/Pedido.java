package org.example.model;

import org.example.service.IPedidoService;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    //atributo statico, para que IdPedido sea un atributo de CLASE, y cada pedido
    //tengo un id único.
    private static int contadorIdPedidos;

    private int idPedido;
    private List<DetallePedido> detallesDeLosPedidos;
    private Cliente cliente;


    public Pedido(Cliente cliente ){
        this.idPedido = ++Pedido.contadorIdPedidos;
        this.cliente = cliente;
        this.detallesDeLosPedidos = new ArrayList<>();

    }

    //agregamos
    public void agregarProductos(Producto prod, int cantidad){
        // recibo un producto y la cantidad que se ordeno de ese producto.

        //con esa informacion (producto y cantidad), creo una instancia de
        //Detalle producto, y luego lo agrego a la lista de DetallesPedido.
        this.detallesDeLosPedidos.add( new DetallePedido(prod, cantidad) );
    }


    //calcularTotal
    public double calcularTotal(){
        double totalAcumulado = 0;

        for (DetallePedido det:  detallesDeLosPedidos) {
            //sumamos los subtotales en cada vuelta
           totalAcumulado += det.calcularSubtotal();
        }
        return totalAcumulado;
    }


    public int getIdPedido() {
        return idPedido;
    }

    public String getNombreCliente() {
        return cliente.getNombre();
    }

    public List<DetallePedido> getDetallesDeLosPedidos() {
        return detallesDeLosPedidos;
    }

    @Override
    public String toString() {
        String ticket = "\n==========================================\n";
        ticket += "           CAFETERÍA TALENTO TECH         \n";
        ticket += "==========================================\n";


        ticket += String.format("Ticket N°: %04d \n", idPedido);
        ticket += "Cliente: " + cliente.getNombre() + " (DNI: " + cliente.getDni() + ")\n";
        ticket += "------------------------------------------\n";

        ticket += String.format("%-25s %-5s %-10s\n", "Producto", "Cant", "Subtotal");


        for (DetallePedido detalle : detallesDeLosPedidos) {
            String nombreProd = detalle.getProducto().getNombre();
            int cant = detalle.getCantidad();
            double subtotal = detalle.getProducto().getPrecio() * cant;

            // Vamos sumando cada línea al ticket existente
            ticket += String.format("%-25s x%-4d $%-9.2f\n",
                    nombreProd, cant, subtotal);
        }

        ticket += "------------------------------------------\n";
        ticket += String.format("TOTAL A PAGAR:               $%-9.2f\n", calcularTotal());
        ticket += "==========================================\n";
        ticket += "       ¡Gracias por su compra!            \n";

        return ticket;
    }



}
