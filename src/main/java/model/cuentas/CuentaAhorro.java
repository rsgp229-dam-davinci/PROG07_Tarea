package model.cuentas;

import model.identidades.Particular;

public class CuentaAhorro extends CuentaBancaria{
    private double interesRemuneracion;

    public CuentaAhorro (Iban iban, Particular cliente){
        super.setIban(iban);
        super.setTitular(cliente);
    }

    public double getInteresRemuneracion() {
        return interesRemuneracion;
    }

    public void setInteresRemuneracion(double interesRemuneracion) {
        this.interesRemuneracion = interesRemuneracion;
    }

    @Override
    public boolean substractSaldo(double cantidad) {
        if (cantidad <= getSaldo()){
            saldo -= cantidad;
            return true;
        } else return false;
    }

    @Override
    public String devolverInfoString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.devolverInfoString());
        sb.append("Interés de Remuneración: ").append(interesRemuneracion).append(System.lineSeparator());
        return sb.toString();
    }
}
