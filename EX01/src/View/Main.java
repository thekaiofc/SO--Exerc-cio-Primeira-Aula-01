package View;

import Controller.Vetor;

public class Main {

    public static void main(String[] args) {

        // Instanciando a classe de controle
        Vetor controller = new Vetor();

        int[] tamanhos = {1000, 10000, 100000};

        // Usando for-each
        for (int tamanho : tamanhos) {

            double tempo = controller.medirTempo(tamanho);

            System.out.println("Tempo para vetor de " + tamanho + " posições: "
                    + tempo + " segundos");
        }
    }
}
