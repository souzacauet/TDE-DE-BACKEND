public class Quarto {

    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean estaOcupado;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.estaOcupado = false;
    }

    public void reservar() {
        if (!estaOcupado) {
            estaOcupado = true;
            System.out.println("Quarto " + numero + " reservado com sucesso.");
        } else {
            System.out.println("O quarto " + numero + " já está ocupado.");
        }
    }

    public void liberar() {
        if (estaOcupado) {
            estaOcupado = false;
            System.out.println("Quarto " + numero + " liberado com sucesso.");
        } else {
            System.out.println("O quarto " + numero + " já está livre.");
        }
    }

    public double calcularValor(int dias) {
        if (dias <= 0) {
            return 0;
        }

        return precoPorNoite * dias;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public boolean isEstaOcupado() {
        return estaOcupado;
    }
}