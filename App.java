// Júlia de Lima Becher, Matheus Augusto Canteri, Eduarda Bolgenhagen de Campos e Lorenzo Deboni

public class App {
    public static void main(String[] args) {
        int[] vetor = {3, 6, 8, 1, 4, 9, 0};

        System.out.print("Vetor sem utilizar método de ordenação: ");
        printArray(vetor);

        SelectionSortRecursive sorter = new SelectionSortRecursive();
        sorter.sort(vetor);

        System.out.print("Ordernação utilizando o método de ordenação SelectionSort: ");
        printArray(vetor);

        vetor = new int[]{3, 6, 8, 1, 4, 9, 0};

        BubbleSortRecursive bubble = new BubbleSortRecursive();
        bubble.sort(vetor);

        System.out.println("Ordenação utilizando o método de ordenação BubbleSort: ");
        printArray(vetor);

    }

    public static void printArray(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}