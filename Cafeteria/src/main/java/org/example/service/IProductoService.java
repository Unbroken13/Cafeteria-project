package org.example.service;

import org.example.exception.ProductoNoEncontradoException;
import org.example.exception.StockInsuficienteException;
import org.example.model.Producto;

public interface IProductoService {

    //interface para el CRUD

    void agregarProducto(Producto product);

    void mostrarProductos();

    Producto buscarProductoPorId(int idBuscado) throws ProductoNoEncontradoException;

    void actualizarStock(int id, int cantidadDiferencial) throws StockInsuficienteException;

    void eliminarProducto(int id);





}
