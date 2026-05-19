import java.util.ArrayList;

public class Posto {                                      // posto → Posto
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Servico> servicos = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarServico(Servico servico) {       // static removido, ç → c
        servicos.add(servico);
    }
}