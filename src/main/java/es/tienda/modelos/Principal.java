package es.tienda.modelos;

import java.util.ArrayList;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Proovedor> proveedores = new ArrayList<>();
        ArrayList<Articulo> articulos = new ArrayList<>();

        String nombre, empresa, descripcion;
        double precio;

        System.out.println("=== INTRODUCIR CLIENTES ===");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nombre del cliente: ");
            nombre = Entrada.cadena();

            clientes.add(new Cliente(nombre)); // no reconoce Cliente()
        }

        System.out.println("\n=== INTRODUCIR PROVEEDORES ===");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre del proveedor: ");
            nombre = Entrada.cadena();

            System.out.print("Empresa: ");
            empresa = Entrada.cadena();

            proveedores.add(new Proovedor(nombre, empresa)); // me pide 4 argumentos pero no se cuales son
        }

        System.out.println("\n=== INTRODUCIR ARTÍCULOS ===");
        for (int i = 0; i < 2; i++) {
            System.out.print("Descripción del artículo: ");
            descripcion = Entrada.cadena();

            System.out.print("Precio: ");
            precio = Entrada.real();

            articulos.add(new Articulo(descripcion, precio)); // no reconoce que es Articulo()
        }

        System.out.println("\n=== LISTA DE CLIENTES ===");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("\n=== LISTA DE PROVEEDORES ===");
        for (Proovedor proveedor : proveedores) {
            System.out.println(proveedor);
        }

        System.out.println("\n=== LISTA DE ARTÍCULOS ===");
        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }
    }
}