package pilhaencadeadav02;

public class Veiculo {
      private String placa, marca;
      private int ano;
      private float quilometragem;

    public Veiculo(String placa, String marca, int ano, float quilometragem) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "placa: " + placa + "\n"
                + "marca: " + marca + "\n"
                + "ano: " + ano + "\n"
                + "quilometragem: " + quilometragem;
    }

 
}
