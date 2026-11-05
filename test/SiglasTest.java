import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiglasTest {

    @Test
    void siglas() {

        assertAll(
                () -> assertEquals("EOI", Siglas.siglas("Escuela Oficial de Idiomas")),
                () -> assertEquals("INE", Siglas.siglas("Instituto Nacional de Estadística"))
        );
    }
}