package es.tienda.modelos;

import java.util.ArrayList;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Proovedor> proveedores = new ArrayList<>();
        ArrayList<Articulo> articulos = new ArrayList<>();

        String nombre, apellidos, dni, codigo, descripcion;
        double precio;

        // --- SECCIÓN CLIENTES (4) ---
        System.out.println("=== INTRODUCIR DATOS DE 4 CLIENTES ===");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nCliente nº " + (i + 1));
            System.out.print("Nombre: ");
            nombre = Entrada.cadena();
            System.out.print("Apellidos: ");
            apellidos = Entrada.cadena();
            System.out.print("DNI: ");
            dni = Entrada.cadena();

            Cliente nuevoCliente = new Cliente(nombre, apellidos, dni, TipoCliente.NUEVO);
            clientes.add(nuevoCliente);
        }

        // --- SECCIÓN PROVEEDORES (3) ---
        System.out.println("\n=== INTRODUCIR DATOS DE 3 PROVEEDORES ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nProveedor nº " + (i + 1));
            System.out.print("Nombre: ");
            nombre = Entrada.cadena();
            System.out.print("Apellidos: ");
            apellidos = Entrada.cadena();
            System.out.print("DNI: ");
            dni = Entrada.cadena();

            Proovedor nuevoProv = new Proovedor(nombre, apellidos, dni, tipoProovedor.FABRICANTE);
            proveedores.add(nuevoProv);
        }

        // --- SECCIÓN ARTÍCULOS (2) ---
        System.out.println("\n=== INTRODUCIR DATOS DE 2 ARTÍCULOS ===");
        for (int i = 0; i < 2; i++) {
            System.out.println("\nArtículo nº " + (i + 1));
            System.out.print("Código: ");
            codigo = Entrada.cadena();
            System.out.print("Descripción: ");
            descripcion = Entrada.cadena();
            System.out.print("Precio: ");
            precio = Entrada.real();

            Articulo nuevoArt = new Articulo(codigo, descripcion, precio);
            articulos.add(nuevoArt);
        }

        // --- VISUALIZACIÓN DE DATOS ---
        System.out.println("\n\n************************************");
        System.out.println("   RESUMEN DE DATOS INTRODUCIDOS");
        System.out.println("************************************");

        System.out.println("\n--- LISTA DE CLIENTES ---");
        for (Cliente c : clientes) {
            c.mostrarDatos();
            System.out.println("-----------------------");
        }

        System.out.println("\n--- LISTA DE PROVEEDORES ---");
        for (Proovedor p : proveedores) {
            p.mostrarDatos();
            System.out.println("-----------------------");
        }

        System.out.println("\n--- LISTA DE ARTÍCULOS ---");
        for (Articulo a : articulos) {
            a.VisualizarDatos();
            System.out.println("-----------------------");
        }
    }
}