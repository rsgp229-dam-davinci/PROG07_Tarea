package model;

/**
 * Clase que representa una entidad autorizada al cobro.
 *
 * La clase es inmutable. Como se pide en el ejercicio que se ejecute en entornos Java11 no se utiliza Record.
 */
public class EntidadAutorizada {
    private String nombreEntidad;
    public EntidadAutorizada(String nombreEntidad) throws IllegalArgumentException {
        if (nombreEntidad == null || nombreEntidad.isEmpty())
            throw new IllegalArgumentException("El nombre de la nueva entidad no puede ser null ni estar vacío.");
        this.nombreEntidad = nombreEntidad;
    }
    public String getNombreEntidad() { return nombreEntidad; }
}