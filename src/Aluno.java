// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Aluno {
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;

    public Aluno() {
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public boolean aprovado() {
        return calcularMedia() >= 6.0;
    }

    public void exibirBoletim() {
        System.out.printf("Aluno: %s | Matrícula: %s%n", nome, matricula);
        System.out.printf("Nota 1: %.1f | Nota 2: %.1f%n", nota1, nota2);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.printf("Situação: %s%n", aprovado() ? "APROVADO" : "REPROVADO");
    }
}
