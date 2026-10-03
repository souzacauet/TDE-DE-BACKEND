public class Principal {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(
            "João",
            20,
            "2026001",
            "Sistemas de Informação"
        );

        aluno1.adicionarNota(8.0);
        aluno1.adicionarNota(7.5);
        aluno1.adicionarNota(9.0);

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.printf("Média: %.2f%n", aluno1.calcularMedia());

        if (aluno1.verificarAprovacao()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}