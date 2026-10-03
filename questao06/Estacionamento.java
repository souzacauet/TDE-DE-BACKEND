public class Estacionamento {

    private String placa;
    private String modelo;
    private Tempo entrada;
    private Tempo saida;

    public Estacionamento() {
        placa = "";
        modelo = "";
        entrada = new Tempo();
        saida = new Tempo();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tempo getEntrada() {
        return entrada;
    }

    public Tempo getSaida() {
        return saida;
    }

    public void imprimir() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Hora de entrada: " + entrada.getHora());
        System.out.println("Hora de saída: " + saida.getHora());
    }

    public double calcularValor() {
        int horas = saida.diferencaHoras(entrada);
        return horas * 1.50;
    }
}