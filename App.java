public class App {
    public static void main(String[] args) {
        int[] vetor = {3, 6, 8, 1, 4, 9, 0};

        System.out.print("Vetor sem utilizar método de ordenação: ");
        printArray(vetor);

        SelectionSortRecursive sorter = new SelectionSortRecursive();
        sorter.sort(vetor);

        System.out.print("Ordernação utilizando o método de ordenação Selectionsort: ");
        printArray(vetor);
    }

    public static void printArray(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}