package es.tienda.modelos;

public enum tipoProovedor {
    SERVICIO("Servicio"),
    RECURSOS("Recursos"),
    FABRICANTE("Fabricante");

    private final String elemento;

    private tipoProovedor (String elemento) {
        this.elemento = elemento;
    }


    @Override
    public String toString() {
        return String.format(elemento);
    }
}


