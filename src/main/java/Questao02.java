
/** Clase para validar senha segura*/
public class Questao02 {


    public StringBuilder caracteresAusentes; // objeto que armazena os tipos de caracteres faltantes


/**Método que valida a senha
 * @param senha
 * @return int. (Retorna um número inteiro representando a quantidade de caracteres que faltam para se uma senha segura)
 * */
    public int validarSenha(String senha) { // método que valida a senha

        caracteresAusentes = new StringBuilder();// limpa os caracteres ausentes caso queira validar outra senha usando o mesmo objeto.


        if(senha.length() < 6 ){   // verifica se a senha tem o tamanho menor que 6, se verdadeiro então executa as validações abaixo.
            temMinusculo(senha);
            temMaiusculo(senha);
            temNumeros(senha);
            temCaractersEspeciais(senha);
            if (caracteresAusentes.length() == 0){
                System.out.println("Faltam " + (6 - senha.length()) + " caracteres");
                return  6 - senha.length() ;
            }{
                System.out.println("Faltam " +( 6 - senha.length() ) + " caracteres, voce deve adicionar pelo menos 1 de cada um desses caracteres: " + caracteresAusentes);
                return  6 - senha.length() ;
            }


        }else if(!temMinusculo(senha) | !temMaiusculo(senha) | !temNumeros(senha) | !temCaractersEspeciais(senha)){
            System.out.println("Você deve complementar sua senha com caracteres desse tipo:" + caracteresAusentes);
            return caracteresAusentes.length();
        }

        System.out.println("Senha valida");


        return caracteresAusentes.length() ;

    }

/**Metodo que valida se a senha tem alguma letra minuscula
 * @param senha
 * @return Boolean (Retorna um Boleando como true caso a senha tenha alguma letra minuscula e false caso não tenha)
* */
    private Boolean temMinusculo(String senha) {// método que verifica que a senha contem caracteres do tipo letra minuscula
        boolean result = senha.matches("(.*)[a-z](.*)");
        if (result) {
            return true;
        } else {
            caracteresAusentes.append("a");
            return false;
        }
    }

    /**Metodo que valida se a senha tenha alguma letra maiuscula
     * @param senha
     * @return Boolean (Retorna um Boleando como true caso a senha tenha alguma letra minuscula e false caso não tenha)
     * */
    private Boolean temMaiusculo(String senha) { // método que verifica que a senha contem caracteres do tipo letra maiuscula
        boolean result = senha.matches("(.*)[A-Z](.*)");
        if (result) {
            return true;
        } else {
            caracteresAusentes.append("A");
            return false;
        }
    }

    /**Metodo que valida se a senha tenha algum número
     * @param senha
     * @return Boolean (Retorna um Boleando como true caso a senha tenha algum número e false caso não tenha)
     * */
    private Boolean temNumeros(String senha) {// método que verifica que a senha contem caracteres do tipo numérico
        boolean result = senha.matches("(.*)[0-9](.*)");
        if (result) {
            return true;
        } else {
            caracteresAusentes.append("1");
            return false;
        }
    }


    /**Metodo que valida se a senha tenha algum caractere especial
     * @param senha
     * @return Boolean (Retorna um Boleando como true caso a senha tenha algum caractere especial e false caso não tenha)
     * */
    private Boolean temCaractersEspeciais(String senha) { // método que verifica que a senha contem caracteres especiais
        boolean result = senha.matches("(.*)[!@#$%^&()+-](.*)");
        if (result) {
            return true;
        } else {
            caracteresAusentes.append("@");
            return false;
        }
    }


}
