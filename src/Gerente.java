public class Gerente extends Funcionario {
    // ATRIBUTOS
    private String sala;
    private int opcao;

    // ENCAPSULAMENTO
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    // METODOS
    // CONTRATAR
    public void Contratar() {
        String nome, cpf, cargo, beneficios, nivelAcesso;
        Double salario;

        System.out.println("nome?");
        nome = leia.next();
        setNome(nome);

        System.out.println("Cpf?");
        cpf = leia.next();
        setCpf(cpf);

        System.out.println("cargo?");
        cargo = leia.next();
        setCargo(cargo);

        System.out.println("salario?");
        salario = leia.nextDouble();
        setSalario(salario);

        System.out.println("beneficios?");
        beneficios = leia.next();
        setBeneficios(beneficios);

        System.out.println("nivel de acesso?");
        nivelAcesso = leia.next();
        setNivelAcesso(nivelAcesso);

        System.out.println("funcionario contratado com sucesso.\n" +
                "nome: " + getNome() + "\n" +
                "Cpf: " + getCpf() + "\n" +
                "Cargo: " + getCargo() + "\n" +
                "Salario:" + getSalario() + "\n" +
                "Beneficios: " + getBeneficios() + "\n" +
                "nivel d acesso: " + getNivelAcesso() + "\n");

    }

    // DEMITIR
    public void Demitir() {
        String nome;

        System.out.println("digite o nome do funcionario que será demitido: ");
        nome = leia.next();

        System.out.println("O " + nome + " Será chamado no setor RH ao final de seu espediente.\n");

    }

    // PEDIR CAFE
    public void Cafe() {
        System.out.println("aqui está o seu café.\n");
    }

    // PROMOVER
    public void Promover() {
        String nome, nivel;

        System.out.println("Considerano o nivel de acesso vai de 1 a 3");
        System.out.println("Digite o nome de quem será promovido: ");
        nome = leia.next();

        System.out.println("Digite o nivel de acesso que deseja ateibuir a ele: ");
        nivel = leia.next();
        setNivelAcesso(nivel);

        System.out.println(
                "nivel de acesso promovido com sucesso, seu nivel atual de " + nome + " é " + getNivelAcesso());

    }

    // MENU
    @Override
    public void exibirMenu() {
        while (opcao != 5) {
            System.out.println("[1] - CONTRATAR");
            System.out.println("[2] - DEMITIR");
            System.out.println("[3] - PEDIR CAFÉ");
            System.out.println("[4] - PROMOVER");
            System.out.println("[5] - SAIR");

            opcao = leia.nextInt();
            switch (opcao) {
                case 1:
                    Contratar();
                    break;
                case 2:
                    Demitir();
                    break;
                case 3:
                    Cafe();
                    break;
                case 4:
                    Promover();
                    break;
               
            }
        }
    }

}
