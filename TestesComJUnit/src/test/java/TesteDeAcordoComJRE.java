import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class TesteDeAcordoComJRE {

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    public void testeNoJRE11() {
        System.out.println("Teste no JRE 11");
    }

    @Test
    @EnabledOnJre(JRE.OTHER)
    public void testeEmOutroJRE() {
        System.out.println("Teste em JRE diferente de 8, 9, 10 ou 11");
    }
}
