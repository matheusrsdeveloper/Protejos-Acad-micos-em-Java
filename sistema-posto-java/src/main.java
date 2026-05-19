import java.util.Scanner;

public class Main {                            
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);  

        System.out.println("Cadastro de Cliente");
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite o Telefone: ");
        String telefone = sc.nextLine();
        System.out.println("Digite o Endereço: ");
        String endereco = sc.nextLine();      
        Cliente cliente = new Cliente(nome, cpf, telefone, endereco, false);

        System.out.println("Escolha o serviço");
        System.out.println("1 - Combustivel (100)");
        System.out.println("2 - Lavagem (50)");
        System.out.println("3 - Estacionamento R (30)");
        System.out.println("4 - Estacionamento M (150)");

        int opcao = sc.nextInt();
        Servico servico = null;

        switch (opcao) {
            case 1:
                servico = new Servico("Combustivel", 100, opcao);
                break;
            case 2:
                servico = new Servico("Lavagem", 50, opcao);
                break;
            case 3:
                servico = new Servico("Rotativo", 30, opcao);
                break;
            case 4:
                servico = new Servico("Mensal", 150, opcao);
                break;
            default:
                System.out.println("Opção Invalida!");
                return;                          // return deve vir antes do break (ou no lugar dele)
        }

        System.out.println("Deseja desconto? (s/n):");
        sc.nextLine();
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("S")) {
            System.out.println("Valor do desconto:");
            double desconto = sc.nextDouble();   // nexDouble → nextDouble
            servico.aplicarDesconto(desconto);
        }

        System.out.println("Tipo de Cobrança:");
        System.out.println("1 - Automatica:");
        System.out.println("2 - Mensal:");
        int tipo = sc.nextInt();
        String tipoCobranca = (tipo == 2) ? "Mensal" : "Automatica";
        Conta conta = new Conta(1, tipoCobranca);
        conta.adicionarServico(servico);
        conta.imprimirConta();

        System.out.println("Informar o pagamento");
        System.out.println("1 - Avista");
        System.out.println("2 - Pix");
        System.out.println("3 - Cartão");
        System.out.println("4 - Debito automatico");

        int pag = sc.nextInt();
        if (pag == 4) {
            System.out.println("Dados Bancarios");
        }

        sc.close();
    }
}