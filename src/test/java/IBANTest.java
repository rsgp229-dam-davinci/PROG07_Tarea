import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IBANTest {
    private final String IBAN_REGEX ="^(ES)([0-9]{18}$)";

    @Test
    public void checkIBAN(){
        String IBAN_REGEX ="^(ES)([0-9]{18}$)";
        Pattern p = Pattern.compile(IBAN_REGEX);
        Matcher m = p.matcher("ES121234123412341234");
        assertTrue(m.matches(), "Fallo en: ");
    }

    @Test
    public void checkBadIBAN(){
        String IBAN_REGEX ="^(ES)([0-9]{18}$)";
        Pattern p = Pattern.compile(IBAN_REGEX);
        Matcher m = p.matcher("ES12123412341234123");
        assertFalse(m.matches());
        m = p.matcher("S121234123412341234");
        assertFalse(m.matches());
        m = p.matcher("ES12123412341234123");
        assertFalse(m.matches());
    }
}
