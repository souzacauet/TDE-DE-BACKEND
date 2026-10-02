public class Tempo {

    private int horas;
    private int minutos;
    private int segundos;

    // Construtor
    public Tempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Getter das horas
    public int getHoras() {
        return horas;
    }

    // Setter das horas
    public void setHoras(int horas) {
        this.horas = horas;
    }

    // Getter dos minutos
    public int getMinutos() {
        return minutos;
    }

    // Setter dos minutos
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    // Getter dos segundos
    public int getSegundos() {
        return segundos;
    }

    // Setter dos segundos
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    // Imprimir o tempo
    public void imprimirTempo() {
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

    // Calcular quantidade de minutos
    public int calcularMinutos() {
        return (horas * 60) + minutos;
    }

    // Calcular quantidade de segundos
    public int calcularSegundos() {
        return (horas * 3600) + (minutos * 60) + segundos;
    }
}

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
}
