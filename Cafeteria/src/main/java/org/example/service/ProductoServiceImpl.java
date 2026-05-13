package org.example.service;

import org.example.exception.ProductoNoEncontradoException;
import org.example.exception.StockInsuficienteException;
import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements IProductoService {

    private static ProductoServiceImpl instancia;

    private List<Producto> productos;

    private ProductoServiceImpl(){
        this.productos = new ArrayList<>();
    }

    //métodos

    public static ProductoServiceImpl getInstancia(){
        //si no existe una instancia de Inventario, entonces la inicializamos.
        if (instancia == null){
            instancia = new ProductoServiceImpl();
        }
        //si existe una instancia previa de Inventario, solamente la devolvemos.
        return instancia;
    }

    @Override
    public void agregarProducto(Producto product){
        this.productos.add(product);
    }

    @Override
    public void mostrarProductos(){
        if ( productos.isEmpty() ){
            System.out.println("No hay productos disponibles.");
        }
        else {
//            for (int i = 0; i < productos.size() ; i++) {
//                System.out.println(productos.get(i));
//            }
            for (Producto p: productos){
                System.out.println(p);
            }
        }

    }

    @Override
    public Producto buscarProductoPorId(int idBuscado) throws ProductoNoEncontradoException {
        for(Producto p: productos){

            if (p.getId() == idBuscado ){
                return  p;
            }
        }

        throw new ProductoNoEncontradoException("El producto con ID " + idBuscado + " no existe en el catálogo.");
    }

    @Override
    public void actualizarStock(int id, int cantidadDiferencial) throws ProductoNoEncontradoException, StockInsuficienteException {
        Producto p = buscarProductoPorId(id); //buscarProductoPorId ya lanza ProductoNoEncontradoException, no es necesario validar si se encuentra el producto.

        int nuevoStock = p.getStock() + cantidadDiferencial;

        if (nuevoStock < 0){
            throw new StockInsuficienteException("Error: No hay suficiente stock para " + p.getNombre() +
                                                ". Disponible: " + p.getStock() +
                                                ", Solicitado: " + Math.abs(cantidadDiferencial));
        }

        p.setStock(nuevoStock);

    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }


}
