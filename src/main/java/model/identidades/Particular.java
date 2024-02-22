package model.identidades;
public class Particular extends Cliente{
    public Particular(String dni) throws IllegalArgumentException{
        setDocumento(dni);
    }
    private String apellidos;
    public String getApellidos() {
        if (apellidos == null)
            return "";
        else
            return apellidos;
    }
    public void setApellidos(String apellidos) {
        if (apellidos == null)
            this.apellidos = "";
        else
            this.apellidos = apellidos;
    }
    @Override
    public String devolverInfoString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(getNombre()).append(System.lineSeparator());
        sb.append("Apellidos: ").append(getApellidos()).append(System.lineSeparator());
        sb.append("NIF: ").append(getDocumento()).append(System.lineSeparator());
        return sb.toString();
    }
}