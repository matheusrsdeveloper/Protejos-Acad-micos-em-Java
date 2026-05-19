public class DebitoAutomatico {
    private Cliente cliente;
    private DadosBancarios dados;

    public DebitoAutomatico(Cliente cliente, DadosBancarios dados) { // ponto e vírgula removido
        this.cliente = cliente;
        this.dados = dados;
    }

    public void realizarDebito(double valor) {
        if (cliente.listaCadastro()) {
            dados.validarDadosBancarios();                            // vaidar → validar
            System.out.println("Debito automatico realizado no valor de R$" + valor); // err → out
        } else {
            System.out.println("Cliente não cadastrado..");
        }
    }
}