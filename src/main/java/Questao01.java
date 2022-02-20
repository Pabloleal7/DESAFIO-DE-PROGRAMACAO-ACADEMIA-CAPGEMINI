/**Classe para construir escada de asteriscos*/
public class Questao01 {
    StringBuilder sb;
    /**Metodo que constroi a escada de asteriscos
    * @param quantidadeDeLinhas ex 6
     * @return   String com a escada de asteriscos
    * */
    public String contruirEscada(int quantidadeDeLinhas) {
        sb = new StringBuilder();

        for (int i = 1; i <= quantidadeDeLinhas; i++) {  // Loop que gera a quantidade de linhas asteriscos e espaco em branco.
            int qntEspaco = quantidadeDeLinhas - i; //Define a quantidade de espaços em branco
            String espacoEmBranco = " ".repeat(qntEspaco); //Gera os espaços em braco
            String asterisco = "*".repeat(i); // Gera os asteriscos

            /* Junta os espacos em branco e os asteriscos.*/
            sb.append(espacoEmBranco)
                    .append(asterisco)
                    .append("\n");

        }
        return sb.toString(); // Retorna uma string com a escada.


    }

}
