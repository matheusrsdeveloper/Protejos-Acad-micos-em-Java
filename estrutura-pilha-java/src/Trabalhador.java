public class Trabalhador {
    String nome;
    String cargo;

    public Trabalhador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Cargo: " + cargo;
    }
}