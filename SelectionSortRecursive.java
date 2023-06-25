// Júlia de Lima Becher, Matheus Augusto Canteri, Eduarda Bolgenhagen de Campos e Lorenzo Deboni

public class SelectionSortRecursive {

    public void sort(int[] vetor) {
        sortRecursive(vetor, 0);
    }

    private void sortRecursive(int[] vetor, int indice) {
        if (indice == vetor.length - 1) {
            return;
        }

        int indiceMinimo = indice;

        // Encontrar o índice do menor elemento no subvetor não ordenado
        for (int i = indice + 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[indiceMinimo]) {
                indiceMinimo = i;
            }
        }

        // Trocar o menor elemento com o primeiro elemento não ordenado
        int temp = vetor[indiceMinimo];
        vetor[indiceMinimo] = vetor[indice];
        vetor[indice] = temp;

        // Ordenar o restante do vetor recursivamente
        sortRecursive(vetor, indice + 1);
    }

}