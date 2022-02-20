import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Questao02Tests {

    @Test
    @DisplayName("Desafio 2 - Testar Segurança da senha faltando 3 tipos de caracteres")
    public void senhaComApenasNumeros(){
        Questao02 test1 = new Questao02();
        assertEquals(3,test1.validarSenha("123456"));

    }

    @Test
    @DisplayName("Desafio 2 - Testar Segurança da senha faltando 2 tipos de caracteres")
    public void senhaComNumerosEMinusculo(){
        Questao02 test2 = new Questao02();
        assertEquals(2,test2.validarSenha("123a"));

    }

    @Test
    @DisplayName("Desafio 2 - Testar Segurança da senha faltando caractere especial")
    public void senhaFaltandoCaractereEspecial(){
        Questao02 test3 = new Questao02();
        assertEquals(1,test3.validarSenha("123aA"));

    }

    @Test
    @DisplayName("Desafio 2 - Testar Senha totalmente valida")
    public void senhaValida(){
        Questao02 test4 = new Questao02();
        assertEquals(0,test4.validarSenha("mECon7r@ta"));

    }
    @Test
    @DisplayName("Desafio 2 - Testar Senha invalida com menos que 6 caracteres")
    public void senhaInvalidaComMenosQue6Caracters(){
        Questao02 test4 = new Questao02();
        assertEquals(2,test4.validarSenha("M@1s"));

    }

}
