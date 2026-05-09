package org.example.service;

import org.example.model.Cliente;
import org.example.model.Pedido;

import java.util.List;

public class PedidoServiceImpl implements IPedidoService{

    private static PedidoServiceImpl instancia;
    private List<Pedido> historialPedidos; // "Base de Datos" de ventas

    public static PedidoServiceImpl getInstancia() {
        if (instancia == null) {
            instancia = new PedidoServiceImpl();
        }
        return instancia;
    }


    @Override
    public Pedido crearPedido(Cliente cliente) {
        return new Pedido(cliente);
    }

    @Override
    public void guardarPedido(Pedido pedido) {
        historialPedidos.add(pedido) ;
    }

    @Override
    public List<Pedido> obtenerTodos() {
        return historialPedidos;
    }

    @Override
    public double calcularRecaudacionTotal() {
        double total = 0;
        for (Pedido p : historialPedidos) {
            total += p.calcularTotal();
        }
        return total;
    }
}


