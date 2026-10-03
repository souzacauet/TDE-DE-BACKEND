public class Principal {

    public static void main(String[] args) {

        Quarto quarto1 = new Quarto(101, "simples", 150.00);

        System.out.println("Número do quarto: " + quarto1.getNumero());
        System.out.println("Tipo: " + quarto1.getTipo());
        System.out.printf("Preço por noite: R$ %.2f%n",
                quarto1.getPrecoPorNoite());

        System.out.println();

        quarto1.reservar();

        int dias = 4;

        double valorTotal = quarto1.calcularValor(dias);

        System.out.println("Quantidade de dias: " + dias);
        System.out.printf("Valor total da estadia: R$ %.2f%n", valorTotal);

        System.out.println();

        quarto1.liberar();

        System.out.println("Quarto ocupado? "
                + (quarto1.isEstaOcupado() ? "Sim" : "Não"));
    }
}