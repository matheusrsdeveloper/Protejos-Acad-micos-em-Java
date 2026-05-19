public class ValoresInteiros {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};

        System.out.println("Vetor original:");
        imprimir(numeros);

        selectionSortDecrescente(numeros);

        System.out.println("\nVetor ordenado (Decrescente):");
        imprimir(numeros);
    }

    public static void selectionSortDecrescente(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMaior = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] > vetor[indiceMaior]) {
                    indiceMaior = j;
                }
            }

            int temp = vetor[indiceMaior];
            vetor[indiceMaior] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void imprimir(int[] v) {
        System.out.print("[ ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + (i < v.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }
}