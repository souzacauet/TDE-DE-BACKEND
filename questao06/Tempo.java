public class Tempo {

    private int hora;

    public Tempo() {
        hora = 0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int diferencaHoras(Tempo entrada) {
        return this.hora - entrada.getHora();
    }
}