import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class EdadTest {
    Edad e=new Edad(0, null, 0);
    @Test
    void testComprobarEdad() {
        assertFalse(e.comprobarEdad(21));
    }
}
