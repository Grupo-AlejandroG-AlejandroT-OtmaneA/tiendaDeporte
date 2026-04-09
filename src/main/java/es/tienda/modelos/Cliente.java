package es.tienda.modelos;

public class Cliente extends Persona {

        private TipoCliente tipoCliente;

        public Cliente() {
            super();
        }

    @Override
    public void mostrarDatos() {

    }

    public Cliente(String nombre, String dni, TipoCliente tipoCliente) {
            super(nombre,dni);
            this.tipoCliente = tipoCliente;
        }

        public void darDeAlta() {
            System.out.println("El cliente " + getNombre() + " con DNI " + getDni() + " ha sido dado de alta como " + tipoCliente);
        }

        public TipoCliente getTipoCliente() {
            return tipoCliente;
        }

        public void setTipoCliente(TipoCliente tipoCliente) {
            this.tipoCliente = tipoCliente;
        }



}
