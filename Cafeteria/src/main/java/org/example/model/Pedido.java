package org.example.model;

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


}
