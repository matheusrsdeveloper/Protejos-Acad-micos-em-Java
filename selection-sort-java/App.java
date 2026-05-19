public class App {
    public static void main(String[] args) {
        // Correção 1: Uso de {} para inicializar o array
        int[] vetor = {23, 17, 5, 90, 12, 44, 38, 77};

        // Algoritmo Bubble Sort
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                // Correção 2: Uso de [] para acessar o índice e lógica de comparação
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
            // Chama o método para mostrar o progresso
            imprime(vetor);
        }
    }

    // Correção 3: O método deve estar fora do main
    public static void imprime(int a[]) {
        System.out.println("Vetor atual:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // Use print para ficar na mesma linha
        }
        System.out.println("\n---");
    }
}