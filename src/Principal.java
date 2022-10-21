import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao;

        // INSTANCIANDO OBJETOS
        Scanner leia = new Scanner(System.in);
        Cliente c = new Cliente();
        Funcionario f = new Funcionario();
        do {
            System.out.println("Escolher modo de acesso: ");
            System.out.println("[1] - Acessar como Cliente");
            System.out.println("[2] - Acessar como Funcionário");
            System.out.println("[3] - Acessar como Gerente");
            System.out.println("[4] - Sair");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    c.exibirMenu();
                    break;
                case 2:
                    f.exibirMenu();
                    break;
                default:
                    break;
            }

        } while (opcao != 4);
    }

}
