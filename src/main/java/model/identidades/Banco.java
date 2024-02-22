package model.identidades;

import model.cuentas.CuentaBancaria;
import model.cuentas.Iban;

public class Banco {
    //TODO Crear métodos
    private CuentaBancaria[] cuentas = new CuentaBancaria[100];
    private Persona[] clientes = new Persona[100];

    public void abrirCuenta(Persona titular, Iban iban){

    }
    public String[] listadoCuentas(){
        //TODO Este método debe devolver un array con la información del método de la interfaz
    }

    public String informacionCuenta (Iban iban){

    }

    public boolean ingresoCuenta(Iban iban, double amount){

    }

    public boolean retiradaCuenta(Iban iban, double amount){

    }

    public double obtenerSaldo(Iban iban){
        //TODO El ejercicio pide algo extraño. Comprobar una posible mejor manera
    }

}
