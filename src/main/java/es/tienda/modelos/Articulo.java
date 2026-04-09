package es.tienda.modelos;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precio;

    public Articulo() {
    }

    public Articulo(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void altaArticulo(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void VisualizarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio);
    }
}