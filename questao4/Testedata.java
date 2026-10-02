public class TesteData {

    public static void main(String[] args) {

        Data data = new Data(10, 5, 2026);

        // Mostrar a data
        data.imprimirData();

        // Mostrar os valores
        System.out.println("Dia: " + data.getDia());
        System.out.println("Mês: " + data.getMes());
        System.out.println("Ano: " + data.getAno());

        // Alterar a data
        data.setDia(20);
        data.setMes(12);

        System.out.println("Nova data:");
        data.imprimirData();

        // Calcular dias até o mês
        int resultado = data.diasAteOMes(10);

        System.out.println("Dias até outubro: " + resultado);
    }
}
