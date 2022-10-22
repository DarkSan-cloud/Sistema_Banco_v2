import java.util.Scanner;

public class Funcionario extends Cliente {
    // ATRIBUTOS
    private String cargo;
    private Double salario = 0.0;
    private String beneficios;
    private int opcao;
    private String nivelAcesso;

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

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    // METODOS
    @Override
    public void exibirMenu() {
        while (opcao != 5) {

            System.out.println("[1] - CADASTRAR");
            System.out.println("[2] - EDITAR");
            System.out.println("[3] - COBRAR");
            System.out.println("[4] - RECEBER SALARIO");
            System.out.println("[5] - Sair");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    Cadastrar();
                    break;
                case 2:
                    Editar();
                    break;
                case 3:
                    Cobrar();
                    break;
                case 4:
                    Receber();
                    break;
            }
        }
    }

    // CADASTRAR
    public void Cadastrar() {
        String nome, cpf, agencia, conta;

        System.out.println("digite o nome: ");
        nome = leia.next();
        setNome(nome);

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

    // EDITAR
    public void Editar() {
        char op;
        Double subtrair, acrescentar;

        System.out.println("1 - Aumentar Saldo ");
        System.out.println("2 - Diminuir Saldo");
        // System.out.println("3 - Pedir Café");
        System.out.println("3- Atualizar Cadastro");

        op = leia.nextLine().charAt(0);

        switch (op) {

            case '1': // ACRESCENTAR SALDO
                System.out.println("quanto vc quer acrescentar? ");
                acrescentar = leia.nextDouble();
                setSaldo(acrescentar);
                System.out.println("sucesso...");
                break;

            case '2': // SUBTRAIR SALDO
                System.out.println("qual valor vc quer subtrair? ");
                subtrair = leia.nextDouble();
                setSaldo(subtrair);
                System.out.println("sucesso...");
                break;

            case '3': // PEDIR CAFE

                System.out.println("Aqui' está o seu café.");

                break;

            case '4': // ATAUALIZAR CADASTRO

                System.out.println(" funçaõ ainda em desenvolvimento...\n");

                break;

        }

    }

    // RECEBER SALARIO
    public void Receber() {
        salario += 2000.00;
        System.out.println(" seu saldo atual é de: " + salario + "\n");
    }

    // COBRAR
    public void Cobrar() {
        Double valor;
        System.out.println("valor da cobrança: ");
        valor = leia.nextDouble();
        setPendencia(getPendencia() + valor);
        System.out.println("Cobrança enviada, seu cliente a recebera em breve.\n");
    }
}
