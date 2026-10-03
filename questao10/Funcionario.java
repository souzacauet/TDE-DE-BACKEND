public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private String matricula;
    private String departamento;

    public Funcionario(String nome, String cargo, double salario, String matricula, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public void promover(String novoCargo, double aumento) {
        this.cargo = novoCargo;
        this.salario += aumento;
    }

    public void transferir(String novoDepartamento) {
        this.departamento = novoDepartamento;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Matricula: " + matricula);
        System.out.println("Departamento: " + departamento);
    }
}