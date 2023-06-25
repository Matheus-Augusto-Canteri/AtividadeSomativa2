// Júlia de Lima Becher, Matheus Augusto Canteri, Eduarda Bolgenhagen de Campos e Lorenzo Deboni

public class BubbleSortRecursive {
    public void sort(int[] vetor) {
        bubbleSortRecursive(vetor, vetor.length);
    }

    public static void bubbleSortRecursive(int[] vetor, int indice) {
        // Verifica se chegamos ao final do vetor (caso base para encerrar a recursão)
        if (indice == 0) {
            return;
        }

        // Percorre o vetor comparando elementos adjacentes e fazendo a troca se necessário
        for (int i = 0; i < indice - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                int temp = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = temp;
            }
        }

        // Chama recursivamente o Bubble Sort para o restante do vetor
        bubbleSortRecursive(vetor, indice - 1);
    }
}