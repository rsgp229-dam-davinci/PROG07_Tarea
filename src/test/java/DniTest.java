import org.junit.Test;
import static org.junit.Assert.*;
import model.Dni;

public class DniTest {
    @Test
    public void checkStringValids(){
        String[] valids = {"14397906K", "90419521n","84142614N"};
        for (String t : valids){
            assertTrue("Error en la cadena: " + t, Dni.checkDni(t));
        }
    }

    @Test
    public void checkStringInvalids(){
        String[] invalids = {null, "", "0", "00000000A", "84142614F",
                "29529345", "63476738GG"};
        for (String t : invalids){
            assertFalse("Error en la cadena: " + t, Dni.checkDni(t));
        }
    }

    @Test
    public void checkComposedValids(){
        assertTrue(Dni.checkDni(72316122, 'M'));
    }

    @Test
    public void checkComposedInvalids(){
        assertFalse(Dni.checkDni(93294026, 'A'));
        assertFalse(Dni.checkDni(12345678, 'A'));
        assertFalse(Dni.checkDni(-1, 'A'));
        assertFalse(Dni.checkDni(100000000, 'A'));

    }

    @Test
    public void testConstructorValidData(){
        Dni dni = new Dni("11480095J");
    }

    @Test
    public void testConstructorInvalidData(){
        assertThrows(IllegalArgumentException.class, () -> new Dni("24575610"));
    }

    @Test
    public void testValidDataEncodings(){
        Dni dni = new Dni("13353491J");
        assertEquals(13353491, dni.getDniNumber());
        assertEquals('J', dni.getDniLetter());
    }

    @Test
    public void testEquals(){
        Dni dni1 = new Dni("97600605J");
        Dni dni2 = new Dni("97600605J");
        assertTrue(dni1.equals(dni2));
    }
}
