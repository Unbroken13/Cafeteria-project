package org.example;

import org.example.model.*;
import org.example.service.IPedidoService;
import org.example.service.IProductoService;
import org.example.service.PedidoServiceImpl;
import org.example.service.ProductoServiceImpl;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IProductoService productoService = ProductoServiceImpl.getInstancia();
        IPedidoService pedidoService = PedidoServiceImpl.getInstancia();

        cargarInventarioInicial(productoService);
        Scanner leer = new Scanner(System.in);




        System.out.println("**********Bienvenido a Cafeteria TalentoTech**********");
        System.out.println("--- REGISTRO DE CLIENTE ---");
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese su DNI: ");
        String dni = leer.nextLine();

        System.out.print("Ingrese su mail: ");
        String mail = leer.nextLine();

        Cliente cliente1 = new Cliente(dni, nombre, mail);


        int opcion = 0;

        do{
            System.out.println("\\n--- SISTEMA DE CAFETERÍA ---");
            System.out.println("1. Ver Inventario");
            System.out.println("2. Crear Nuevo Pedido");
            System.out.println("3. Ver Historial de Ventas");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    productoService.mostrarProductos();
                    break;
                case 2:
                    Pedido nuevoPedido = pedidoService.crearPedido(cliente1);
                    int idProducto= 0;

                    do {
                        System.out.println("\n--- Agregando productos al pedido ---");
                        productoService.mostrarProductos(); // Mostramos para que el usuario vea los IDs
                        System.out.print("Ingrese el ID del producto (o 0 para finalizar): ");
                        idProducto = leer.nextInt();

                        if (idProducto != 0){
                            Producto pEncontrado = productoService.buscarProductoPorId(idProducto);
                            System.out.print("Ingrese la cantidad que desea llevar: ");
                            int cantidad = leer.nextInt(); // <--- Aquí nace la variable 'cantidad'
                            if (pEncontrado.getStock() >= cantidad){
                                // Restamos del inventario
                                nuevoPedido.agregarProductos(pEncontrado, cantidad);
                                productoService.actualizarStock(idProducto, cantidad);
                                System.out.println("Agregado con éxito.");
                            } else {
                                System.out.println("Error: No hay suficiente stock. Disponible: " + pEncontrado.getStock());
                            }

                        }


                    } while (idProducto != 0); // <--- ESTO ES LO QUE TE FALTA

                    // 6. Al salir del bucle, guardamos el pedido
                    pedidoService.guardarPedido(nuevoPedido);
                    System.out.println("Pedido guardado con éxito.");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("\n========= HISTORIAL DE VENTAS =========");
                    List<Pedido> ventas = pedidoService.obtenerTodos();

                    if (ventas.isEmpty() ){
                        System.out.println("Aún no se han realizado ventas.");
                    } else {
                        for (Pedido p: ventas){
                            System.out.println("---------------------------------------");
                            System.out.println("Pedido N°: " + p.getIdPedido() + " | Cliente: " + p.getNombreCliente() );

                            System.out.println("Productos: ");
                            for (DetallePedido detalles: p.getDetallesDeLosPedidos()){
                                System.out.printf("  -" + detalles.getProducto().getNombre() +
                                        " (x" + detalles.getCantidad() + ") $" + (detalles.getProducto().getPrecio() * detalles.getCantidad())  );
                            }

                            // Aquí podrías mostrar los detalles o simplemente el total
                            System.out.println("TOTAL DEL TICKET: $" + p.calcularTotal());
                        }

                        // recaudación total de la caja
                        double recaudacion = pedidoService.calcularRecaudacionTotal();
                        System.out.println("\n>>> RECAUDACIÓN TOTAL DEL DÍA: $" + recaudacion);
                        System.out.println("=======================================");

                    }

                    break;
            }

        }
        while (opcion != 4);



        }

    private static void cargarInventarioInicial(IProductoService service) {
        service.agregarProducto(new Bebida("Café Espresso", TamanioBebida.CHICO, 1000, true, 10));
        service.agregarProducto(new Bebida("Capuchino", TamanioBebida.MEDIANO, 1500, true, 10));
        service.agregarProducto(new Bebida("Agua Mineral", TamanioBebida.MEDIANO, 850, false, 10));
        service.agregarProducto(new Comida("Medialuna de Manteca", 500.0, false, true, false, 10));
        service.agregarProducto(new Comida("Tostado de Jamón y Queso", 2500.0, false, false, false, 10));

        System.out.println(">>> Inventario precargado con éxito.");
    }



    }


