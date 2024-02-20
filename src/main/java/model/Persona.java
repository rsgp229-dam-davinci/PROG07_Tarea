package model;

public class Persona implements Imprimible{
    private String nombre;
    private String apellidos;
    private Dni dni;

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
}
