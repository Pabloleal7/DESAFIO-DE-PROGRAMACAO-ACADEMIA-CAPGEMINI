import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class Questao03Tests {




    @Test
    @DisplayName("Desafio 3 - Anagrama teste com a palavra ovo")
    public void testaAnagramaDaPalavraOvo(){
        Questao03 questao03 = new Questao03();
        assertEquals(2,questao03.temAnagrama("ovo"));

    }

    @Test
    @DisplayName("Desafio 3 - Anagrama teste com a palavra ifailuhkqq")
    public void testaAnagramaDaPalavraifailuhkqq(){
        Questao03 questao03 = new Questao03();
        assertEquals(3,questao03.temAnagrama("ifailuhkqq"
        ));

    }
}
