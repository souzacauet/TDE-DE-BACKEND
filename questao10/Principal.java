public class Principal {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
            "Carlos",
            "Analista",
            3000,
            "001",
            "Tecnologia"
        );

        System.out.println("=== DADOS INICIAIS ===");
        funcionario.exibirDados();

        funcionario.promover("Gerente", 1000);
        funcionario.transferir("Administracao");

        System.out.println();
        System.out.println("=== DADOS APOS ALTERACOES ===");
        funcionario.exibirDados();
    }
}