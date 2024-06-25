package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra,contagem);
    }

    public void removerPalavra(String palavra) {
        if(!palavras.isEmpty()) {
            palavras.remove(palavra.trim());
        } else {
            System.out.println("O Map está vazio.");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for(int contagem : palavras.values()) {
            contagemTotal += contagem;

        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if(entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);

        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        System.out.println("A linguagem mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
