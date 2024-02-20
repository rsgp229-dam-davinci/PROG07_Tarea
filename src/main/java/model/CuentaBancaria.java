package model;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
public abstract class CuentaBancaria implements Imprimible{

    private Persona titular;
    protected double saldo;
    private String IBAN;
    private final String IBAN_REGEX ="^(ES)([0-9]{18}$)";

    private final Pattern IBAN_pattern = Pattern.compile(IBAN_REGEX);
    private boolean isValidIBAN (String input){
        Matcher m = IBAN_pattern.matcher(input);
        return m.matches();
    }

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

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public String devolverInfoString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Número de cuenta: ").append(getIBAN()).append(System.lineSeparator());
        sb.append("Titular: ").append(titular.toString()).append(System.lineSeparator());
        sb.append("Saldo: ").append(getSaldo()).append(System.lineSeparator());
        return sb.toString();
    }
}
