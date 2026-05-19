public class OrdenarTextos {
    public static void main(String[] args) {
        // Vetores fornecidos
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        String pessoas[] = {"Pedro", "Valéria", "Ana", "Luiz", "Zoe", "Miguel"};

        System.out.println("ORDENAÇÃO DE PAÍSES");
        bubbleSort(paises);
        imprimirVetor(paises);

        System.out.println("\nORDENAÇÃO DE PESSOAS");
        bubbleSort(pessoas);
        imprimirVetor(pessoas);
    }

    /**
     * Método Bubble Sort adaptado para Strings.
     */
    public static void bubbleSort(String[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Se o retorno de compareTo for > 0, significa que vetor[j] 
                // vem depois de vetor[j+1] alfabeticamente.
                if (vetor[j].compareTo(vetor[j + 1]) > 0) {
                    // Troca de posição (Swap)
                    String temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirVetor(String[] vetor) {
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + (i < vetor.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }
}