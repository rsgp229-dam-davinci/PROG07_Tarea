package model.identidades;

import model.cuentas.CuentaBancaria;
import model.cuentas.Iban;

public class Banco {
    private CuentaBancaria[] cuentas = new CuentaBancaria[100];

    public boolean abrirCuenta(CuentaBancaria nuevaCuenta){
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
                cuentas[i] = nuevaCuenta;
                return true;
            }
        }
        return false;
    }

    public String[] listadoCuentas(){
        String[] infoCuentas = new String[cuentas.length];
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                infoCuentas[i] = cuentas[i].devolverInfoString();
            }
        }
        return infoCuentas;
    }

    public String informacionCuenta (Iban iban){
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta != null && cuenta.getIban().equals(iban)) {
                return cuenta.devolverInfoString();
            }
        }
        return null;
    }

    public boolean ingresoCuenta(Iban iban, double amount){
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta != null && cuenta.getIban().equals(iban)) {
                cuenta.addSaldo(amount);
                return true;
            }
        }
        return false;
    }

    public boolean retiradaCuenta(Iban iban, double amount){
        for (CuentaBancaria cuenta : cuentas){
            if (cuenta != null && cuenta.getIban().equals(iban)) {
                return cuenta.substractSaldo(amount);
            }
        }
        return false;
    }

    public double obtenerSaldo(Iban iban) throws IllegalArgumentException{
        if (iban != null){
            for (CuentaBancaria cuenta : cuentas) {
                if (cuenta != null && cuenta.getIban().equals(iban)) {
                    return cuenta.getSaldo();
                }
            }
        }
        return 0.0;
    }

    public boolean existeCuenta(Iban iban){
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta != null && cuenta.getIban().equals(iban)) {
                return true;
            }
        }
        return false;
    }

}
