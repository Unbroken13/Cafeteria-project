package org.example.service;

import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto product){
        this.productos.add(product);
    }

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

    public Producto buscarProductoPorID (int idBuscado){


        for(Producto p: productos){

            if (p.getId() == idBuscado ){
                return  p;
            }
        }

        return null;
    }

    public void actualizarStock(int id, int cantidadDiferencial){
        Producto p = buscarProductoPorID(id);

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

}
