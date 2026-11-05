import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramaTest {

    @Test
    void esAnagrama() {
        assertAll(
                () -> assertTrue(Anagrama.esAnagrama("alma", "lama")),
                () -> assertFalse(Anagrama.esAnagrama("alma", "lamas")),
                () -> assertFalse(Anagrama.esAnagrama("alma", "mola"))
        );
    }
}