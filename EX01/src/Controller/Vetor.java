package Controller;

public class Vetor {

    // Construtor da classe
    public Vetor() {
        super();
    }

    // Metodo que cria o vetor, preenche com 0 e mede o tempo
    public double medirTempo(int tamanho) {

        int[] vetor = new int[tamanho];

        // Preenchendo todas as posições com 0
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = 0;
        }

        // Marca o tempo inicial
        long inicio = System.nanoTime();

        // Percorrendo o vetor
        for (int i = 0; i < tamanho; i++) {
            int valor = vetor[i];
        }

        // Tempo final
        long fim = System.nanoTime();

        long tempoNano = fim - inicio;

        // Conversao para segundos
        double tempoSegundos = tempoNano / 1_000_000_000.0;

        return tempoSegundos;
    }
}