import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumarBinarioTest {

    @Test
    void conAcarreo() {
        assertEquals("1011", SumarBinario.sumaBinario("100", "111"));
    }
    @Test
    void tes2() {
        assertEquals("10010", SumarBinario.sumaBinario("1000", "1010"));
    }

}