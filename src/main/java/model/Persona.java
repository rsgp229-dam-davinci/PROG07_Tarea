package model;

import java.util.Objects;

/**
 * La clase Persona corresponde con un cliente de la entidad.
 *
 * El DNI de la persona es inmutable.
 *
 * @author RSG-P
 */
public class Persona implements Imprimible{
    private String nombre;
    private String apellidos;
    private Dni dni;

    public Persona(Dni dni){
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Dni getDni() {
        return dni;
    }

    /**
     * Devuelve la información de la persona formateada en varias líneas. Para una única línea utilizar el método toString()
     * @return Información de la persona formateada en 3 líneas.
     */
    @Override
    public String devolverInfoString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre);
        sb.append("\nApellidos: ").append(apellidos);
        sb.append("\nDNI: ").append(dni);
        return sb.toString();
    }

    /**
     *
     * @return Nombre apellidos y DNI en una única línea.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(" ").append(apellidos).append(", DNI ").append(dni);
        return sb.toString();
    }

    /**
     * La comparación de una persona es su DNI, ya que es el único dato unívoco.
     * @param o La persona a comparar para igualdad
     * @return Devuelve si la persona es la misma o no <strong>basándose en su DNI.</strong>
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
