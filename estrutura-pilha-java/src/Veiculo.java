public class Veiculo {
    String placa;
    String marca;
    String modelo;

    int ano;

    public Veiculo(String placa, String marca, String modelo, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("Placa: %s | %s %s (%d)", placa, marca, modelo, ano);
    }
}
