public class Principal {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1, "João");
        ContaBancaria conta2 = new ContaBancaria(2, "Maria");

        conta1.depositar(1000);
        conta1.sacar(200);

        conta2.depositar(500);
        conta2.sacar(100);

        System.out.println("Conta de " + conta1.getTitular());
        System.out.println("Saldo: R$ " + conta1.getSaldo());

        System.out.println();

        System.out.println("Conta de " + conta2.getTitular());
        System.out.println("Saldo: R$ " + conta2.getSaldo());
    }
}