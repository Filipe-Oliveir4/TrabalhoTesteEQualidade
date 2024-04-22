import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class TesteDeAcordoComAmbiente {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testeNoWindows() {
        System.out.println("Teste no Windows");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void testeNoLinux() {
        System.out.println("Teste no Linux");
    }

    @Test
    @EnabledOnOs(OS.MAC)
    public void testeNoMac() {
        System.out.println("Teste no Mac");
    }

}
