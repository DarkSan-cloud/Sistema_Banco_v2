import java.util.Scanner;

public class Funcionario extends Cliente {
    // ATRIBUTOS
    private String cargo;
    private Double salario;
    private String beneficios;
    private int opcao;

    Scanner leia = new Scanner(System.in);

    // ENCAPSULAMENTO
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    // METODOS
    @Override
    public void exibirMenu() {
        while (opcao != 5) {
            
            System.out.println("[1] - CADASTRAR");
            System.out.println("[2] - EDITAR");
            System.out.println("[3] - COBRAR");
            System.out.println("[4] - Pagar");
            System.out.println("[5] - Sair");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    Cadastrar();
                    break;
            
                default:
                    break;
            }
        }
    }

    //CADASTRAR
    public void Cadastrar() {
        String nome, cpf,agencia,conta;

        System.out.println("digite o nome: ");
        nome = leia.next();
        setEndereco(nome);

        System.out.println("digite o cpf: ");
        cpf = leia.next();
        setCpf(cpf);
        
        System.out.println("Numero da conta: ");
        conta = leia.next();
        setConta(conta);

        System.out.println("Numero da agencia: ");
        agencia = leia.next();
        setConta(agencia);
        
        System.out.println("Cliente cadastrado com sucesso.\n");
    }
}
