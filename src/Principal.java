import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao;

        // INSTANCIANDO OBJETOS
        Scanner leia = new Scanner(System.in);
        Cliente c = new Cliente();
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        // INFORMAÇÔES
        c.setAgencia("12234");
        c.setConta("1213143");
        c.setCpf("00201313131");
        c.setEmail("oreiudo@gamil.com");
        c.setEndereco("Rua torta");
        c.setUf("Pr");
        c.setTelefone("123131313131");
        c.setNome("Zoiudo");

       
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
                case 3:
                g.exibirMenu();

            }

        } while (opcao != 4);
        leia.close();
    }

}
