import java.util.*;

/**
 * Classe que confere se a palavra tem anagrama de suas substrings
 */
public class Questao03 {
    /**
     * Método responsável por chamar toda regra de negócio gerando os anagramas e retornando a quantidade de anagramas
     *
     * @param palavra
     * @return total (retorna o total de anagramas que a palavra tem)
     */
    public int temAnagrama(String palavra) {
        HashMap<String, Integer> combinacoes = new HashMap<>();
        String chave;
        char[] substring;
        int valor;
        int total = 0;

        palavra = palavra.trim().toLowerCase(); // Remove os espaços e deixa em minusculo para fins de comparação.


        for (int i = 0; i < palavra.length(); i++) { // itera a palavra criando as sequencias a serem testadas
            for (int j = i; j < palavra.length(); j++) {
                substring = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(substring);
                chave = new String(substring);

                if (combinacoes.containsKey(chave)) { // Verefica se ja existe a sequencia de caracteres
                    combinacoes.put(chave, combinacoes.get(chave) + 1);
                } else { // caso a sequencia não tenha no hashmap ele adiciona
                    combinacoes.put(chave, 1);
                }
            }
        }

        for (String item : combinacoes.keySet()) {
            valor = combinacoes.get(item);
            if (valor > 1) { // caso exista mais de uma sequência igual no hashmap ele adiciona + 1 no total de anagramas.
                total += (valor * (valor - 1)) / 2;
            }
        }


        return total;
    }


}
