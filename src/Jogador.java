// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Jogador {
    public String nome;
    public String posicao;
    public int numeroCamisa;
    public int gols;

    public Jogador() {
    }

    public void marcarGol() {
        gols++;
        System.out.printf("GOOOOL! %s marcou! Total: %d gols.%n", nome, gols);
    }

    public void exibirJogador() {
        System.out.printf("%s: %s | Camisa %d | Gols: %d%n", posicao.equalsIgnoreCase("Goleiro") ? "Goleiro" : "Artilheiro", nome, numeroCamisa, gols);
    }
}
