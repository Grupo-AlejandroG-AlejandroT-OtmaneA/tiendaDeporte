package es.tienda.modelos;

public class Cliente extends Persona {

    private TipoCliente tipoCliente;

    // Constructor vacío
    public Cliente() {
        super();
    }

    // Constructor con parámetros
    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        super(nombre, apellidos, dni);
        this.tipoCliente = tipoCliente;
    }

    // Getters y Setters
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    // Método obligatorio de Persona
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo de cliente: " + tipoCliente);
    }

    // Método para dar de alta un cliente
    public void altaCliente() {
        System.out.println("Cliente dado de alta:");
        mostrarDatos();
    }
}