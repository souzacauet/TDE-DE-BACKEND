public class Principal {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("Toyota", "Corolla", 2024, "Preto");
        Veiculo veiculo2 = new Veiculo("Honda", "Civic", 2023, "Branco");

        System.out.println("=== VEICULO 1 ===");
        veiculo1.exibirDados();

        System.out.println();

        System.out.println("=== VEICULO 2 ===");
        veiculo2.exibirDados();

        System.out.println();
        System.out.println("=== TESTE DOS GETTERS ===");

        System.out.println("Marca: " + veiculo1.getMarca());
        System.out.println("Modelo: " + veiculo1.getModelo());
        System.out.println("Ano: " + veiculo1.getAno());
        System.out.println("Cor: " + veiculo1.getCor());
    }
}
