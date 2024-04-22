import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ObjetoSingletonTeste {

    @Test
    @DisplayName("Testa se a instância é única")
    void testObjetoSingleton() {
        ObjetoSingleton obj1 = ObjetoSingleton.getInstance();
        ObjetoSingleton obj2 = ObjetoSingleton.getInstance();
        assertSame(obj1, obj2);
    }
}
