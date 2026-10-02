public class Data {

    private int mes;
    private int dia;
    private int ano;

    // Construtor
    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    // Getter do mês
    public int getMes() {
        return mes;
    }

    // Setter do mês
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    // Getter do dia
    public int getDia() {
        return dia;
    }

    // Setter do dia
    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    // Getter do ano
    public int getAno() {
        return ano;
    }

    // Setter do ano
    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }

    // Imprimir a data
    public void imprimirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    // Calcular os dias até determinado mês
    public int diasAteOMes(int mes) {

        int total = 0;

        for (int i = 1; i < mes; i++) {

            if (i == 2) {
                total += 28;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                total += 30;
            } else {
                total += 31;
            }
        }

        return total;
    }
}
