package org.example.service;

import org.example.model.Producto;

public interface IProductoService {

    //interface para el CRUD

    void agregarProducto(Producto product);

    void mostrarProductos();

    Producto buscarProductoPorId(int idBuscado);

    void actualizarStock(int id, int cantidadDiferencial);

    void eliminarProducto(int id);





}
