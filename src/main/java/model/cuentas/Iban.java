package model.cuentas;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Iban {
    private final static String IBAN_REGEX ="^(ES)[0-9]{22}$";
    private final static Pattern IBAN_pattern = Pattern.compile(IBAN_REGEX);
    private String iban;
    public Iban (String iban) throws IllegalArgumentException{
        if (isValidIBAN(iban)){
            this.iban = iban;
        } else throw new IllegalArgumentException("El número del IBAN no es válido");
    }
    public static boolean isValidIBAN (String input){
        Matcher m = IBAN_pattern.matcher(input);
        return m.matches();
    }
    public String getIbanNumber() {
        return new String(iban);
    }

    @Override
    public String toString() {
        return "IBAN: " + iban + System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iban iban1 = (Iban) o;
        return Objects.equals(iban, iban1.iban);
    }
    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }
}
