public class NotaFiscal {

    private String numeroPeca;
    private String descricaoPeca;
    private int quantidadeComprada;
    private double preco;

    public NotaFiscal() {
        numeroPeca = "";
        descricaoPeca = "";
        quantidadeComprada = 0;
        preco = 0.0;
    }

    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotalNota() {
        return quantidadeComprada * preco;
    }
}