

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Questao01Tests {

    @Test
    @DisplayName("Desafio 1 - Retorna Escada de 6 linhas com  asteriscos")
    public void retornaEscadaCom6Linhas (){
        Questao01 questao01 =new Questao01();
        assertEquals("     *\n    **\n   ***\n  ****\n *****\n******\n",questao01.contruirEscada(6));

    }

    @Test
    @DisplayName("Desafio 1 - Retorna Escada de 7 linhas com  asteriscos")
    public void retornaEscadaCom7Linhas (){
        Questao01 questao01 =new Questao01();
        assertEquals("      *\n     **\n    ***\n   ****\n  *****\n ******\n*******\n",questao01.contruirEscada(7));

    }


}
