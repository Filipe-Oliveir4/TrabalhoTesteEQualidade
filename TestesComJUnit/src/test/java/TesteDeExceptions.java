import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TesteDeExceptions {

    @Test
    @DisplayName("Teste de exceção")
    public void testarExcecao() {
        assertThrows(java.lang.ArithmeticException.class, () -> {
            int i = 1 / 0;
        });
    }
}
