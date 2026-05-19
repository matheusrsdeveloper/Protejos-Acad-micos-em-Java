package pilhaencadeadav02;

public class Caminhao extends Veiculo {
    private int qteixos;
    private float cargaMaxima;

    public Caminhao(String placa, String marca, int ano, float quilometragem, int qteixos, float cargaMaxima) {
        super(placa, marca, ano, quilometragem); // Chama o construtor da classe pai (Veiculo)
        this.qteixos = qteixos;
        this.cargaMaxima = cargaMaxima;
    }

    public int getQteixos() {
        return qteixos;
    }

    public void setQteixos(int qteixos) {
        this.qteixos = qteixos;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String toString() {
        return "Caminhao: "
                + super.toString() + "\n"
                + "qteixos: " + qteixos + "\n"
                + "cargaMaxima: " + cargaMaxima;
    }
}

