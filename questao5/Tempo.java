public class Tempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void imprimirTempo() {
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

    public int calcularMinutos() {
        return (horas * 60) + minutos;
    }

    public int calcularSegundos() {
        return (horas * 3600) + (minutos * 60) + segundos;
    }
}

public class TesteTempo {

    public static void main(String[] args) {

        Tempo tempo = new Tempo(2, 30, 45);

        System.out.println("Tempo:");
        tempo.imprimirTempo();

        System.out.println("Horas: " + tempo.getHoras());
        System.out.println("Minutos: " + tempo.getMinutos());
        System.out.println("Segundos: " + tempo.getSegundos());

        System.out.println("Total de minutos: "
                + tempo.calcularMinutos());

        System.out.println("Total de segundos: "
                + tempo.calcularSegundos());

        tempo.setHoras(3);
        tempo.setMinutos(10);
        tempo.setSegundos(20);

        System.out.println("Novo tempo:");
        tempo.imprimirTempo();
    }
}
