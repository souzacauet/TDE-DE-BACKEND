public class Data {

    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }
  

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }

    public void imprimirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

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


public class TesteData {

    public static void main(String[] args) {

        Data data = new Data(10, 5, 2026);

        System.out.println("Data:");
        data.imprimirData();

        System.out.println("Dia: " + data.getDia());
        System.out.println("Mes: " + data.getMes());
        System.out.println("Ano: " + data.getAno());

        data.setDia(20);
        data.setMes(12);
        data.setAno(2026);

        System.out.println("Nova data:");
        data.imprimirData();

        int resultado = data.diasAteOMes(10);

        System.out.println("Dias ate outubro: " + resultado);
    }
}
