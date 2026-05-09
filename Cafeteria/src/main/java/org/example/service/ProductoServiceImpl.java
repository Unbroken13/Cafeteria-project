package org.example.service;

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
    public Producto buscarProductoPorId(int idBuscado){


        for(Producto p: productos){

            if (p.getId() == idBuscado ){
                return  p;
            }
        }

        return null;
    }

    @Override
    public void actualizarStock(int id, int cantidadDiferencial){
        Producto p = buscarProductoPorId(id);

        if(p != null){
            int nuevoStock = p.getStock() + cantidadDiferencial;
            if (nuevoStock >= 0){
                p.setStock(nuevoStock);
            } else {
                System.out.println("Error:No hay suficiente stock");
            }
        } else {
            System.out.println("Error: Producto no encontrado. No se puede actualizar stock.");
        }
    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }


}
