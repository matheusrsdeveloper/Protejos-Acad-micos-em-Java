public class DadosBancarios {
    private int numeroBanco;
    private int agencia;
    private int contaCorrente;

    public DadosBancarios(int numeroBanco, int agencia, int contaCorrente) {
        this.numeroBanco = numeroBanco;
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
    }

    public void validarDadosBancarios() {
        System.out.println("Dados bancários validados com sucesso!");
    }

    public int getNumeroBanco() { return numeroBanco; }
    public int getAgencia() { return agencia; }
    public int getContaCorrente() { return contaCorrente; }
}