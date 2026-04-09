package es.tienda.modelos;


public class Proovedor extends Persona {

    tipoProovedor tipoproovedor;

    // Constructor principal
    public Proovedor(String nombre, String apellidos, String dni, tipoProovedor tipoproveedor) {
        super(nombre, apellidos, dni);   // Llama al constructor de Persona
        this.tipoproovedor = tipoproveedor;
    }


    public void darDeAltaProveedor(String nombre, String apellidos, String dni, tipoProovedor tipo) {
        // Asignamos los datos básicos usando los métodos de Persona
        setNombre(nombre);       // si existe setNombre en Persona
        setApellidos(apellidos);
        setDni(dni);
        this.tipoproovedor = tipo;
    }

    // Getter y Setter

    public tipoProovedor getTipoproveedor() {
        return tipoproovedor;
    }

    public void setTipoproveedor(tipoProovedor tipoproveedor) {
        this.tipoproovedor = tipoproveedor;
    }


    @Override
    public void mostrarDatos() {
        super.toString();                    // Muestra nombre, apellidos, dni...
        System.out.println("Tipo de proveedor: " + tipoproovedor);
    }


/*

MI CLASE PRE CORRECCIONES -->

    public Proveedor(String nombre, String apellidos, String dni, tipoProveedor tipo) {
        super(nombre, apellidos, dni);
        this.tipoproveedor = tipo;
    }

    public tipoProovedor llamarServicio() {
        tipoproovedor = tipoProovedor.SERVICIO;
        return tipoproovedor;
    }

    public tipoProovedor llamarRecursos() {
        tipoproovedor = tipoProovedor.RECURSOS;
        return tipoproovedor;
    }

    public tipoProovedor llamarFabricantes() {
        tipoproovedor = tipoProovedor.FABRICANTE;
        return tipoproovedor;
    }

    public void darDeAltaProovedor() {
       tipoproovedor = null;
    }

    @Override
    public void mostrarDatos() {

    }

 */
}
