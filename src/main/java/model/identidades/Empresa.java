package model.identidades;

public class Empresa extends Cliente{
    @Override
    public String devolverInfoString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.getNombre()).append(System.lineSeparator());
        sb.append("CIF: ").append(this.getDocumento()).append(System.lineSeparator());
        return sb.toString();
    }
}
