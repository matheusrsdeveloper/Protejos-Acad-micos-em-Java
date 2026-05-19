public class Conta {
    private int numeroConta;
    private double valorTotal;
    private String tipoCobranca;

    public Conta(int numeroConta, String tipoCobranca) {
        this.numeroConta = numeroConta;
        this.tipoCobranca = tipoCobranca;
        this.valorTotal = 0.0;
    }

    public void adicionarServico(Servico servico) {
        this.valorTotal += servico.calcularPreco();
    }

    public void imprimirConta() {
        System.out.println("Conta N°: " + numeroConta);
        System.out.println("Tipo de Cobrança: " + tipoCobranca);
        System.out.println("Valor Total: R$ " + valorTotal);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTipoCobranca() {
        return tipoCobranca;
    }
}