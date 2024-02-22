package model.cuentas;

import model.Imprimible;
import model.identidades.Persona;

import java.util.Objects;

/**
 * Esta clase representa una cuenta bancaria genérica.
 * Implementa la funcionalidad básica de toda cuenta bancaria:<br>
 *  1.- Todas las cuentas tienen una numeración (IBAN en el caso del ejercicio)<br>
 *  2.- Todas las cuentas tienen un titular<br>
 *  3.- Todas las cuentas tienen un saldo asociado<br>
 *  <hr>
 *  También implementa un método interno para comprobar que el IBAN introducido es correcto
 *  mediante una expresión regular, según se indica en el ejercicio.<br>
 *
 *
 */
public abstract class CuentaBancaria implements Imprimible {

    private Persona titular;
    protected double saldo;
    private Iban iban;

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Iban getIban() {
        return iban;
    }

    public void setIban(Iban iban) {
        this.iban = iban;
    }

    @Override
    public String devolverInfoString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Número de cuenta: ").append(getIban()).append(System.lineSeparator());
        sb.append("Titular: ").append(titular.toString()).append(System.lineSeparator());
        sb.append("Saldo: ").append(getSaldo()).append(System.lineSeparator());
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(iban, that.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }
}
