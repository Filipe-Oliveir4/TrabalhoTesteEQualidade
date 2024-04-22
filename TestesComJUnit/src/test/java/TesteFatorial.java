import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteFatorial {

    @DisplayName("Testa fatorial de número positivo")
    @Test
    void testFatorialPositivo() {
        Fatorial fat = new Fatorial();
        int resultado = fat.fatorial(5);
        assertEquals(120, resultado);
    }

    @DisplayName("Testa fatorial de zero")
    @Test
    void testFatorialZero() {
        Fatorial fat = new Fatorial();
        int resultado = fat.fatorial(0);
        assertEquals(1, resultado);
    }

    @DisplayName("Testa fatorial de número negativo")
    @Test
    void testFatorialNegativo() {
        Fatorial fat = new Fatorial();
        int resultado = fat.fatorial(-5);
        assertEquals(-1, resultado);
    }

    @DisplayName("Testa fatorial recursiva de número positivo")
    @Test
    void testFatorialRecursivaPositivo() {
        Fatorial fat = new Fatorial();
        int resultado = fat.fatorialRecursiva(5);
        assertEquals(120, resultado);
    }

    @DisplayName("Testa fatorial recursiva de zero")
    @Test
    void testFatorialRecursivaZero() {
        Fatorial fat = new Fatorial();
        int resultado = fat.fatorialRecursiva(0);
        assertEquals(1, resultado);
    }

    @DisplayName("Testa fatorial recursiva de número negativo")
    @Test
    void testFatorialRecursivaNegativo() {
        Fatorial fat = new Fatorial();
        int resultado = fat.fatorialRecursiva(-5);
        assertEquals(-1, resultado);

    }
}
