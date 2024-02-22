package model.identidades;

import model.Imprimible;
import java.util.Objects;

public abstract class Cliente implements Imprimible {
    private String nombre;
    private String documento;

    public String getNombre() {
        if (nombre == null) return "";
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "";
    }

    public String getDocumento() {
        return documento;
    }

    protected void setDocumento(String documento) throws IllegalArgumentException{
        if (documento == null || documento.isEmpty())
            throw  new IllegalArgumentException("El documento no puede ser null ni estar vacío");
        this.documento = documento.trim().toUpperCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(documento, cliente.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
}
