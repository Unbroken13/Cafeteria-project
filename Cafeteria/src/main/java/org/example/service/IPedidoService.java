package org.example.service;

import org.example.model.Cliente;
import org.example.model.Pedido;

import java.util.List;

public interface IPedidoService {

    Pedido crearPedido(Cliente cliente);

    void guardarPedido(Pedido pedido);

    List<Pedido> obtenerTodos();

    double calcularRecaudacionTotal();



}
