import java.util.Scanner;

public class Cliente extends Pessoa {
    // ATRIBUTOS
    private String conta;
    private Double saldo = 0.0;
    private String agencia;
    private int operacao;
    private String pendencia;

    Scanner leia = new Scanner(System.in);

    // ENCAPSULAMENTO
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public String getPendencia() {
        return pendencia;
    }

    public void setPendencia(String pendencia) {
        this.pendencia = pendencia;
    }

    // METODOS
    // SOBRE CARGA DO METODO PAGAR
    public void pagarSacar() {
        Double sacar;
        System.out.println("Por favor Insira o valor que irá ser sacado.");
        sacar = leia.nextDouble();

        if (saldo > sacar) {
            saldo -= sacar;
            System.out.println("O valor sacado foi de R$" + sacar);
            System.out.println("");
            System.out.println("O saldo foi atualizado para R$" + saldo);
        } else {
            System.out.println("Você não possui nenhuma valor para ser sacado");
            ;
        }

    }

    public void pagarSacar(String benefeciario) {
        Double pagamento;
        System.out.println("POr favor digite o valor que irá ser pago");
        pagamento = leia.nextDouble();

        if (saldo > pagamento) {
            saldo -= pagamento;
            System.out.println("O valor de R$" + pagamento + " foi pago para " + benefeciario);
            System.out.println("O saldo foi atualizado para R$" + saldo);
        } else {
            System.out.println("VOcê não tem saldo suficiente para realizar o pagamento");
        }
    }

    // DEPOSITAR
    public void depositar() {
        Double deposito;

        System.out.println("Insira o valor que será depositado:");
        deposito = leia.nextDouble();
        System.out.println("");
        saldo += deposito;
        System.out.println("O saldo foi atualizado para R$" + saldo);
    }

    // EXIBIR STATUS
    public void tirarExtrato() {
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo.: R$" + saldo);
        System.out.println("Conta.:" + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Telefone: " + getTelefone());

    }

    public void exibirMenu() {
        while (operacao != 5)

        {
            System.out.println("[1] - Depositar");
            System.out.println("[2] - Sacar");
            System.out.println("[3] - Tirar Extrato");
            System.out.println("[4] - Pagar");
            System.out.println("[5] - Sair");

            operacao = leia.nextInt();

            switch (operacao) {
                case 1:
                    depositar();
                    break;
                case 2:
                    pagarSacar();
                    break;
                case 3:
                    tirarExtrato();
                    break;
                case 4:
                    System.out.println("Insira o nome do benefeciario");
                    String benefeciario = leia.next();
                    pagarSacar(benefeciario);
                    break;
                // case 5:
                // System.out.println("Saindo...");
                // break;
                // default:
                // System.out.println("Opção invalida");
                // break;
            }
        }
    }

}
