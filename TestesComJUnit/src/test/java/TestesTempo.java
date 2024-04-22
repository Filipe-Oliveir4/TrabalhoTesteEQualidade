import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TestesTempo {

    @Test
    @DisplayName("Teste de tempo")
    public void testarTempo() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            Thread.sleep(500);
        });
    }
}
