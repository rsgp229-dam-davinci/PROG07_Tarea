import model.Dni;
import model.Persona;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    Dni dni1, dni2;
    Persona p1, p2;

    @BeforeEach
    void initEach(){
        dni1 = new Dni("97600605J");
        dni2 = new Dni("97600605J");
        p1 = new Persona(dni1);
        p1.setNombre("Antonio");
        p2 = new Persona(dni2);
        p2.setNombre("Felipe");
    }

    @Test
    void testEquals() {
        assertEquals(p1, p2);
    }

    @Test
    void testNotEquals(){
        Dni dni3 = new Dni("64424820A");
        Persona p3 = new Persona(dni3);
        assertNotEquals(p1, p3);
    }

    @Test
    void testHashCode() {
        assertEquals(p1.hashCode(),p2.hashCode());
    }
}