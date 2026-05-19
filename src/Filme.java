// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Filme {
    public String titulo;
    public String diretor;
    public int anoLancamento;
    public int duracao;
    public double nota;

    public Filme() {
    }

    public String duracaoFormatada() {
        int horas = duracao / 60;
        int minutos = duracao % 60;
        return String.format("%dh %dm", horas, minutos);
    }

    public boolean recomendado() {
        return nota >= 7.0;
    }

    public void exibirDetalhes() {
        System.out.printf("Título: %s (%d)%n", titulo, anoLancamento);
        System.out.printf("Diretor: %s%n", diretor);
        System.out.printf("Duração: %s%n", duracaoFormatada());
        System.out.printf("Nota: %.1f ★%n", nota);
        System.out.printf("Recomendado: %s%n", recomendado() ? "SIM" : "NÃO");
    }
}
