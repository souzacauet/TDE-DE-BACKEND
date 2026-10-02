public class TesteTempo {

    public static void main(String[] args) {

        // Criando um objeto Tempo
        Tempo tempo = new Tempo(2, 30, 45);

        // Imprimindo o tempo
        System.out.println("Tempo:");
        tempo.imprimirTempo();

        // Mostrando os valores
        System.out.println("Horas: " + tempo.getHoras());
        System.out.println("Minutos: " + tempo.getMinutos());
        System.out.println("Segundos: " + tempo.getSegundos());

        // Calculando os minutos
        System.out.println("Total de minutos: "
                + tempo.calcularMinutos());

        // Calculando os segundos
        System.out.println("Total de segundos: "
                + tempo.calcularSegundos());

        // Alterando os valores
        tempo.setHoras(3);
        tempo.setMinutos(10);
        tempo.setSegundos(20);

        System.out.println("Novo tempo:");
        tempo.imprimirTempo();
    }
}0
