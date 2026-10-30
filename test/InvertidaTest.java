import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InvertidaTest {

    @Test
    void invertir() {
        String frase = "Esto es una frase";
        assertEquals("frase una es Esto ", Invertida.invertir(frase));
    }
}
