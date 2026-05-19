
public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private boolean cadastro;

    public Cliente(String nome, String cpf, String telefone, String endereco, boolean cadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cadastro = cadastro;
    }

    public boolean isCadastrado() {
        return cadastro;
    }

    public String getNome() {
        return nome;
    }

    public boolean listaCadastro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listaCadastro'");
    }
}