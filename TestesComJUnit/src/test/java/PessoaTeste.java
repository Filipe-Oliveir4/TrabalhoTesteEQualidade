import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTeste {

    Pessoa pessoa;
    @BeforeEach
    void setup(){
        pessoa = new Pessoa("João", "Silva", 30, 1.80, 80, false);
    }

    @Test
    void testeObjetoPessoa(){
        assertAll(
            () -> assertEquals("João", pessoa.getNome()),
            () -> assertEquals("Silva", pessoa.getSobrenome()),
            () -> assertEquals(30, pessoa.getIdade()),
            () -> assertEquals(1.80, pessoa.getAltura()),
            () -> assertEquals(80, pessoa.getPeso()),
            () -> assertFalse(pessoa.isFumante())
        );
    }

    @Test
    void testeFazerAniversario(){
        int idade = pessoa.getIdade();
        pessoa.fazerAniversario();
        assertEquals(idade+1, pessoa.getIdade());
    }
}
