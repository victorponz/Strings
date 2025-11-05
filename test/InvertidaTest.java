import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InvertidaTest {

    @Test
    void invertir() {
        String frase = "Esto es una frase";
        String[] palabras = Utilidades.dividirEnPalabras(frase);
        //Fíjate que acaba en un blanco
        assertEquals("frase una es Esto ", Invertida.invertir(palabras));
    }
}