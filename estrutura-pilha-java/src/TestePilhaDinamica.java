public class TestePilhaDinamica {
    public static void main(String[] args) {
        PilhaTrabalhador pilha = new PilhaTrabalhador();

        pilha.empilhar(new Trabalhador("Matheus", "Engenheiro"));
        pilha.empilhar(new Trabalhador("Rodrigo", "Designer"));
        pilha.empilhar(new Trabalhador("Jõao", "Gerente"));

        System.out.println("Esvaziando Pilha de Trabalhadores");
        while (!pilha.estaVazia()) {
            System.out.println(pilha.desempilhar());
        }
    }
}